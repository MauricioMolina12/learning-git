package quizcorte3mauricio;

import java.util.*;

public class Quizcorte3Mauricio {

    public static void leermatriz(int[][] matriz, int f, int c) {
        int i;
        int j;
        Random rnd = new Random();
        Scanner leer = new Scanner(System.in);
        for (i = 0; i < f; i++) {
            for (j = 0; j < c; j++) {
                matriz[i][j] = rnd.nextInt(20) + 10;

            }

        }
    }

    public static void mostrarm(int[][] matriz, int f, int c) {
        int i;
        int j;
        for (i = 0; i < f; i++) {
            for (j = 0; j < c; j++) {
                System.out.print(matriz[i][j] + "\t");

            }
            System.out.println("");

        }

    }

    public static void recorridodederechaaizquierda(int[][] matriz, int filas, int columnas) {
        int i, j;
        for (i = 0; i < filas; i++) {
            for (j = filas - 1; j >= 0; j--) {
                System.out.print(matriz[i][j] + "\t");

            }
            System.out.println("");

        }
    }

    public static void Recorridodeabajoaarriba(int[][] matriz, int filas, int columnas) {
        int i, j;
        for (i = 0; i < columnas; i++) {
            for (j = filas - 1; j >= 0; j--) {
                System.out.print(matriz[j][i] + "\t");
            }
            System.out.println("");
        }
    }
    public static void Recorridodearribaabajo(int [][] matriz, int filas, int columnas){
        int i, j;
        for (j = 0; j < columnas; j++) {
            for (i = 0; i < filas; i++) {
                System.out.print(matriz[i][j] + "\t");
                
            }
            System.out.println("");
        }
    }

    public static void matrizSerpientedeizquierrdaaderecha(int[][] matriz, int f, int c) {
        for (int i = 0; i < f; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < c; j++) {
                    System.out.print(matriz[i][j] + "\t");
                }
            } else {
                for (int j = c - 1; j >= 0; j--) {
                    System.out.print(matriz[i][j] + "\t");
                }

            }
            System.out.println("");
        }
    }

    public static void matrizserpientedearribaaabajo(int[][] matriz, int f, int c) {
        for (int j = 0; j < c; j++) {
            if (j % 2 == 0) {
                for (int i = 0; i < f; i++) {
                    System.out.print(matriz[i][j] + "\t");
                }
            } else {
                for (int i = f - 1; i >= 0; i--) {
                    System.out.print(matriz[i][j] + "\t");
                }
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int opc, i, n;
        System.out.println("Digitar filas");
        int f = leer.nextInt();

        System.out.println("Digitar columnas");
        int c = leer.nextInt();

        int matriz[][] = new int[f][c];
        leermatriz(matriz, f, c);
        System.out.println("\nLa matriz generada es: ");
        mostrarm(matriz, f, c);

        do {
            System.out.println("\nRecorridos en la matriz");
            System.out.println("\n1.Recorrido de derecha a izquierda");
            System.out.println("\n2.Recorrido de abajo a arriba");
            System.out.println("\n3.Recorrido de arriba a abajo");
            System.out.println("\n4.Recorrido en serpiente de derecha a izquierda, izquierda a derecha");
            System.out.println("\n5.Recorrido en serpiente de abajo a arriba, arriba a abajo");
            System.out.println("\n6.Salir");
            System.out.println("Digite el recorrido que quiera");
            opc = leer.nextInt();

            switch (opc) {
                case 1:
                    System.out.println("Recorrido de derecha a izquierda");
                    recorridodederechaaizquierda(matriz,f,c);
                    break;
                case 2:
                    System.out.println("Recorrido de abajo a arriba");
                    Recorridodeabajoaarriba(matriz, f, c);
                    break;
                case 3:
                    System.out.println("Recorrido de arriba a abajo");
                    Recorridodearribaabajo(matriz,f,c);
                    break;
                case 4:
                    System.out.println("matriz en forma de serpiente en forma horizontal de izquierda a derecha : ");
                    matrizSerpientedeizquierrdaaderecha(matriz, f, c);
                    break;
                case 5:
                    System.out.println("matriz en forma de serpiente vertical de arriba a abajo : ");
                    matrizserpientedearribaaabajo(matriz, f, c);
                    break;
                default:

            }
        } while (opc != 6);

    }

}
