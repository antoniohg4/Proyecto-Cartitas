package controlador;

import java.util.ArrayList;
import java.util.Random;
import modelo.Carta;


public class Juego {
    private static final int NUMERO_DE_CARTAS_POR_SOBRE = 3;
    private static final int PROBABILIDAD_RAREZA_2 = 10;
    private static final int PROBABILIDAD_RAREZA_3 = 50;
    private static final int PROBABILIDAD_RAREZA_4 = 100;
    private static Random rnd = new Random();

    public static ArrayList<Carta> coleccion = new ArrayList<Carta>();
    
    /**
     * Pilla una carta aleatoria, mira la rareza y ejecuta el metodo
     * correspondiente a su rareza, si sale rtue, la mete, si sale false coge 
     * otra y vuelta a empezar.
     * 
     * Para rareza 1, introduce directamente al sobre
     * 
     * @return ArrayList con las 3 cartas del sobre
     */
    public static ArrayList<Carta> abrirSobre(){
        ArrayList <Carta> listaTodasCartas = gestion_BD.obtenerTodasLasCartas();
        ArrayList <Carta> sobre = new ArrayList<>();
        Carta c = null;
        boolean introducirCartaenSobre;
        
        for (int i = 0; i < NUMERO_DE_CARTAS_POR_SOBRE; i++) { //Para cada hueco del sobre
            introducirCartaenSobre = false;
            
            while(!introducirCartaenSobre){ //mientras no se introduzca la carta
                c = listaTodasCartas.get(rnd.nextInt(listaTodasCartas.size())); //Obtiene una carta aleatoria
                
                switch (c.getRareza()) { //Obtiene la rareza de esa carta aleatoria
                    case 2:
                        introducirCartaenSobre = comprobarRareza2(); //Si sale que deberia ser de esa rareza
                        break;
                    case 3:
                        introducirCartaenSobre = comprobarRareza3();
                        break;
                    case 4:
                        introducirCartaenSobre = comprobarRareza4();
                        break;
                    default:                            //Si la rareza es 1, la introduce directamente
                        introducirCartaenSobre = true;
                }
            }//while
            
            //Cuando la flag sea true, sale del bucle while
            
            sobre.add(c); //Añade la carta al sobre
        }//for
        
        return sobre;
    }
    
    /*
     * metodos que comprueban si salio una carta de dicha rareza
     */
    
    public static boolean comprobarRareza2() {
        boolean resultado = false;
        
        int numAleatorio = rnd.nextInt(PROBABILIDAD_RAREZA_2) + 1;
        
        if (numAleatorio == 1) {
            //SALE CARTA RARA
            resultado = true;
        }
        return resultado;
    }


    public static boolean comprobarRareza3() {
        boolean resultado = false;
    
        int numAleatorio = rnd.nextInt(PROBABILIDAD_RAREZA_3) + 1;
        if (numAleatorio == 1) {
            //SALE CARTA RARA
            resultado = true;
        }
        return resultado;
    }


    public static boolean comprobarRareza4() {
        boolean resultado = false;
        
        int numAleatorio = rnd.nextInt(PROBABILIDAD_RAREZA_4) + 1;
        if (numAleatorio == 1) {
            //SALE CARTA RARA
            resultado = true;
        }
        return resultado;
    }
}
