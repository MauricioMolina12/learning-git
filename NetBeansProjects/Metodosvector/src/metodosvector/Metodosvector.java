package metodosvector;

import java.util.*;

public class Metodosvector {

    public static void leervector(int[] vector, int t) {

        Random rnd = new Random();
        for (int i = 0; i < t; i++) {
            vector[i] = rnd.nextInt(20);

        }

    }

    public static void mostrarv(int[] vector, int t) {
        for (int i = 0; i < t; i++) {
            System.out.print(vector[i] + "\t");

        }
    }

    public static void burbuja(int[] vector, int t) {
        int i, j;
        for (i = t - 1; i > 0; i--) {
            for (j = 0; i > j; j++) {
                if (vector[j] > vector[j + 1]) {
                    t = vector[j];
                    vector[j] = vector[j + 1];
                    vector[j + 1] = t;

                }
            }

        }
    }

    public static void insercción(int[] vector, int t) {
        int i, j, aux;
        for (i = 1; i < t; i++) {
            aux = vector[i];
            j = i;
            while (j > 0 && vector[j - 1] > aux) {
                vector[j] = vector[j - 1];
                j = j - 1;

            }
            vector[j] = aux;
        }
    }

    public static void selección(int[] vector, int t) {
        int i, j, aux;
        for (i = 0; i < t - 1; i++) {

            int k = i;
            aux = vector[i];
            for (j = i + 1; j < t; j++) {
                if (vector[j] < aux) {
                    aux = vector[j];
                    k = j;

                }

            }
            vector[k] = vector[i];
            vector[i] = aux;
        }
    }

    public static void shell(int[] vector, int t) {
        int i, j, aux;
        int salto;
        boolean cambios;
        for (salto = vector.length / 2; salto != 0; salto /= 2) {
            cambios = true;
            while (cambios) {
                cambios = false;
                for (i = salto; i < vector.length; i++) {
                    if (vector[i - salto] > vector[i]) {
                        t = vector[i];
                        vector[i] = vector[i - salto];
                        vector[i - salto] = t;
                        cambios = true;
                    }
                }
            }
        }
    }

    public static void shaker(int[] vector, int t) {
        int i, j, aux;
        int limInferior = 0;
        int limSuperior = t - 1;

        while (limInferior <= limSuperior) {
            for (j = limInferior; j < limSuperior; j++) {
                if (vector[j] > vector[j + 1]) {
                    t = vector[j];
                    vector[j] = vector[j + 1];
                    vector[j + 1] = t;

                }

            }
            limSuperior--;
            for (j = limSuperior; j > limInferior; j--) {
                if (vector[j] < vector[j - 1]) {
                    t = vector[j];
                    vector[j] = vector[j - 1];
                    vector[j - 1] = t;

                }

            }
            limInferior++;
        }
    }

    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);

        int opc, i, n;

        do {

            System.out.println("\nMetodos de ordenamiento para el vector");
            System.out.println("1.Burbuja");
            System.out.println("2.Insercción");
            System.out.println("3.Selección");
            System.out.println("4.Shell");
            System.out.println("5.Shaker");
            System.out.println("6.Salir");
            System.out.println("Digite el metodo por el cúal quiera ordenar el vector");
            opc = l.nextInt();

            switch (opc) {
                case 1:
                    System.out.println("Digite el tamaño del vector");
                    n = l.nextInt();

                    int vector[] = new int[n];
                    leervector(vector, n);

                    System.out.println("\nEl vector generado es: ");
                    mostrarv(vector, n);
                    burbuja(vector, n);
                    System.out.println("\nEl vector ordenado es: ");
                    mostrarv(vector, n);
                    break;
                case 2:
                    System.out.println("Digite el tamaño del vector");
                    n = l.nextInt();

                    vector = new int[n];
                    leervector(vector, n);

                    System.out.println("\nEl vector generado es: ");
                    mostrarv(vector, n);
                    insercción(vector, n);
                    System.out.println("\nEl vector ordenado es: ");
                    mostrarv(vector, n);
                    break;
                case 3:
                    System.out.println("Digite el tamaño del vector");
                    n = l.nextInt();

                    vector = new int[n];
                    leervector(vector, n);

                    System.out.println("\nEl vector generado es: ");
                    mostrarv(vector, n);
                    selección(vector, n);
                    System.out.println("\nEl vector ordenado es: ");
                    mostrarv(vector, n);
                    break;
                case 4:
                    System.out.println("Digite el tamaño del vector");
                    n = l.nextInt();

                    vector = new int[n];
                    leervector(vector, n);

                    System.out.println("\nEl vector generado es: ");
                    mostrarv(vector, n);
                    shell(vector, n);
                    System.out.println("\nEl vector ordenado es: ");
                    mostrarv(vector, n);
                    break;
                case 5:
                    System.out.println("Digite el tamaño del vector");
                    n = l.nextInt();

                    vector = new int[n];
                    leervector(vector, n);

                    System.out.println("\nEl vector generado es: ");
                    mostrarv(vector, n);
                    shaker(vector, n);
                    System.out.println("\nEl vector ordenado es: ");
                    mostrarv(vector, n);
                    break;
            }

        } while (opc != 6);
        System.out.println("Fin del programa");

    }
}
