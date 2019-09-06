
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ISTLOJA1
 */
public class Estudiante implements Serializable {

    private String Nombre;
    private String apellidos;
    private int edad;
    private int promedio;
    private Direccion direccion;
    private Curso curso;
    private Object Es;

    public Estudiante() {
    }

    public Estudiante(String nombre, String apellidos, int edad, int promedio, Direccion direccion, Curso curso) {
        this.Nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.promedio = promedio;
        this.direccion = direccion;
        this.curso = curso;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getPromedio() {
        return promedio;
    }

    public void setPromedio(int promedio) {
        this.promedio = promedio;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public void escribirObjeto(String Direccion, Estudiante estudiante) {
        try {
            ObjectOutputStream escritor = new ObjectOutputStream(new FileOutputStream(Direccion));
            escritor.writeObject(estudiante);
            escritor.close();
        } catch (Exception e) {
            System.out.println("se produjo un error " + e);
        }
    }

    public void escribirEstudiante(String Direccion, List<Estudiante> lj) {
        try {
            ObjectOutputStream escritor = new ObjectOutputStream(new FileOutputStream(Direccion));
            List<Estudiante> lc;
            for (Estudiante estudiante : lj) {//para crear una lista
                escritor.writeObject(estudiante);
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
            Estudiante Es = (Estudiante) auxiliar;//cambio de objeto a persona
            System.out.println(Es.getDireccion().getCalle() + "su calle es" + Es.getDireccion().getCasa());
        } catch (Exception e) {
            System.out.println("se produjo un error " + e);
        }
    }

    public List<Estudiante> leerEstudiante(String dire) {
        List<Estudiante> lj = new ArrayList<>();//creamos la lista para guardar objetos
        try {
            ObjectInputStream lector = new ObjectInputStream(new FileInputStream(dire));
            Object auxiliar = lector.readObject();
            while (auxiliar != null) {
                Estudiante estudiante = (Estudiante) auxiliar;
                lj.add(estudiante);
                auxiliar = lector.readObject();
            }
        } catch (Exception e) {
            System.out.println("se produjo un error " + e);
        }
        return lj;

    }

    public Estudiante MenorEdad(List<Estudiante> lj) {
        Estudiante menor = lj.get(0);
        for (Estudiante estudiante : lj) {
            if (estudiante.getEdad() < menor.getEdad()) {
                menor = estudiante;
            }
        }
        return menor;
    }

    public Estudiante MayorEdad(List<Estudiante> lj) {
        Estudiante mayor = lj.get(0);
        for (Estudiante estudiante : lj) {
            if (estudiante.getEdad() > mayor.getEdad()) {
                mayor = estudiante;
            }
        }
        return mayor;
    }

    public Estudiante MayorPromedio(List<Estudiante> lj) {
        Estudiante mayor = lj.get(0);
        for (Estudiante estudiante : lj) {
            if (estudiante.getPromedio() > mayor.getPromedio()) {
                mayor = estudiante;
            }
        }
        return mayor;
    }
//      public Estudiante Rciudad(List<Estudiante> lj) {
//          HashMap <String,Integer>mapa=new HashMap <String,Integer>();
//        for (Estudiante estudiante : lj) {
//            System.out.println(estudiante.getDireccion(),mapa.getOrDefault(estudiante.getDireccion().getCiudad(),edad)+1);
//            
//           
//        }
//          System.out.println(mapa);
//        return null;
//    }

    public static void main(String[] args) {
        Estudiante objeto = new Estudiante();

        Estudiante e1 = new Estudiante("Luis", "Quevedo", 9, 5, new Direccion("Malcatos", "Nangora", 55), new Curso("Desarrolo de software", "Desarrollo de software", 2, 15));
        Estudiante e2 = new Estudiante("Francel", "Pineda", 8, 6, new Direccion("Vilcabamba", "Cucanama", 60), new Curso("Desarrolo de software", "Desarrollo de software", 4, 18));
        Estudiante e3 = new Estudiante("Jhon", "Puglla", 7, 7, new Direccion("Malacatos", "Carmen", 73), new Curso("Contabilidad", "Contabilidad", 6, 30));
        Estudiante e4 = new Estudiante("Celio", "Alvarado", 9, 8, new Direccion("loja", "linderos", 64), new Curso("Mecanica", "Mecanica", 7, 19));
        Estudiante e5 = new Estudiante("andersson", "Gusman", 8, 4, new Direccion("san pedro", "san pedrp", 44), new Curso("Alimentos", "Alimentos", 8, 15));
        Estudiante e6 = new Estudiante("Ramiro", "Parra", 6, 3, new Direccion("loja", "loja", 85), new Curso("Veterinaria", "Veterinaria", 5, 15));
        Estudiante e7 = new Estudiante("Pablo", "Ramon", 7, 2, new Direccion("Puyo", "Nangora", 44), new Curso("Medicina", "Medicina", 4, 15));
        Estudiante e8 = new Estudiante("Diego", "Ordones", 9, 9, new Direccion("Malcatos", "Nangora", 55), new Curso("Derecho", "Derecho", 1, 19));
        Estudiante e9 = new Estudiante("Cisto", "Quevedo", 8, 9, new Direccion("quito", "pindal", 47), new Curso("Economia", "Economia", 9, 17));
        Estudiante e10 = new Estudiante("Vicente", "ORDOÑES", 10, 1, new Direccion("Malcatos", "quinara", 77), new Curso("Forestar", "Forestar", 6, 16));
        List<Estudiante> lj = new ArrayList<>();
        lj.add(e1);
        lj.add(e2);
        lj.add(e3);
        lj.add(e4);
        lj.add(e5);
        lj.add(e6);
        lj.add(e7);
        lj.add(e8);
        lj.add(e9);
        lj.add(e10);

        int a = lj.size();
        System.out.println("a");
//        for (Estudiante estudiante : lj) {
//            System.out.println(Estudiante.getCurso());
//        }
        objeto.escribirObjeto("C:\\Users\\ISTLOJA1\\Desktop\\Leccion.txt", e10);
        objeto.escribirEstudiante("C:\\Users\\ISTLOJA1\\Desktop\\Leccion.txt", lj);
        objeto.leerArchivo("C:\\Users\\ISTLOJA1\\Desktop\\Leccion.txt");
//        objeto.MenorEdad("C:\\Users\\ISTLOJA1\\Desktop\\Leccion.txt");
//        objeto.MayorEdad("C:\\Users\\ISTLOJA1\\Desktop\\Leccion.txt");
        System.out.println("el estudiante de menor edd" + objeto.MenorEdad(lj).getNombre());
        System.out.println("el estudiante de mayor edd" + objeto.MayorEdad(lj).getNombre());
       System.out.println("el estudiante de mayor promedio" + objeto.MayorPromedio(lj).getNombre());
    }
}
