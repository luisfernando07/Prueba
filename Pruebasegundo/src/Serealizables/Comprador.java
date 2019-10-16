/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Serealizables;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ISTLOJA1
 */
public class Comprador implements Serializable {
    private String nombre;
    private String apellido;
    private String direccion;
    private int precio;
    private Comprador (){
    
}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public Comprador(String nombre, String apellido, String direccion, int precio) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.precio = precio;
    }


   
     public void escribirObjeto(String Direccion, Comprador comprador ) {
        try {
            ObjectOutputStream escritor = new ObjectOutputStream(new FileOutputStream(Direccion));
            escritor.writeObject(comprador );
            escritor.close();
        } catch (Exception e) {
            System.out.println("se produjo un error " + e);
        }
    }

    public void escribirComprador(String Direccion, List<Comprador > lj) {
        try {
            ObjectOutputStream escritor = new ObjectOutputStream(new FileOutputStream(Direccion));
            List<Comprador > lc;
            for (Comprador  comprador  : lj) {//para crear una lista
                escritor.writeObject(comprador );
            }
            escritor.close();
        } catch (Exception e) {
            System.out.println("se produjo un error " + e);
        }
    }

    public void leerArchivo(String Direccion) {
        try {
            ObjectInputStream lector = new ObjectInputStream(new FileInputStream(Direccion));
            Object auxiliar = lector.readObject();
            Comprador  Es = (Comprador ) auxiliar;//cambio de objeto a persona
            System.out.println(Es.getDireccion() + "su calle es" + Es.getDireccion());
        } catch (Exception e) {
            System.out.println("se produjo un error " + e);
        }
    }

    public List<Comprador > leerComprador(String dire) {
        List<Comprador > lj = new ArrayList<>();//creamos la lista para guardar objetos
        try {
            ObjectInputStream lector = new ObjectInputStream(new FileInputStream(dire));
            Object auxiliar = lector.readObject();
            while (auxiliar != null) {
                Comprador  comprador  = (Comprador) auxiliar;
                lj.add(comprador );
                auxiliar = lector.readObject();
            }
        } catch (Exception e) {
            System.out.println("se produjo un error " + e);
        }
        return lj;

    }

   

    public Comprador  Mayorprecio(List<Comprador > lj) {
        Comprador  mayor = lj.get(0);
        for (Comprador comprador : lj) {
            if (comprador.Mayorprecio(lj) > mayor.Mayorprecio(lj)) {
                mayor = comprador;
            }
        }
        return mayor;
    }

    


    public static void main(String[] args) {
        Comprador objeto = new Comprador();

        Comprador  c1 = new Comprador("luis","quevedo","loja",12);
        Comprador  c2 = new Comprador("pedro","ramon","malacatos",12);
        Comprador  c3 = new Comprador("juan","espinosa","loja",12);
        Comprador  c4 = new Comprador("diego","ordoñes","san pedro",12);
        Comprador  c5 = new Comprador("francisco","beltran","vilcabanva",12);
         Comprador c6 = new Comprador("anserson","guzman","pradera",12);
        Comprador  c7 = new Comprador("oscar","suares","loja",12);
        Comprador  c8 = new Comprador("francel","pineda","nangora",12);
        Comprador  c9 = new Comprador("daniael","quispe","malacatos",12);
        Comprador  c10 = new Comprador("sofia","jers","loja",12);
        List<Comprador> lj = new ArrayList<>();
        lj.add(c1);
        lj.add(c2);
        lj.add(c3);
        lj.add(c4);
        lj.add(c5);
        lj.add(c6);
        lj.add(c7);
        lj.add(c8);
        lj.add(c9);
        lj.add(c10);
        

        int a = lj.size();
        System.out.println("a");
//        for (Estudiante estudiante : lj) {
//            System.out.println(Estudiante.getCurso());
//        }
        objeto.escribirObjeto("C:\\Users\\ISTLOJA1\\Desktop\\Leccion.txt", c1);
        objeto.escribirComprador("C:\\Users\\ISTLOJA1\\Desktop\\Leccion.txt", lj);
        objeto.leerArchivo("C:\\Users\\ISTLOJA1\\Desktop\\Leccion.txt");
//        objeto.MenorEdad("C:\\Users\\ISTLOJA1\\Desktop\\Leccion.txt");
//        objeto.MayorEdad("C:\\Users\\ISTLOJA1\\Desktop\\Leccion.txt");
        
        System.out.println("el estudiante de mayor edd" + objeto.Mayorprecio(lj).getNombre());
       
    }
}


 
