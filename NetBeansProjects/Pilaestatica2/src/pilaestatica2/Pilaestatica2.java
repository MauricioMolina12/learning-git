package pilaestatica2;

import java.util.*;

public class Pilaestatica2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();
        System.out.println("Escriba el tamaño de la pila");
        int tp = sc.nextInt();
        System.out.println("");
        int u = tp;
        int s = 0;
        int tp2 = 0;

        int pila[] = new int[tp];
        int pila2[] = new int[tp];
        int na = 0;
        for (int i = 0; i < tp; i++) {
            pila[i] = rnd.nextInt(10);
            pila2[i] = 0;
            System.out.println(pila[i]);
        }

         System.out.println("Ingrese el dato a eliminar:");
        int dato = sc.nextInt();

        System.out.println("");
        System.out.println("");

        while (s < u) {
            tp2++;
            pila2[tp2 - 1] = pila[tp - 1];
            tp--;

            if (pila2[tp2 - 1] == dato & na != 1) {
                tp2 -= 1;
                na = 1;
            }

            s++;
        }

        for (int i = 0; i < tp2; i++) {
            System.out.println(pila2[i]);
        }

        if (na == 0) {
            System.out.println("El dato no se encontró");
        }
 /*System.out.println("Ingrese el dato a contar: ");
        int dato = sc.nextInt();

        while (s < u) {
            tp2++;
            pila2[tp2 - 1] = pila[tp - 1];
            if (pila2[tp2 - 1] == dato) {
                na++;
            }
            tp--;
            s++;
        }
        System.out.println("El numero ingresado se ha repetido " + na + " veces.");*/
        /*System.out.println("Ingrese el dato a eliminar:");
        int dato = sc.nextInt();

        System.out.println("");
        System.out.println("");

        while (s < u) {
            tp2++;
            pila2[tp2 - 1] = pila[tp - 1];
            tp--;

            if (pila2[tp2 - 1] == dato) {
                tp2 -= 1;
                na = 1;
            }

            s++;
        }

        for (int i = 0; i < tp2; i++) {
            System.out.println(pila2[i]);
        }

        if (na == 0) {
            System.out.println("El dato no se encontró");
        }*/

    }
}

