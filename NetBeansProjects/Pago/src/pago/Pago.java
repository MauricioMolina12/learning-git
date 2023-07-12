
package pago;

import java.util.*;

public class Pago {

    static Scanner leer = new Scanner(System.in);
    static ArrayList<Orden> pedido = new ArrayList<Orden>();
    
    //METODO QUE CREA UN MENÚ PARA INGRESAR LOS DATOS
    static public void menu(int contador) {
        Scanner read = new Scanner(System.in);

        while (contador != 0) {

            System.out.println("ORDEN");
            System.out.println("1.Nombre mesero");
            System.out.println("");
            String mesero = read.next();
            System.out.println("2.Hora");
            System.out.println("");
            int hora = read.nextInt();
            System.out.println("3.Mesa");
            System.out.println("");
            int mesa = read.nextInt();
            System.out.println("4.Comensales");
            System.out.println("");
            int comensales = read.nextInt();
            System.out.println("Tipo de platillo");
            System.out.println("");
            String tipop = read.next();
            System.out.println("Cantidad de platillos");
            System.out.println("");
            int cantidadp = read.nextInt();
            System.out.println("Tipo de bebida: ");
            System.out.println("");
            String tipob = read.next();
            System.out.println("Cantidad de bebida: ");
            System.out.println("");
            int cantidadb = read.nextInt();
            
            
            pedido.add(new Orden ());
            contador--;
        }

        for (int i = 0; i < pedido.size(); i++) {
            System.out.println("Nombre:" + pedido.get(i).getMesero());
             System.out.println("ID:" + p1.get(i).getId());

            
        }
    }
    
    
    
    
    
    
    public static void main(String[] args) {
    
        
    }
    
}
