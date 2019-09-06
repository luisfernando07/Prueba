
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
public class Curso implements Serializable {
    private String carrera;
    private String nombre;
    private int ciclo;
    private int estudiantes;
    private Curso (){
        
    }

    public Curso(String carrera, String nombre, int ciclo, int estudiantes) {
        this.carrera = carrera;
        this.nombre = nombre;
        this.ciclo = ciclo;
        this.estudiantes = estudiantes;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCiclo() {
        return ciclo;
    }

    public void setCiclo(int ciclo) {
        this.ciclo = ciclo;
    }

    public int getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(int estudiantes) {
        this.estudiantes = estudiantes;
    }
    
}
