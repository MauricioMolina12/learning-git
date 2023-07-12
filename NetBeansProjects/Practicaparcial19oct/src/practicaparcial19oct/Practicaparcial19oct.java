package practicaparcial19oct;

import java.util.*;

public class Practicaparcial19oct {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Random rnd = new Random();

        System.out.println("Digita cantidad de filas");
        int f = leer.nextInt();
        System.out.println("Digita cantidad de columnas");
        int c = leer.nextInt();

        int[][] M = new int[f][c];
        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) {
                M[i][j] = rnd.nextInt(50) + 10;

            }

        }
        System.out.println("");
        System.out.println("Matriz");
        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(M[i][j] + "\t");

            }
            System.out.println("");

        }
        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) {
                for (int x = 0; x < f; x++) {
                    for (int y = 0; y < c; y++) {
                        if (M[i][j] < M[x][y]) {
                            int t = M[i][j];
                            M[i][j] = M[x][y];
                            M[x][y] = t;

                        }

                    }

                }

            }

        }
        System.out.println("Ordenada de menor a mayor");
        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(M[i][j] + "\t");

            }
            System.out.println("");
        }

        System.out.println("Digite valor a buscar");
        int valorbuscado = leer.nextInt();
        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) {
                if (M[i][j] == valorbuscado) {

                    System.out.println("El valor buscado está en la posición [" + i + "][" + j + "]");

                }
            }
        }

    }

}


