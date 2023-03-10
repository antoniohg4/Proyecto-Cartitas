package controlador;

import java.sql.*;
import java.util.ArrayList;
import modelo.Carta;
import modelo.EnumRegiones;

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
                "`IdColeccion` int(11) NOT NULL,\n"+
                "`IdCarta` int(11) NOT NULL,\n"+
                "`IdUsuario` int(11) NOT NULL,\n"+
                "`NombreCarta` varchar(30) NOT NULL,\n"+
                "PRIMARY KEY (`IdColeccion`),\n"+
                "UNIQUE KEY `IdUsuario` (`IdUsuario`) USING BTREE,\n"+
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
            int numColumnas = rs.getMetaData().getColumnCount();
            boolean hayFilas=false;
            if (rs.next()) {
                System.out.println("Ya existen cartas dentro");
            } else{
                st=con.createStatement();
                sql="INSERT INTO\n"+
                    "cartas(idCarta,nombre,descripcion,ataque,vida,rareza,url_imagen)\n"+
                    "VALUES\n"+
                    "(1,'Rey','Larga vida al rey... O no.',1,4,3,'src/resources/img/rey_card.png'),\n"+
                    "(2,'Reina','Mi padre quería unir los reinos.',4,1,3,'src/resources/img/reina_card.png'),\n"+
                    "(3,'Bufón','Tener contento al castillo es importante.',2,7,1,'src/resources/img/bufon_card.png'),\n"+
                    "(4,'Payaso','La plebe necesita entretenimiento.',2,6,1,'src/resources/img/payaso_card.png'),\n"+
                    "(5,'Caballero','Defender y morir por el reino.',7,9,2,'src/resources/img/caballero_card.png'),\n"+
                    "(6,'Verdugo','Los malhechores deben ser castigados',7,4,2,'src/resources/img/verdugo_card.png'),\n"+
                    "(7,'Granjero','No me pises lo sembrado.',3,5,1,'src/resources/img/granjero_card.png'),\n"+
                    "(8,'Herrero','Esa espada está un poco mellada.',6,6,1,'src/resources/img/herrero_card.png'),\n"+
                    "(9,'Sacerdote','Por la fe de Dios.',1,7,1,'src/resources/img/sacerdote_card.png'),\n"+
                    "(10,'Cultista','¿Niños raptados? Pregunta al sacerdote.',8,6,1,'src/resources/img/cultista_card.png'),\n"+
                    "(11,'Ángel','Hay que combatir el mal.',6,7,2,'src/resources/img/angel_card.png'),\n"+
                    "(12,'Demonio','Ser malo es divertido',7,6,2,'src/resources/img/demonio_card.png'),\n"+
                    "(13,'Mago','El conocimiento es poder.',9,2,2,'src/resources/img/mago_card.png'),\n"+
                    "(14,'Druida','Sí, aquel oso era yo',8,8,2,'src/resources/img/druida_card.png'),\n"+
                    "(15,'Alquimista','¿Quieres una poción de la risa?',4,7,1,'src/resources/img/alquimista_card.png'),\n"+
                    "(16,'Cazador','Solía ser un caballero, pero una flecha me dio en la rodilla.',7,5,1,'src/resources/img/cazador.png'),\n"+
                    "(17,'Pirata','La X me trajo hasta aquí',5,3,1,'src/resources/img/pirata_card.png'),\n"+
                    "(18,'Elfo','¿Por qué vivir si no es para amar?',3,10,3,'src/resources/img/elfo_card.png'),\n"+
                    "(19,'Orco','¡Tiempo de matar!',10,7,3,'src/resources/img/orco_card.png'),\n"+
                    "(20,'Viajero del Tiempo','Pues sí que todo esto era campo...',10,10,4,'src/resources/img/viajero_card.png');\n";
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
            
            con.setAutoCommit(true); //Si no está esta línea, no funciona (por algun motivo se ralla que flipas con el executeUpdate y el autocommit false)
            
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
    static ArrayList<Carta> obtenerTodasLasCartas() {
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
        try {
            PreparedStatement st = con.prepareStatement("UPDATE mpt_db.usuario SET Monedas = Monedas - 100 WHERE Nombre = ?;");
            st.setString(1, nombreUsuario);

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
}
