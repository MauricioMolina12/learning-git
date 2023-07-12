package david;

import java.util.*;

public class David {

    public static void burbuja(int n) {
        Random rnd = new Random();
        int i, j, t;
        int v[] = new int[n];
        for (i = 0; i < n; i++) {
            v[i] = rnd.nextInt(10) + 1;
        }
        for (i = 0; i < n; i++) {
            System.out.print(v[i] + " - ");
        }
        for (i = n - 1; i > 0; i--) {
            for (j = 0; i > j; j++) {
                if (v[j] > v[j + 1]) {
                    t = v[j];
                    v[j] = v[j + 1];
                    v[j + 1] = t;
                }
            }
        }
        System.out.println("");
        System.out.println("ordenado");
        for (i = 0; i < n; i++) {
            System.out.print(v[i] + " - ");
        }
    }

    public static void seleccion(int n) {
        Random rnd = new Random();
        int i, j, t, k;
        int v[] = new int[n];
        for (i = 0; i < n; i++) {
            v[i] = rnd.nextInt(10) + 1;
        }
        for (i = 0; i < n; i++) {
            System.out.print(v[i] + " - ");
        }
        for (i = 0; i < n - 1; i++) {
            k = i;
            t = v[i];
            for (j = i + 1; j < n; j++) {
                if (v[j] < t) {
                    t = v[j];
                    k = j;
                }
            }
            v[k] = v[i];
            v[i] = t;
        }
        System.out.println("");
        System.out.println("ordenado");
        for (i = 0; i < n; i++) {
            System.out.print(v[i] + " - ");
        }
    }

    public static void insercion(int n) {
        Random rnd = new Random();
        int i, j, t;
        int v[] = new int[n];
        for (i = 0; i < n; i++) {
            v[i] = rnd.nextInt(10) + 1;
        }
        for (i = 0; i < n; i++) {
            System.out.print(v[i] + " - ");
        }
        for (i = 1; i < n; i++) {
            t = v[i];
            j = i;
            while (j > 0 && v[j - 1] > t) {
                v[j] = v[j - 1];
                j = j - 1;
            }
            v[j] = t;
        }
        System.out.println("");
        System.out.println("ordenado");
        for (i = 0; i < n; i++) {
            System.out.print(v[i] + " - ");
        }
    }

    public static void shell(int n) {
        Random rnd = new Random();
        int i, salto, t;
        boolean cambios;
        int v[] = new int[n];
        for (i = 0; i < n; i++) {
            v[i] = rnd.nextInt(10) + 1;
        }
        for (i = 0; i < n; i++) {
            System.out.print(v[i] + " - ");
        }
        for (salto = v.length / 2; salto != 0; salto /= 2) {
            cambios = true;
            while (cambios) {
                cambios = false;
                for (i = salto; i < v.length; i++) {
                    if (v[i - salto] > v[i]) {
                        t = v[i];
                        v[i] = v[i - salto];
                        v[i - salto] = t;
                        cambios = true;
                    }
                }
            }
        }
        System.out.println("");
        System.out.println("ordenado");
        for (i = 0; i < n; i++) {
            System.out.print(v[i] + " - ");
        }
    }

    public static void shaker(int n) {
        Random rnd = new Random();
        int i, j, t;
        int v[] = new int[n];
        for (i = 0; i < n; i++) {
            v[i] = rnd.nextInt(10) + 1;
        }
        for (i = 0; i < n; i++) {
            System.out.print(v[i] + " - ");
        }
    }

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        int opc;

        do {
            System.out.println("");
            System.out.println("menu metodos de ordenamiento vectores");
            System.out.println("1. burbuja");
            System.out.println("2. seleccion");
            System.out.println("3. insercion directa");
            System.out.println("4. shell");
            System.out.println("5. Shaker sort");
            System.out.println("10. Salir");
            System.out.println("Digite el metodo a utilizar");
            opc = read.nextInt();
            switch (opc) {
                case 1:
                    System.out.println("digite el tamaño de el vector");
                    int n = read.nextInt();
                    burbuja(n);
                    break;
            
                case 2: 
                    System.out.println("digite el tamaño de el vector");
                    n = read.nextInt();
                    seleccion(n);
                    break;
                   
                case 3:
                    System.out.println("digite el tamaño de el vector");
                    n = read.nextInt();
                    insercion(n);
                    break;
                
                case 4:
                    System.out.println("digite el tamaño de el vector");
                    n = read.nextInt();
                    shell(n);
                    break;
                
                case 5:
                    System.out.println("digite el tamaño de el vector");
                    n = read.nextInt();
                    shaker(n);
                    break;
                
                default:
                    System.out.println("Error en la opcion o sale del menu");
            }
        
    }
    while (opc != 10);
    }
}
