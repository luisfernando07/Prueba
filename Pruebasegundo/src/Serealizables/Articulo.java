/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Serealizables;

import java.io.Serializable;

/**
 *
 * @author ISTLOJA1
 */
public class Articulo implements Serializable{
    private String nombre;
    private int precio;
    private Articulo (){
        
    }

    public Articulo(String nombre, int precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    
}
