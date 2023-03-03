/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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
    private Connection con = null;
    /**
     * Crea la conexion a la BD y establece autoCommit a false
     */
    public void crearConexion(){
        try {                                       //TODO poner la base de datos bien
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/BBDD", "root", "");
            con.setAutoCommit(false);
            System.out.println("Conexion creada");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }//crearConexion
    
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
    public void comprobarSiExisteUsuario(){
        //TODO
    }//comprobarSiExisteUsuario
    
    /**
     * Da de alta un nuevo usuario
     */
    public static void altaUsuario(String nombre, String pwd, int edad, EnumRegiones reg){
        //TODO insert
    }//altaUsuario
    
    /**
     * 
     * @return 
     */
    public static ArrayList<Carta> getColeccionCartas(){
        ArrayList<Carta> listaCartas = new ArrayList<Carta>();
        //TODO Select de las cartas
        
       /* while(rs.next()){
            Carta c = new Carta(rs.getInt("id"), rs.getString("nombre"), rs.getString("descripcion"),
                              rs.getInt("poder"), rs.getInt("defensa"), rs.getInt("rareza"));
            
            listaCartas.add(c);
        }*/
        
        return listaCartas;
    }
}
