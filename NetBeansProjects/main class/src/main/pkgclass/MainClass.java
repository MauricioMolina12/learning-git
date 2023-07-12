package main.pkgclass;

import java.util.*;

public class MainClass {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        String nombre,apellido,nombrelibro;
        int opc, cedula, codigoe, codigolibro, dia, mes, año,dia2,mes2,año2;
        
        
        do {
            System.out.println("_________________________________________________________________");
            System.out.println("Bienvenidos a la Biblioteca virtual de la Universidad Libre");
            System.out.println("");
            System.out.println("1.Prestar libro");
            System.out.println("2.Salir");
            System.out.println("Escoga una opción");
            opc = read.nextInt();

            switch (opc) {
                case 1:
                    System.out.println("Ok, registre sus datos.");
                    System.out.println("");

                    System.out.println("¿Cual es su nombre?");
                    nombre = read.next();

                    System.out.println("¿Cual es su apellido?");
                    apellido = read.next();

                    System.out.println("Digite su número de identificación (Cc, TI o CE)");
                    cedula = read.nextInt();

                    System.out.println("Digite su codigo institucional");
                    codigoe = read.nextInt();

                    System.out.println("Digite el codigo del libro");
                    codigolibro = read.nextInt();

                    System.out.println("¿Cual es el nombre del libro?");
                    nombrelibro = read.next();

                    System.out.println("Digite la fecha de prestamo (dia-mes-año)");
                    System.out.println("Día:");
                    dia = read.nextInt();
                    System.out.println("Mes:");
                    mes = read.nextInt();
                    System.out.println("Año:");
                    año = read.nextInt();
                    
                    System.out.println("Digite la fecha de devolución (dia-mes-año)");
                    System.out.println("Día:");
                    dia2 = read.nextInt();
                    System.out.println("Mes:");
                    mes2 = read.nextInt();
                    System.out.println("Año:");
                    año2 = read.nextInt();

                    Libro library = new Libro(codigolibro,dia,mes,año,dia2,mes2,año2,nombrelibro,nombre,apellido,cedula,codigoe);
                    library.prestar_libro();

                    break;

                case 2:
                    System.exit(0);
            }
        } while (true);

    }

}
