public class Accesorio extends Producto {
    @Override
    public void RegistrarProducto(){
        String estilo;
        System.out.println("tenemos los siguentes accesorios \n1.-Pulsera------"+precio[3]+"\n2.-Aretes------"+precio[4]+"\n3.-Cosmetiquera------"+precio[5]+"\n");
        System.out.println("ingrese el nombre del producto que desea comprar\n");
        nombre=entrada.next();
        System.out.println("ingrese el tamanio:\n Chico, Mediana, Grande. \n");
        tamanio=entrada.next();
        System.out.println("Ingrese el color:");
        color=entrada.next();
        do{
            System.out.println("ingrese la cantidad a comprar\n");
            cantidad= entrada.nextInt ();
        }while(cantidad<0);
        System.out.println("Ingrese el estilo:\nModerno, Artesanal\n ");
        estilo=entrada.next();
    }   
}
