public class Ropa extends Producto {
    @Override
    public void RegistrarProducto(){
        String material;
        System.out.println("tenemos los siguentes accesorios \n1.-blusa------"+precio[0]+"\n2.-vestido------"+precio[1]+"\n3.-capa------"+precio[2]+"\n");
        System.out.println("ingrese el nombre del producto que desea comprar\n");
        nombre=entrada.next();
        System.out.println("elige el tamanio:\n Chico, Mediana, Grande. \n");
        tamanio=entrada.next();
        System.out.println("Ingrese el color:");
        color=entrada.next();
        do{
          System.out.println("ingrese la cantidad a comprar\n");
         cantidad= entrada.nextInt ();
        }while(cantidad<0);
        System.out.println("Ingrese el material:\nManta, Algodon, Popetina\n");
        material=entrada.next(); 
    }   
}
