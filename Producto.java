import java.util.Scanner;
public abstract class Producto {
    protected String nombre;
    protected String tamanio;
    protected String color;
    protected int cantidad;
    protected int precio[]={250,290,300,15,20,80};
    Scanner entrada= new Scanner (System.in);

    public Producto(String nombre,String tamanio, String color, int cantidad){
        this.nombre=nombre;
        this.tamanio=tamanio;
        this.color=color;
        this.cantidad=cantidad;
    }
    public String getNombre(){
        return nombre;
    }
    public String getTamanio(){
        return tamanio;
    }
    
    public String getColor(){
        return color;
    }
    public int getCantidad(){
        return cantidad;
    }
    public int[] getPrecio(){
        return precio;
    }
    public Producto(){}
    public abstract void RegistrarProducto();
}
