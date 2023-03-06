import java.sql.*;

public class CargaDB {
    public void CreacionBD(Connection con){
        Statement st;
        String sql;
        try {
            st=con.createStatement();
            sql="CREATE DATABASE IF NOT EXISTS `mpt_db` CHARACTER SET utf8;\n";
            st.addBatch(sql);

            sql="CREATE TABLE `cartas` (\n"+
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

            sql="CREATE TABLE `usuario` (\n"+
                "`IdUsuario` int(11) NOT NULL,\n"+
                "`Nombre` varchar(30) NOT NULL,\n"+
                "`Pwd` varchar(30) NOT NULL,\n"+
                "`Edad` int(11) NOT NULL,\n"+
                "`Monedas` int(11) NOT NULL,\n"+
                "`Region` varchar(6) NOT NULL,\n"+
                "PRIMARY KEY (`IdUsuario`)\n"+
              ") ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;\n";
            st.addBatch(sql);

            sql="CREATE TABLE `coleccion` (\n"+
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
				if (numUpdates[i] == Statement.SUCCESS_NO_INFO) {
					System.out.println("Execution " + i + ": unknown number of rows updated");
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
    }

    public void InsertsCartas(Connection con){
        Statement st;
        String sql;
        try {
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
				if (numUpdates[i] == Statement.SUCCESS_NO_INFO) {
					System.out.println("Execution " + i + ": unknown number of rows updated");
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
    }

    public void InsertsUsuariosPRUEBA(Connection con){
        Statement st;
        String sql;
        try {
            st=con.createStatement();
            sql="";
            st.addBatch(sql);
            
            int [] numUpdates=st.executeBatch();
			for (int i = 0; i < numUpdates.length; i++) {
				if (numUpdates[i] == Statement.SUCCESS_NO_INFO) {
					System.out.println("Execution " + i + ": unknown number of rows updated");
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
    }
}
