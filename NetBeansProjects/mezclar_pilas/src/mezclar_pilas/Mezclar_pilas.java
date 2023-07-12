package mezclar_pilas;

import java.util.*;

public class Mezclar_pilas {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Random rnd = new Random();
        System.out.println("Ingrese tamano de la 1 pila");
        int tamano = leer.nextInt();
        int[] pila = new int[tamano];
        System.out.println("Ingrese tamano de la 2 pila");
        int tamano2 = leer.nextInt();
        int[] pila2 = new int[tamano2];
        int[] pila3 = new int[tamano + tamano2];
        int tope = 0;
        int tope2 = 0;
        int tope3 = 0;
        int temp = 0;
        for (int i = 0; i < tamano; i++) {
            System.out.println("Digite");
            tope = tope + 1;
            System.out.println(pila[i]);
        }
        System.out.println("Pila 2");
        for (int i = 0; i < tamano2; i++) {
            pila2[i] = rnd.nextInt(20);
            tope2 = tope2 + 1;
            System.out.println(pila2[i]);

        }
        while (tope > 0) {
            tope = tope - 1;
            pila3[tope3] = pila[tope];
            tope3 = tope3 + 1;
        }

        temp = tope3;
        for (int i = temp; i < (tamano + tamano2); i++) {
            tope2 = tope2 - 1;
            pila3[tope3] = pila2[tope2];
            tope3 = tope3 + 1;

        }
        System.out.println("Pila mezclada");
        for (int i = 0; i < (tamano + tamano2); i++) {
            System.out.println(pila3[i]);

        }

    }

}
