
package Productos;

/**
 *
 * @author artur
 */
public class P_Traje extends Productos
{
    public P_Traje(){}
    
    public P_Traje(String id_producto, String nombre, String tipo, double tamaño, double precio)
    {
        super(id_producto, nombre, tipo, tamaño, precio);
    }
    
    
    @Override
    public void Venta(double tamaño) {
        double Venta = (tamaño * this.Precio);
        System.out.println("\t\t\t\tCosto total:"+ Venta + "$\n");
        this.Tamaño = (Tamaño - tamaño);
        this.Ganancia = Venta;
        this.GananciaTotal += Venta;
    }
}
    

