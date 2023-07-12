package yuyo;

import java.util.*;

public class Yuyo {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        double precio;
        float porcveh = 0, porcbus = 0, porccp = 0, porcg = 0, porcm = 0;
        int c = 0;
        int b = 0;
        int cp = 0;
        int cg = 0;
        int m = 0;
        int t = 0;
        int op1;
        int op2;
        int contadora = 0;
        int vn = 0, bus = 0, cpe = 0, cgra = 0, mul = 0;

        System.out.println("\nMenú");
        System.out.println("1.Siguiente vehiculos");
        System.out.println("2.No hay más vehiculos");
        op1 = reader.nextInt();

        do {
            System.out.println("\nMenú peaje");
            System.out.println("1.Vehiculo normal-7000");
            System.out.println("2.Buses-11000");
            System.out.println("3.Camión pequeño-12000");
            System.out.println("4.Camión grande-24000");
            System.out.println("5.Mulas-37000");
            System.out.println("6.Salir");
            System.out.println("Digite la opción");
            op2 = reader.nextInt();

            switch (op2) {
                case 1:
                    c++;
                    porcveh = c / contadora * 100;
                    vn = vn + 7000;
                    break;
                case 2:
                    b++;
                    porcbus = b / contadora * 100;
                    bus = bus + 11000;
                    break;
                case 3:
                    cp++;
                    porccp = cp / contadora * 100;
                    cpe = cpe + 12000;
                    break;
                case 4:
                    cg++;
                    porcg= cg/contadora*100;
                    cgra= cgra+24000;
                    break;
                case 5:
                    m++;
                    porcm= m/contadora*100;
                    mul= mul+37000;
                    break;
                default:
                    break;
            }
            System.out.println("La cantidad de vehiculos normal fue de: " + c);
            System.out.println("La cantidad de buses fue de: " + b);
            System.out.println("La cantidad de camiones pequeños fue de: " + cp);
            System.out.println("La cantidad de camiones grandes fue de: " + cg);
            System.out.println("La cantidad de mulas fue de: " + m);
                

        } while (op1 !=2);

    }
}
