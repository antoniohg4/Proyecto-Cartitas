import controlador.gestion_BD;
import vista.SplashScreen;

/**
 *
 * @author DAM-2
 */
public class Principal {
    public static String nombreJugador = null;
    
    public static void main(String[] args) {
        gestion_BD.crearConexion(); //Crea la conexión con la BD
        gestion_BD.creacionBD(); //Crea la BD
        gestion_BD.insertsCartas();
        gestion_BD.insertsUsuarios();
        gestion_BD.insertsColeccion();

        SplashScreen frame = new SplashScreen();
        frame.setVisible(true);
    }
    
}
