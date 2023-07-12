package inicio;

import java.util.*;
import Clases.Pago;
import Clases.Platillo;
import Clases.Orden;
import Clases.Efectivo;
import Clases.Credito;
import Clases.Bebida;
import Clases.PagOrd;

public class Inicio {

    static Scanner read = new Scanner(System.in);
    static ArrayList<Orden> LOrden = new ArrayList<Orden>();
    static ArrayList<Pago> LPago = new ArrayList<Pago>();
    static ArrayList<Bebida>Lbebida = new ArrayList<Bebida>();
    static ArrayList<Platillo>Lplatillo = new ArrayList<Platillo>();
    static ArrayList<PagOrd> LPO = new ArrayList<PagOrd>();

    public static void mostrar_inicio(int ag) {

        Scanner read = new Scanner(System.in);

        for (int i = 0; i < ag; i++) {
            System.out.println("----BIENVENIDOS AL RESTAURANTE M&M----");
            System.out.println("");
            System.out.println("Ingrese la orden que desea");
            System.out.println("");
            System.out.println("------------------------------------------------");
            System.out.println("Ingrese el tipo de platillo(s) que ordenará");
            String tipop = read.next();
            System.out.println("Ingrese la cantidad de platillo(s) que ordenará");
            int cantidadp = read.nextInt();
            System.out.println("------------------------------------------------");
            System.out.println("");
            System.out.println("Ingrese el tipo de bebida(s) que ordenará");
            String tipob = read.next();
            System.out.println("Ingrese la cantidad de bebida(s) que ordenará");
            int cantidadb = read.nextInt();
            System.out.println("------------------------------------------------");
            System.out.println("");
            System.out.println("Digite la hora de la orden");
            String hora = read.next();
            System.out.println("Digite el nombre del mesero");
            String mesero = read.next();
            System.out.println("");
            System.out.println("------------------------------------------------");
            System.out.println("Digite el número de mesa");
            int mesa = read.nextInt();
            System.out.println("Digite el número de comensales");
            int comensales = read.nextInt();
            LOrden.add(new Orden(hora, mesero, Lbebida, Lplatillo, mesa, comensales));
            System.out.println("------------------------------------------------");
            System.out.println("");
            System.out.println("Digite subtotal");
            double subtotal = read.nextDouble();
            System.out.println("Digite propinas");
            double propina = read.nextDouble();
            double impuestos = 10000;
            LPago.add(new Pago(subtotal, propina, impuestos));
            LPO.add(new PagOrd(ag, LOrden, LPago));
            System.out.println("------------------------------------------------");
            System.out.println("");

        }

    }
    public static void factura(ArrayList<PagOrd>LPO, int ag){
        for (int i = 0; i < ag; i++) {
            System.out.println("");
            System.out.println("------------------------------------------------");
            System.out.println("----ORDEN DEL CLIENTE----");
            System.out.println("Platillo(s): " + LPO.get(i).getLOrden().get(i).getPlatillos().get(i).getTipop());
            System.out.println("Cantidad platillo: " + LPO.get(i).getLOrden().get(i).getPlatillos().get(i).getCantidadp());
            System.out.println("------------------------------------------------");
            System.out.println("Bebida(s): " + LPO.get(i).getLOrden().get(i).getBebidas().get(i).getTipob());
            System.out.println("Cantidad bebidas: " + LPO.get(i).getLOrden().get(i).getBebidas().get(i).getCantidadb());
            System.out.println("------------------------------------------------");
            System.out.println("Hora: " + LPO.get(i).getLOrden().get(i).getHora());
            System.out.println("Mesero: " + LPO.get(i).getLOrden().get(i).getMesero());
            System.out.println("Número de comensales: " + LPO.get(i).getLOrden().get(i).getComensales());
            System.out.println("Número de mesa: " + LPO.get(i).getLOrden().get(i).getMesa());
            System.out.println("------------------------------------------------");
            System.out.println("");
            System.out.println("----PAGO----");
            System.out.println("Subtotal: " + LPO.get(i).getLPago().get(i).getSubtotal());
            System.out.println("Propinas: " + LPO.get(i).getLPago().get(i).getPropina());
            System.out.println("------------------------------------------------");
            
        }
    }

    public static void main(String[] args) {

        System.out.println("¿Cuantas ordenes pedirá?");
        int ag = read.nextInt();
        int opc;
        
        do {
            System.out.println("----BIENVENIDOS AL RESTAURANTE M&M----");
            System.out.println("               MENÚ                    ");
            System.out.println("¿Que desea hacer?");
            System.out.println("1.Digite 1 para ordenar");
            System.out.println("2.Digite 2 solamente para mostrar su factura, una vez ya ordenado");
            opc = read.nextInt();
            
            switch(opc){
                case 1:
                    mostrar_inicio(ag);
                    break;
                case 2:
                    factura(LPO, ag);
                    break;
                default:
                    System.out.println("Error o salió opción");
                    break;
            }
        } while (opc !=2);
        

    }

}
