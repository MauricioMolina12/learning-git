package empleo;

import java.util.*;

public class Empleo {
    
    public static void agregarcliente (String nombre, int numcuenta, String servicio, int precio){
        Factura cliente = new Factura (nombre,numcuenta,servicio,precio);
    }
    public static void imprimir (String nombre, int numcuenta, String servicio, int precio){
        Factura cliente = new Factura (nombre,numcuenta,servicio,precio);
        cliente.imprimir(nombre,numcuenta,servicio,precio);
    }

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Factura cliente = new Factura (nombre,numcuenta,servicio,precio);
        
        System.out.println("Nombre");
        String nombre=leer.next();
        
        System.out.println("Numero de cuenta");
        int numcuenta= leer.nextInt();
        
        System.out.println("Tipo de servicio");
        String servicio= leer.next();
        
        System.out.println("Total a pagar");
        int precio= leer.nextInt();
        
    }


    agregarcliente(nombre,numcuenta,servicio,precio);
    imprimir (nombre,numcuenta,servicio,precio);
}
