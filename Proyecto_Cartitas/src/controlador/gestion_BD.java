package controlador;

import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Carta;

/**
 *
 * @author DAM-2
 */
public class gestion_BD {
    private static final int PRECIO_SOBRE = 100;
    private static final int MONEDAS_BASE = 1000;
    static Connection con = null;
    
    /**
     * Crea la conexion a la BD y establece autoCommit a false
     */
    public static void crearConexion(){
        try {                                       
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/", "root", "");
            con.setAutoCommit(false);
            System.out.println("Conexion creada");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }//crearConexion
    
    /**
     * Crea la Base de Datos
     */
    public static void creacionBD(){
        Statement st;
        String sql;
        try {
            st=con.createStatement();
            sql="CREATE DATABASE IF NOT EXISTS `mpt_db` CHARACTER SET utf8;\n";
            st.execute(sql);
            
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mpt_db", "root", "");
            con.setAutoCommit(false);
            
            st=con.createStatement();
            
            /*sql="USE mpt_db;";
            st.execute(sql);*/
            
            st.clearBatch();

            //Importante los " IF NOT EXISTS " porque si no va a tirar excepciones
            sql="CREATE TABLE IF NOT EXISTS `cartas` (\n"+
                "`IdCarta` int(11) NOT NULL,\n"+
                "`Nombre` varchar(30) NOT NULL,\n"+
                "`Ataque` int(11) NOT NULL,\n"+
                "`Vida` int(11) NOT NULL,\n"+
                "`Descripcion` varchar(150) NOT NULL,\n"+
                "`Rareza` int(11) NOT NULL,\n"+
                "`URL_Imagen` varchar(250) NOT NULL,\n"+
                "PRIMARY KEY (`IdCarta`)\n"+
                ") ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;\n";
            st.addBatch(sql);

            sql="CREATE TABLE IF NOT EXISTS `usuario` (\n"+
                "`IdUsuario` int(11) NOT NULL AUTO_INCREMENT ,\n"+
                "`Nombre` varchar(30) NOT NULL UNIQUE,\n"+
                "`Pwd` varchar(30) NOT NULL,\n"+
                "`Edad` int(11) NOT NULL,\n"+
                "`Monedas` int(11) NOT NULL,\n"+
                "`Region` varchar(6) NOT NULL,\n"+
                "PRIMARY KEY (`IdUsuario`)\n"+
                ") ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;";
            st.addBatch(sql);

            sql="CREATE TABLE IF NOT EXISTS `coleccion` (\n"+
                "`IdCarta` int(11) NOT NULL,\n"+
                "`IdUsuario` int(11) NOT NULL,\n"+
                "`NombreCarta` varchar(30) NOT NULL,\n"+
                "KEY `IdCarta` (`IdCarta`),\n"+
                "CONSTRAINT `coleccion_FK` FOREIGN KEY (`IdCarta`) REFERENCES `cartas` (`IdCarta`),\n"+
                "CONSTRAINT `coleccion_FK_1` FOREIGN KEY (`IdUsuario`) REFERENCES `usuario` (`IdUsuario`)\n"+
                ") ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;\n";
            st.addBatch(sql);

            int [] numUpdates=st.executeBatch();
			for (int i = 0; i < numUpdates.length; i++) {
				if (numUpdates[i] == Statement.EXECUTE_FAILED) {
					System.out.println("Execution " + i + ": FAILED");
				} else {
					System.out.println("Execution " + i + " successful: " + numUpdates[i] + " rows updated");
				}
			}
            con.commit();
            //cerramos el statement este.
            st.close();

        } catch (SQLException e) {
            e.printStackTrace();
            try {
                con.rollback();
                System.out.println("Rollback realizado");
            }catch(SQLException re) {
                re.printStackTrace();
                System.out.println("Error realizando Rollback");
            }
        }
    }//creacionBD

    /**
     * Inserta las 20 cartas del juego
     */
    public static void insertsCartas(){
        Statement st;
        String sql;
        try {
            
            sql="SELECT idCarta FROM cartas;";
            st=con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if (rs.next()) {
                System.out.println("Ya existen cartas dentro");
            } else{
                st=con.createStatement();
                sql="INSERT INTO\n"+
                    "cartas(idCarta,nombre,descripcion,ataque,vida,rareza,url_imagen)\n"+
                    "VALUES\n"+
                    "(1,'Rey','Larga vida al rey... O no.',1,4,3,'/resources/img/rey_card.png'),\n"+
                    "(2,'Reina','Mi padre quer??a unir los reinos.',4,1,3,'/resources/img/reina_card.png'),\n"+
                    "(3,'Buf??n','Tener contento al castillo es importante.',2,7,1,'/resources/img/bufon_card.png'),\n"+
                    "(4,'Payaso','La plebe necesita entretenimiento.',2,6,1,'/resources/img/payaso_card.png'),\n"+
                    "(5,'Caballero','Defender y morir por el reino.',7,9,2,'/resources/img/caballero_card.png'),\n"+
                    "(6,'Verdugo','Los malhechores deben ser castigados',7,4,2,'/resources/img/verdugo_card.png'),\n"+
                    "(7,'Granjero','No me pises lo sembrado.',3,5,1,'/resources/img/granjero_card.png'),\n"+
                    "(8,'Herrero','Esa espada est?? un poco mellada.',6,6,1,'/resources/img/herrero_card.png'),\n"+
                    "(9,'Sacerdote','Por la fe de Dios.',1,7,1,'/resources/img/sacerdote_card.png'),\n"+
                    "(10,'Cultista','??Ni??os raptados? Pregunta al sacerdote.',8,6,1,'/resources/img/cultista_card.png'),\n"+
                    "(11,'??ngel','Hay que combatir el mal.',6,7,2,'/resources/img/angel_card.png'),\n"+
                    "(12,'Demonio','Ser malo es divertido',7,6,2,'/resources/img/demonio_card.png'),\n"+
                    "(13,'Mago','El conocimiento es poder.',9,2,2,'/resources/img/mago_card.png'),\n"+
                    "(14,'Druida','S??, aquel oso era yo',8,8,2,'/resources/img/druida_card.png'),\n"+
                    "(15,'Alquimista','??Quieres una poci??n de la risa?',4,7,1,'/resources/img/alquimista_card.png'),\n"+
                    "(16,'Cazador','Sol??a ser un caballero, pero una flecha me dio en la rodilla.',7,5,1,'/resources/img/cazador_card.png'),\n"+
                    "(17,'Pirata','La X me trajo hasta aqu??',5,3,1,'/resources/img/pirata_card.png'),\n"+
                    "(18,'Elfo','??Por qu?? vivir si no es para amar?',3,10,3,'/resources/img/elfo_card.png'),\n"+
                    "(19,'Orco','??Tiempo de matar!',10,7,3,'/resources/img/orco_card.png'),\n"+
                    "(20,'Viajero del Tiempo','Pues s?? que todo esto era campo...',10,10,4,'/resources/img/viajero_card.png');\n";
                st.addBatch(sql);
                
                int [] numUpdates=st.executeBatch();
                for (int i = 0; i < numUpdates.length; i++) {
                        if (numUpdates[i] == Statement.EXECUTE_FAILED) {
                                System.out.println("Execution " + i + ": FAILED");
                        } else {
                                System.out.println("Execution " + i + "successful: " + numUpdates[i] + " rows updated");
                        }
                }
            }
            con.commit();
            //cerramos el statement este.
            st.close();
        } catch (SQLException e) {
            e.printStackTrace();
            try {
                con.rollback();
                System.out.println("Rollback realizado");
            }catch(SQLException re) {
                re.printStackTrace();
                System.out.println("Error realizando Rollback");
            } 
        }
    }//insertsCartas

    
    public static void insertsUsuarios(){
        Statement st;
        String sql;
        try {
            
            sql="SELECT idCarta FROM cartas;";

            st=con.createStatement();
            sql="INSERT INTO `usuario` (`IdUsuario`, `Nombre`, `Pwd`, `Edad`, `Monedas`, `Region`) VALUES\n" +
                "(1, '123', '123', 123, 969500, 'EUW'),\n" +
                "(2, 'DAshen', 'a', 15, 500, 'EUW'),\n" +
                "(3, 'Alvaricow', 'Chupamela', 26, -1, 'EUW'),\n" +
                "(6, 'Faker', 'pass', 25, 8000, 'KOR'),\n" +
                "(7, 'AntonioHG_4', 'GoticasCulonasFTW', 14, 700, 'EUW'),\n" +
                "(8, 'RafaelBETI', '23-04-2022CopaDelRey', 41, 1000000, 'EUW'),\n" +
                "(9, 'Dmitry', 'Vodka', 47, 1000, 'EUNE'),\n" +
                "(10, 'WillElTortasSmith', 'ChrisRockSlayer', 54, 4500, 'NA'),\n" +
                "(11, 'GuillermoDelToro', 'terrorenyoyer', 58, 560000, 'LATAM'),\n" +
                "(12, 'BrandonSanderson', 'LeanElArchivoNoMassss', 47, 16000, 'NA'),\n" +
                "(13, 'XiJinping', 'shina', 69, 400, 'CHI'),\n" +
                "(14, 'Eiichir?? Oda', 'una_Pieza', 48, 1, 'JAP'),\n" +
                "(15, 'PrincipeNigeriano', 'siMeDas500BitCoinsTeHagoRico', 30, 10000, 'AFR'),\n" +
                "(16, 'HughLoganJackman', 'AgujaDinamica', 54, 70000, 'OCE');";
            st.addBatch(sql);

            int [] numUpdates=st.executeBatch();
            for (int i = 0; i < numUpdates.length; i++) {
                    if (numUpdates[i] == Statement.EXECUTE_FAILED) {
                            System.out.println("Execution " + i + ": FAILED");
                    } else {
                            System.out.println("Execution " + i + "successful: " + numUpdates[i] + " rows updated");
                    }
            }
            
            con.commit();
            //cerramos el statement este.
            st.close();
        } catch (SQLException e) {
            e.printStackTrace();
            try {
                con.rollback();
                System.out.println("Rollback realizado");
            }catch(SQLException re) {
                re.printStackTrace();
                System.out.println("Error realizando Rollback");
            } 
        }
    }//insertsUsuarios
    
    
    public static void insertsColeccion(){
        Statement st;
        String sql;
        try {
            
            sql="SELECT idCarta FROM cartas;";

            st=con.createStatement();
            sql="INSERT INTO `coleccion` (`IdCarta`, `IdUsuario`, `NombreCarta`) VALUES\n" +
                "(1, 1, 'Rey'),\n" +
                "(4, 1, 'Payaso'),\n" +
                "(8, 1, 'Herrero'),\n" +
                "(17, 1, 'Pirata'),\n" +
                "(7, 1, 'Granjero'),\n" +
                "(15, 1, 'Alquimista'),\n" +
                "(16, 1, 'Cazador'),\n" +
                "(3, 1, 'Buf??n'),\n" +
                "(9, 1, 'Sacerdote'),\n" +
                "(10, 1, 'Cultista'),\n" +
                "(12, 1, 'Demonio'),\n" +
                "(13, 1, 'Mago'),\n" +
                "(5, 1, 'Caballero'),\n" +
                "(2, 1, 'Reina'),\n" +
                "(19, 1, 'Orco'),\n" +
                "(11, 1, '??ngel'),\n" +
                "(6, 1, 'Verdugo'),\n" +
                "(14, 1, 'Druida'),\n" +
                "(18, 1, 'Elfo'),\n" +
                "(20, 1, 'Viajero del Tiempo');";
            st.addBatch(sql);

            int [] numUpdates=st.executeBatch();
            for (int i = 0; i < numUpdates.length; i++) {
                    if (numUpdates[i] == Statement.EXECUTE_FAILED) {
                            System.out.println("Execution " + i + ": FAILED");
                    } else {
                            System.out.println("Execution " + i + "successful: " + numUpdates[i] + " rows updated");
                    }
            }
            
            con.commit();
            //cerramos el statement este.
            st.close();
        } catch (SQLException e) {
            e.printStackTrace();
            try {
                con.rollback();
                System.out.println("Rollback realizado");
            }catch(SQLException re) {
                re.printStackTrace();
                System.out.println("Error realizando Rollback");
            } 
        }
    }//insertsColeccion
    
    
    
    
    /**
     * Cierra la conexion a la BD
     */
    public void cerrarConexion(){
        try {
            con.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }//cerrarConexion
    
    /**
     * Comprueba si existe un usuario, y si no, muestra la ventana de registro
     */
    public static boolean iniciarSesion(String nombre, String pwd){
        boolean inicioSesion = false;
        try {
            PreparedStatement pst = con.prepareStatement("SELECT Pwd FROM usuario WHERE nombre = ?");
            
            pst.setString(1, nombre);
            
            ResultSet rs = pst.executeQuery();
            
            while (rs.next()) {
                if (rs.getString("pwd").equals(pwd)) {
                    inicioSesion = true;
                }
            }
            con.commit();
        } catch (SQLException e) {
        }
        return inicioSesion;
    }//iniciarSesion
    
    /**
     * Da de alta un nuevo usuario
     */
    public static boolean altaUsuario(String nombre, String pwd, int edad, String reg){
        System.out.println("Alta usuario");
        boolean registrado = false;
        try {
            System.out.println(con.getMetaData().getDatabaseProductName());
            PreparedStatement pst = con.prepareStatement("INSERT INTO mpt_db.usuario (Nombre, Pwd, Edad, Monedas, Region) VALUES (?, ?, ?, ?, ?)");
            
            pst.setString(1, nombre);
            pst.setString(2, pwd);
            pst.setInt(3, edad);
            pst.setInt(4, MONEDAS_BASE);
            pst.setString(5, reg);
            System.out.println(pst.toString());
            
            con.setAutoCommit(true); //Si no est?? esta l??nea, no funciona (por algun motivo se ralla que flipas con el executeUpdate y el autocommit false)
            
            int ejecutado = pst.executeUpdate();
            System.out.println(ejecutado);
            if (ejecutado == 1) {
                registrado = true;
                System.out.println("DEBERIA INSERTAR");
            }
            
            con.setAutoCommit(false);
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return registrado;
    }//altaUsuario
    
    /**
     * 
     * @return 
     */
    public static ArrayList<Carta> getColeccionCartas(String nombreJugador){
        ArrayList<Carta> listaCartas = new ArrayList<Carta>();
        
        try {
            PreparedStatement st = con.prepareStatement("SELECT * FROM cartas JOIN coleccion USING(IdCarta) WHERE IdUsuario = (SELECT IdUsuario FROM usuario WHERE Nombre = ?) ");
            st.setString(1, nombreJugador);
            
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                  Carta c = new Carta(rs.getInt("idCarta"), rs.getString("Nombre"), rs.getString("Descripcion"),
                                    rs.getInt("Ataque"), rs.getInt("Vida"), rs.getInt("Rareza"), rs.getString("URL_Imagen"));

                  listaCartas.add(c);
              }
            con.commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return listaCartas;
    }//getColeccionCartas
    
    
    /**
     * 
     * @return 
     */
    public static ArrayList<Carta> obtenerTodasLasCartas() {
        ArrayList<Carta> listaTodasCartas = new ArrayList<Carta>();
        try {
            Statement st = con.createStatement();
            
            ResultSet rs = st.executeQuery("SELECT * FROM cartas");
            
            while(rs.next()){
                Carta c = new Carta(rs.getInt("idCarta"), rs.getString("Nombre"), 
                              rs.getString("Descripcion"),
                                  rs.getInt("Ataque"), rs.getInt("Vida"), 
                                 rs.getInt("Rareza"), rs.getString("URL_Imagen"));

                listaTodasCartas.add(c);
            }
            con.commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return listaTodasCartas;
    }//obtenerTodasLasCartas
    
    public static boolean comprar(String nombreUsuario){
        
        boolean hecho = false;
        System.out.println("ENTRA EN COMPRAR");//TODO QUITAR ESTE PRINT DE TESTEO
        try {
            PreparedStatement st = con.prepareStatement("UPDATE mpt_db.usuario SET Monedas = Monedas - (?) WHERE Nombre = (?);");
            st.setInt(1, PRECIO_SOBRE);
            st.setString(2, nombreUsuario);

            int rs = st.executeUpdate();
            
            if (rs == 1) { //Si se actualiza
                hecho = true;
            }
            
            con.commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return hecho;
    }
    
    public static int obtenerCantidadMonedas(String nombreUsuario){
        int cantidadMonedas = 0;
        try {
            PreparedStatement st = con.prepareStatement("SELECT Monedas FROM usuario WHERE Nombre = ?");
            st.setString(1, nombreUsuario);
            
            ResultSet rs = st.executeQuery();
            while(rs.next()){
               cantidadMonedas = rs.getInt("Monedas");
            }
            con.commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return cantidadMonedas;
    }
    
    public static void anadirCartasAColeccion(ArrayList<Carta> listaCartasSobre, String nombreUsuario) {
        for (int i = 0; i < listaCartasSobre.toArray().length; i++) {
            if (!comprobarCarta(listaCartasSobre.get(i), nombreUsuario)) {
                try {
                    PreparedStatement pst = con.prepareStatement("INSERT INTO coleccion (IdCarta, IdUsuario, NombreCarta) VALUES (?, ?, ?)");

                    pst.setInt(1, listaCartasSobre.get(i).getId()); //IdCarta
                    pst.setInt(2, obtenerIdUsuario(nombreUsuario)); //IdUsuario
                    pst.setString(3, listaCartasSobre.get(i).getNombre()); //NombreCarta

                    if (pst.executeUpdate() == 1) {
                        System.out.println("Update realizado. Carta a??adida");  
                    }else{
                        System.out.println("Update no realizado. Carta no a??adida"); 
                    }
                    con.commit();
                } catch (SQLException ex) {
                    Logger.getLogger(gestion_BD.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
    
    public static boolean comprobarCarta(Carta c, String nombreUsuario){
        String sql = "SELECT idCarta FROM coleccion c JOIN usuario u using(idUsuario) where u.Nombre = ?";
        boolean existeCarta = false;
        try {
            PreparedStatement pst = con.prepareStatement(sql);
            
            pst.setString(1, nombreUsuario);
            
            ResultSet rs = pst.executeQuery();
            
            while (rs.next()) {
                if (rs.getInt("IdCarta") == c.getId()) {
                    existeCarta = true;
                }
            }
               
        } catch (SQLException ex) {
            Logger.getLogger(gestion_BD.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return existeCarta;
    }
    
    
     private static int obtenerIdUsuario(String nombreUsuario) {
        String sql = "SELECT IdUsuario FROM usuario where Nombre = ?";
        int idUsuario = 0;
        try {
            PreparedStatement pst = con.prepareStatement(sql);
            
            pst.setString(1, nombreUsuario);
            
            ResultSet rs = pst.executeQuery();
            
            while (rs.next()) {
                idUsuario = rs.getInt("IdUsuario");
            }
               
        } catch (SQLException ex) {
            Logger.getLogger(gestion_BD.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return idUsuario;
        
    }
    
    
}
