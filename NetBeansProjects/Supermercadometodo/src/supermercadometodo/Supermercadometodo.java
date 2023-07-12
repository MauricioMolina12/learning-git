/*
En un supermercado se hace un 20% de descuento a los clientes cuya compra supere los 1000 en las áreas de frutas, verduras y abarrotes. 
¿ Cual sera el total que pagara una persona por su compra ? 
Se debe mostrar el nombre del cliente , producto, precio , cantidad , descuento y total a pagar….
 */
package supermercadometodo;

import java.util.*;

public class Supermercadometodo {

   public static double descuento(double compra) {

        double descuento = compra * 20/ 100;
        return descuento;

    }
    
    public static void main(String[] args) {
        Scanner leer= new Scanner (System.in);
        
        System.out.println("Digite su nombre");
        String nombre= leer.next();
        
        System.out.println("Digite su apellido");
        String apellido= leer.next();
        
        System.out.println("Digite el nombre del producto");
        String producto= leer.next();
        
        System.out.println("Digite el precio");
        double precio= leer.nextDouble();
        
        System.out.println("Digite cantidad");
        int cantidad= leer.nextInt();
        
        int compra= (int) (precio*cantidad);
        
        if (compra>20000) {
            double total= compra-descuento(compra);
            
             System.out.println("Su total a pagar es " + total);
        }else{
            System.out.println("No hay descuentos y su compra es de " + compra);
        }
        System.out.println("FACTURA");
        System.out.println("nombre: " + nombre + " " + apellido);
        System.out.println("El nombre del producto es " + producto);
        System.out.println("Precio: " + precio);
        System.out.println("La cantidad de "+producto+" es: " + cantidad);
  
       
        

    }

}
