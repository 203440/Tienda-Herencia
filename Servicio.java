import java.util.Scanner;
import java.util.Calendar;
public class Servicio {
    static Scanner entrada= new Scanner (System.in);
    static int op;
    static Calendar fechaEntrega=Calendar.getInstance();
    static Calendar fechaActual= Calendar.getInstance();
    public static void main(String [] args){
        EleccionServicio();
    }
    public static void EleccionServicio(){
        do{
            System.out.println("BIENVENIDOS A LA TIENDA DE ARTESANIAS\n");
            System.out.println("Usted elija el servicio que necesite servicio de:\n 1.- compra inmediata \n 2.-desea realizar un pedido para una fecha deseada\n3.-Salir\n");
                op= entrada.nextInt ();
               switch (op) {
                  case 1:
                     RegistroCompra();
                     break;
                    case 2:
                     RegistroDatos();
                      break;
                    case 3:
                     System.out.println("GRACIAS POR SU PREFERENCIA");
                    break;
                    default:
                     System.out.println("Seleccion invalida, intente nuevamente\n");
                }
        }while(op!=3);
    }
    public static void RegistroCompra(){
        int select;
        int total=0;
        Ropa ropa = new Ropa();
        Accesorio acc = new Accesorio();
        do{
            System.out.println("Que desea comprar:\n 1.-Ropa. \n2.-Accsesorios\n3.-salir\n");
            select= entrada.nextInt ();
            switch (select) {
               case 1:
                 ropa.RegistrarProducto();
                 if(ropa.getNombre().equals("blusa")){
                      if(ropa.getCantidad()>6){
                          int t1;
                          int desc;
                          t1= ((ropa.getPrecio()[0]*ropa.getCantidad())*10)/100;
                          desc=(ropa.getPrecio()[0]*ropa.getCantidad())-t1;
                          total=desc;
                      }else{
                         total+=ropa.getPrecio()[0]*ropa.getCantidad();
                        }
                    }else {
                         if(ropa.getNombre().equals("vestido")){
                            if(ropa.getCantidad()>6){
                                int t1;
                                int desc;
                                t1= ((ropa.getPrecio()[1]*ropa.getCantidad())*10)/100;
                                desc=(ropa.getPrecio()[1]*ropa.getCantidad())-t1;
                                total=total+desc;
                            }else{
                               total+= ropa.getPrecio()[1]*ropa.getCantidad();
                            }
                        }else{
                          if(ropa.getNombre().equals("capa")){
                             if(ropa.getCantidad()>6){
                                  int t1;
                                  int desc;
                                  t1= ((ropa.getPrecio()[2]*ropa.getCantidad())*10)/100;
                                  desc=(ropa.getPrecio()[2]*ropa.getCantidad())-t1;
                                  total=total+desc;
                                }else{
                                 total+= ropa.getPrecio()[2]*ropa.getCantidad();
                                }
                            }
                        }
                    }  
                 break;
             case 2:
                  acc.RegistrarProducto();
                   if(acc.getNombre().equals("pulsera")){
                        if(acc.getCantidad()>6){
                         int t1;
                         int desc;
                         t1= ((acc.getPrecio()[3]*acc.getCantidad())*10)/100;
                         desc=(acc.getPrecio()[3]*acc.getCantidad())-t1;
                         total=total+desc;
                        }else{
                          total+= acc.getPrecio()[3]*acc.getCantidad();
                        }
                    }else {
                         if(acc.getNombre().equals("aretes")){
                            if(acc.getCantidad()>6){
                                int t1;
                                int desc;
                                t1= ((acc.getPrecio()[4]*acc.getCantidad())*10)/100;
                                desc=(acc.getPrecio()[4]*acc.getCantidad())-t1;
                                total=total+desc;
                              }else{
                               total+= acc.getPrecio()[4]*acc.getCantidad();
                            }
                        }else{
                            if(acc.getNombre().equals("cosmetiquera")){
                                if(acc.getCantidad()>6){
                                    int t1;
                                    int desc;
                                    t1= ((acc.getPrecio()[5]*acc.getCantidad())*10)/100;
                                    desc=(acc.getPrecio()[5]*acc.getCantidad())-t1;
                                    total=total+desc;
                                  }else{
                                   total+= acc.getPrecio()[5]*acc.getCantidad();
                                }
                            }
                        }
                    }
              break;
             case 3:
               ImprimirTicket(total);
               break;
               default:
                System.out.println("Seleccion invalida, intente nuevamente\n");
            }
        }while (select != 3);
    }
    public static void RegistroDatos(){
        Cliente datos=new Cliente();
        String nombre;
        String direccion;
        int op;
        System.out.println("ingrese su nombre por favor");
        nombre= entrada.next ();
        System.out.println("Quiere que sea un servicio a domicilio?\n1.-si\t 2.-no\n");
        op= entrada.nextInt ();
        if (op==1){
            System.out.println("ingrese su direccion");
            direccion= entrada.next ();
            datos.setDireccion(direccion);
        }else{
            System.out.println("Lo esperamos el dia de la entrega\n");
        }
        datos.setNombre(nombre);
        EstablecerFecha();
        RegistroCompra();
    }
    public static void EstablecerFecha(){
        Pedido fecha=new Pedido();
        int dia, mes, anio;
       
        do{
            System.out.println("ingrese el dia de entrega que sea apartir de un dias despues de hacer el pedido");
            dia= entrada.nextInt ();
            System.out.println("mes");
            mes= entrada.nextInt ();
            System.out.println("anio");
            anio= entrada.nextInt ();
            fechaEntrega.set(anio, mes-1, dia);
        }while(fechaActual.compareTo(fechaEntrega)==1);
        fecha.setDia(dia);
        fecha.setMes(mes);
        fecha.setAnio(anio);
    }
    public static void ImprimirTicket(int total){
        if (op==1){
            System.out.println("GRACIAS POR HABER REALIZADO SU COMPRA EN NUESTRA TIENDA\n");
            System.out.println("---------------------------------------------------------");
            System.out.println("Su total a pagar es:"+ total);
        }else{
            if(op==2){
                System.out.println("GRACIAS POR HABER REALIZADO SU COMPRA EN NUESTRA TIENDA\n");
                System.out.println("---------------------------------------------------------");
                System.out.println("La entrega de su pedido sera el:\n"+fechaEntrega.getTime());
                System.out.println("---------------------------------------------------------");
                System.out.println("Su total a pagar es:"+ total+"\n");
            }
        }
    }
}