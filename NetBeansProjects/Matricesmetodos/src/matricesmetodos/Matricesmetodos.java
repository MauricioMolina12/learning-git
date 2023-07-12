package matricesmetodos;

import java.util.*;

public class Matricesmetodos {

    public static void leermatriz(int[][] matriz, int f, int c) {
        Random rnd= new Random ();
        int i;
        int j;
        Scanner leer = new Scanner(System.in);
        for (i = 0; i < f; i++) {
            for (j = 0; j < c; j++) {
                matriz[i][j] = rnd.nextInt(20);

            }

        }
    }

    public static void sumarf(int[][] matriz, int f, int c) {
        int sumaf = 0, a = 0, b;
        int[] vs = new int[f];
        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) {
                vs[i] += matriz[i][j];
               
            }

        }
        for (int i = 0; i < f; i++) {
             System.out.println("\nla suma de la fila [" + i + "] es: " + vs[i]);
            
        }
    }
    public static void sumarc(int [][] matriz, int f, int c){
        int sumac=0, a=0, b;
        int [] vsc = new int [c];
        for (int j = 0; j < c; j++) {
            for (int i = 0; i < f; i++) {
                vsc[j]+=matriz[i][j];
                
            }
            
        }
        for (int j = 0; j < c; j++) {
            System.out.println("\nLa suma de la columna ["+j+"] es: " + vsc[j]);
            
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

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Digitar filas");
        int f = leer.nextInt();

        System.out.println("Digitar columnas");
        int c = leer.nextInt();

        int matriz[][] = new int[f][c];
        leermatriz(matriz, f, c);
        System.out.println("\nLa matriz generada es: ");
        mostrarm(matriz, f, c);

        sumarf(matriz, f, c);
        sumarc(matriz,f,c);

    }

}
