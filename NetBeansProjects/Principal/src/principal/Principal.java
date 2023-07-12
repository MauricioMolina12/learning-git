package principal;

import java.util.*;

public class Principal {

    static Scanner read = new Scanner(System.in);
    static ArrayList<Orden> order = new ArrayList<Orden>();

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        
        int opc;

        do {
            System.out.println("________________________________________________");
            System.out.println("-RESTAURANTE-");
            System.out.println("1.Presione 1 para registrar tu orden");
            System.out.println("2.Presione 2 para salir");
            opc = read.nextInt();

            if (opc == 1) {

                System.out.println("Digite la hora de la orden");
                String hora = read.next();
                System.out.println("Digite el nombre del mesero");
                String mesero = read.next();

                System.out.println("");

                System.out.println("Digite el tipo de bebidas");
                String tipobebida = read.next();
                System.out.println("Digite la cantidad de bebidas");
                int cantidadbebida = read.nextInt();

                System.out.println("");

                System.out.println("Digite el tipo de platillo");
                String tipoplatillo = read.next();
                System.out.println("Digite la cantidad de platillos");
                int cantidadplatillo = read.nextInt();

                System.out.println("");

                System.out.println("Digite subtotal");
                double subtotal = read.nextDouble();
                System.out.println("Digite propinas");
                double propina = read.nextDouble();
                System.out.println("Digite impuestos");
                double impuestos = read.nextDouble();

                System.out.println("");

                System.out.println("Digite el número de mesa");
                int mesa = read.nextInt();
                System.out.println("Digite el número de comensales");
                int comensales = read.nextInt();

                cliente client = new cliente();
                client.mesa = mesa;
                client.comensales = comensales;

                Bebida beverage = new Bebida();
                beverage.cantidadbebida = cantidadbebida;
                beverage.tipobebida = tipobebida;

                Platillo saucer = new Platillo();
                saucer.cantidadplatillo = cantidadplatillo;
                saucer.tipoplatillo = tipoplatillo;

                Pago payment = new Pago(subtotal, propina, impuestos);

                Orden order = new Orden(hora,mesero,client,payment,beverage,saucer);
                order.factura();
                
                
                
                boolean opcion = false;
                System.out.println("");
                System.out.println("¿Desea pagar con credito o efectivo?");
                System.out.println("1.Presione 1 para decir crédito");
                System.out.println("2.Presione 2 para decir efectivo");
                int opc2 = read.nextInt();

                if (opc2 == 1) {
                    System.out.println("Número tarjeta de crédito");
                    int numeroTdeCredito = read.nextInt();

                    System.out.println("Tipo de crédito");
                    String tipo = read.next();

                    System.out.println("Fecha de expedición");
                    String fechaDeExp = read.next();

                    System.out.println("Nombre persona");
                    String nombre = read.next();

                    Credito cre = new Credito(numeroTdeCredito, tipo, fechaDeExp, nombre, subtotal, propina, impuestos);
                    System.out.println("________________________________________");
                    cre.HacerCargo(subtotal, propina, impuestos);
                    opcion = true;
                }
                if (opc2 == 2) {
                    
                    System.out.println("Cantidad en efectivo");
                    double cantidad = read.nextDouble();
                    
                    Efectivo cash = new Efectivo (cantidad,subtotal,propina,impuestos);
                    
                    double e;
                    double vuelto;
                    e = subtotal + propina + impuestos;
                    
                    if (cantidad == e) {
                        System.out.println("Registro exitoso---total orden:");
                        cash.pagarefectivo(subtotal, propina, impuestos, cantidad);
                    }  
                     if (cantidad > e) {
                         vuelto = cantidad - e;
                         System.out.println("Orden pagada de " + e + " y su devuelta es de: " + vuelto);
                    }
                     opcion = false;
                }

            } else {
                System.exit(0);
                System.out.println("Vuelva pronto.");
            }

        } while (opc !=2);

    }

}
