package colas;

import java.util.*;

public class Colas {

    public static int[] cola = new int[6];

    public static int[] cola2 = new int[6];

    public static int[] cola3 = new int[6];

    public static int fr = 0;

    public static int fi = 5;

    public static int fr2 = -1;

    public static int fi2 = -1;

    public static int fr3 = -1;

    public static int fi3 = -1;

    public static void mostrarcola() {

        for (int i = 0; i < cola.length; i++) {
            System.out.println(cola[i]);
        }

    }

    public static void rellenarcolavacia() {
        for (int i = 0; i < cola.length; i++) {
            cola[i] = 0;
        }
    }

    public static void eliminardato(int dato) {
        boolean encontrado = false;

        while (!encontrado) {

            if (fr == cola.length) {
                System.out.println("no se encontró el dato");
                break;
            }

            if (fr < cola.length && cola[fr] != dato) {

                if (fr2 == -1 && fi2 == -1) {
                    fr2++;
                    fi2++;

                    cola2[fi2] = cola[fr];

                    fr++;

                } else {
                    fi2++;

                    cola2[fi2] = cola[fr];
                    fr++;

                }

            }

            if (fr < cola.length && cola[fr] == dato) {
                encontrado = true;

                fr++;
                fr3++;
                fi3++;

                while (fi2 != -1 && fr2 <= fi2) {

                    cola3[fi3] = cola2[fr2];

                    fr2++;
                    fi3++;
                }

                while (fr <= fi) {
                    cola3[fi3] = cola[fr];

                    fr++;
                    fi3++;
                }
                System.out.println("Cola nueva");
                int j = fr3;
                for (j = j; j < fi3; j++) {
                    System.out.print(cola3[j] + "    ");
                }

            }

        }

    }

    public static void main(String[] args) {

        Random rnd = new Random();
        System.out.println("cola normal: ");

        for (int i = 0; i < cola.length; i++) {
            cola[i] = rnd.nextInt(20) + 1;
            System.out.print(cola[i] + "   ");
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("");
        System.out.println("Que dato desea eliminar: ");
        int dato = sc.nextInt();

        System.out.println("");
        System.out.println("");

        eliminardato(dato);

    }
}
