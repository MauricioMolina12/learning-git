package tienda;

import java.util.*;

public class Tienda {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int opc, cantidad, dia, mes, año, opc1;
        String nombrep;
        long codigo;
        double precio, preciof, descuento;
        final double cons = 0.10;

        do {
            System.out.println("Tienda 1ero de Mayo");
            System.out.println("1.Comprar");
            System.out.println("2.Salir");
            opc = read.nextInt();

            switch (opc) {
                case 1:
                    System.out.println("Digite el nombre del producto");
                    nombrep = read.next();

                    System.out.println("Digite codigo del producto");
                    codigo = read.nextLong();

                    System.out.println("Digite cantidad");
                    cantidad = read.nextInt();

                    System.out.println("Digite precio");
                    precio = read.nextDouble();

                    System.out.println("Digite fecha de compra (día-mes-año)");
                    System.out.println("Día:");
                    dia = read.nextInt();
                    System.out.println("Mes");
                    mes = read.nextInt();
                    System.out.println("Año");
                    año = read.nextInt();
                    preciof = precio * cantidad;
                    Factura t = new Factura(preciof, dia, mes, año, nombrep, codigo, cantidad, precio);
                    t.imprimird();

            }

        } while (opc != 2);

    }

}
