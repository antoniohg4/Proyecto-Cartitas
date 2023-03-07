/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.*;

/**
 *
 * @author DAM-2
 */
public class Jugador {
    private static Scanner kb = new Scanner(System.in);
    
    private List<Carta> coleccion = new ArrayList<Carta>();
    private String nombre, pwd;
    private int edad, monedas;
    private EnumRegiones region;
    
    public Jugador(){
        rellenarDatos();
    }
    
    private void rellenarDatos(){
        //TODO hay que pasar esto a una ventanita
        /*
        System.out.print("Nombre: ");
        setNombre(kb.nextLine());
        
        System.out.print("Contraseña: ");
        setPwd(kb.nextLine());

        ...

        */
        
    }

    public List<Carta> getColeccion() {
        return coleccion;
    }

    public void setColeccion(List<Carta> coleccion) {
        this.coleccion = coleccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getMonedas() {
        return monedas;
    }

    public void setMonedas(int monedas) {
        this.monedas = monedas;
    }

    public EnumRegiones getRegion() {
        return region;
    }

    public void setRegion(EnumRegiones region) {
        this.region = region;
    }
    
    
    
}
