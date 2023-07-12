package calculadora;

import java.util.*;

public class Calculadora {

    public static void tiempo(int h) {

        double s = h * 3600;

        System.out.println("En " + h + " hora(s) hay " + s + " segundos.");
        System.out.println("____________________________________________________");
    }

    public static void distancia(int km) {

        double m = km * 1000;

        System.out.println("En " + km + " kilometro(s) hay " + m + " metros.");
        System.out.println("____________________________________________________");

    }

    public static void velocidad(int k) {

        double m = k / 3.6;
        System.out.println("En " + k + " km/h hay " + m + " m/s");
        System.out.println("____________________________________________________");

    }

    public static void fuerza(double masa) {

        double f = masa * 9.8;
        System.out.println("La fuerza es de: " + f + " N");
        System.out.println("____________________________________________________");
    }
    public static void kilometros (double v, int t){
        
        double k = v * t;
        System.out.println("Kilometros: " + k);
        System.out.println("____________________________________________________");
    }

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int opc;
        do {

            System.out.println("CALCULADORA CIENTIFICA");
            System.out.println("1.Convertir hora a segundo");
            System.out.println("2.Convertir de kilometros a metros");
            System.out.println("3.Convertir de km/h a m/s");
            System.out.println("4.Hallar fuerza");
            System.out.println("5.Hallar Kilometros");
            System.out.println("10.Salir del programa");
            System.out.println("");
            System.out.println("Digite opción");
            opc = leer.nextInt();

            switch (opc) {
                case 1:
                    System.out.println("");
                    System.out.println("Digite hora(s) a convertir");
                    int h = leer.nextInt();
                    tiempo(h);
                    break;
                case 2:
                    System.out.println("");
                    System.out.println("Digite kilometro (s) a convertir");
                    int km = leer.nextInt();
                    distancia(km);
                    break;
                case 3:
                    System.out.println("");
                    System.out.println("Digite km/h a convertir");
                    int k = leer.nextInt();
                    velocidad(k);
                    break;
                case 4:
                    System.out.println("");
                    System.out.println("La aceleración es un valor constante (9,8 m/s^2)");
                    System.out.println("Digite la masa");
                    double masa = leer.nextInt();
                    fuerza(masa);
                    break;
                case 5:
                    System.out.println("");
                    System.out.println("Digita velocidad (km/h) ");
                    double v = leer.nextInt();
                    
                    System.out.println("Digita tiempo (hrs) ");
                    int t = leer.nextInt();
                    
                    kilometros(v,t);
                    break;
                case 10:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opción errada");
                    System.out.println("");
            }
        } while (opc != 10);

    }

}
