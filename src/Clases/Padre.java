
package Clases;

import java.util.ArrayList;

public class Padre {
     String matricula, nombrealum, nombre, direccion, curp, telefono, parentezco;
     public static ArrayList<Padre> listaspadres = new ArrayList<Padre>();
     
     public Padre(String matricula, String nombrealum, String nombre, String direccion, String curp, String telefono, String Parentezco){
         this.matricula = matricula; 
         this.nombrealum = nombrealum; 
         this.nombre = nombre; 
         this.direccion = direccion; 
         this.curp = curp; 
         this.telefono = telefono;  
         this.parentezco = Parentezco;
     }

    public Padre() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNombrealum() {
        return nombrealum;
    }

    public void setNombrealum(String nombrealum) {
        this.nombrealum = nombrealum;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCurp() {
        return curp;
    }

    public void setCurp(String curp) {
        this.curp = curp;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getParentezco() {
        return parentezco;
    }

    public void setParentezco(String parentezco) {
        this.parentezco = parentezco;
    }

    public static ArrayList<Padre> getListaspadres() {
        return listaspadres;
    }

    public static void setListaspadres(ArrayList<Padre> listaspadres) {
        Padre.listaspadres = listaspadres;
    }
     
    
    
}
