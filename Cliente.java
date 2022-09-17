public class Cliente {
   String nombre;
   String direccion;
    
  public Cliente(){}

  public String  getNombre(){
     return nombre;
  }
  public String getDireccion(){
    return direccion;
  }
  public void setNombre(String nombre){
    this.nombre=nombre;
  }
  public void setDireccion(String direccion){
    this.direccion=direccion;
  }
}
