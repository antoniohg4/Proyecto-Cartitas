import java.sql.*;
import controlador.gestion_BD;
import vista.NewJFrame;

/**
 *
 * @author DAM-2
 */
public class Principal {
    static Connection con = null;
    public static String nombreJugador = null;
    
    public static void main(String[] args) {
        gestion_BD.crearConexion(); //Crea la conexión con la BD
        gestion_BD.creacionBD(); //Crea la BD
        gestion_BD.insertsCartas();
        NewJFrame frame = new NewJFrame();
        
        frame.setVisible(true);
    }
    
}
