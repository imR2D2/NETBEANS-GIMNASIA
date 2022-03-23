
package Clases;

import java.util.ArrayList;

public class Alumno {
    String matricula, nombre, fechanac, fechaing, fechabaja; 
    //Almacena lista de alumnos registrados
    public static ArrayList<Alumno> listasalumno = new ArrayList<Alumno>();
 
    
    public Alumno(String matricula, String nombre, String fechanac, String fechaing, String fechabaja){
        this.matricula = matricula; 
        this.nombre = nombre; 
        this.fechanac = fechanac; 
        this.fechaing = fechaing; 
        this.fechabaja = fechabaja; 
    }

    public Alumno(String matricula) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechanac() {
        return fechanac;
    }

    public void setFechanac(String fechanac) {
        this.fechanac = fechanac;
    }

    public String getFechaing() {
        return fechaing;
    }

    public void setFechaing(String fechaing) {
        this.fechaing = fechaing;
    }

    public String getFechabaja() {
        return fechabaja;
    }

    public void setFechabaja(String fechabaja) {
        this.fechabaja = fechabaja;
    }   
}
