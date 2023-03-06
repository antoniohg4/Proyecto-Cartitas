package controlador;


import controlador.gestion_BD;
import java.util.ArrayList;
import java.util.Random;
import modelo.Carta;


public class Juego {
    private static final int NUMERO_DE_CARTAS_POR_SOBRE = 3;
    
    public static ArrayList<Carta> abrirSobre(){
        ArrayList <Carta> listaTodasCartas = gestion_BD.obtenerTodasLasCartas();
        
        Random rnd = new Random();
         ArrayList <Carta> sobre = new ArrayList<Carta>();
       
        
        for (int i = 0; i < NUMERO_DE_CARTAS_POR_SOBRE; i++) {
            sobre.add(listaTodasCartas.get(rnd.nextInt(listaTodasCartas.size())));
        }
        
        return sobre;
    }
}
