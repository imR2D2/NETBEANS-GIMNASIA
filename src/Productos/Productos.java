
package Productos;
import java.util.ArrayList;

/**
 *
 * @author artur
 */
public abstract class Productos {
    
    public static ArrayList<Productos> ArrayP = new ArrayList<Productos>();
    
    protected String Id_Producto;
    protected String Nombre;
    protected String Tipo;
    protected double Tamaño;
    protected double Precio;
    protected double Ganancia;
    protected double GananciaTotal;

    public Productos(){}
    
    public Productos(String id_producto, String nombre, String tipo, double tamaño, double precio)
    {
        this.Id_Producto = id_producto;
        this.Nombre = nombre;
        this.Tipo = tipo;
        this.Tamaño = tamaño;
        this.Precio = precio;
        this.Ganancia = 0;
        this.GananciaTotal = 0;
    }

    public String getId_Producto() {
        return Id_Producto;
    }

    public void setId_Producto(String Id_Producto) {
        this.Id_Producto = Id_Producto;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public double getTamaño() {
        return Tamaño;
    }

    public void setTamaño(double Tamaño) {
        this.Tamaño = Tamaño;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double Precio) {
        this.Precio = Precio;
    }

    public double getGanancia() {
        return Ganancia;
    }

    public void setGanancia(double Ganancia) {
        this.Ganancia = Ganancia;
    }

    public double getGananciaTotal() {
        return GananciaTotal;
    }

    public void setGananciaTotal(double GananciaTotal) {
        this.GananciaTotal = GananciaTotal;
    }
   
    public abstract void Venta(double tamaño);
}