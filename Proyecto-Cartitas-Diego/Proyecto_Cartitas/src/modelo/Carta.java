/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author DAM-2
 */
public class Carta {

    
    private int rareza, poder, defensa, id;
    private String nombre, descripcion;

    public Carta(int id, String nombre, String descripcion, int poder, int defensa, int rareza) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.poder = poder;
        this.defensa = defensa;
        this.rareza = rareza;
    }

    public int getRareza() {
        return rareza;
    }

    public void setRareza(int rareza) {
        this.rareza = rareza;
    }

    public int getPoder() {
        return poder;
    }

    public void setPoder(int poder) {
        this.poder = poder;
    }

    public int getDefensa() {
        return defensa;
    }

    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    //TODO formatear el coso este
    @Override
    public String toString() {
        return "Carta{" + "rareza=" + rareza + ", poder=" + poder + ", defensa=" + defensa + ", id=" + id + ", nombre=" + nombre + ", descripcion=" + descripcion + '}';
    }
    
}
