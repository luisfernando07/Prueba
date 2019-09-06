
import java.io.Serializable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ISTLOJA1
 */
public class Direccion implements Serializable {
    private String ciudad;
    private String calle;
    private int casa;
    private Direccion (){
        
    }    

    public Direccion(String ciudad, String calle, int casa) {
        this.ciudad = ciudad;
        this.calle = calle;
        this.casa = casa;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getCasa() {
        return casa;
    }

    public void setCasa(int casa) {
        this.casa = casa;
    }
    
    
    
}
