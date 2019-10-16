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
public class Envio implements Serializable {
    private String fecha_envio;
    private String direccion_envio;
    private Envio (){
        
    }

    public Envio(String fecha_envio, String direccion_envio) {
        this.fecha_envio = fecha_envio;
        this.direccion_envio = direccion_envio;
    }

    
    

    public String getFecha_envio() {
        return fecha_envio;
    }

    public void setFecha_envio(String fecha_envio) {
        this.fecha_envio = fecha_envio;
    }

    public String getDireccion_envio() {
        return direccion_envio;
    }

    public void setDireccion_envio(String direccion_envio) {
        this.direccion_envio = direccion_envio;
    }
    
}
