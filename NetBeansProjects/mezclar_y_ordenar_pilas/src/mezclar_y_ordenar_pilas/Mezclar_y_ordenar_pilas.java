package mezclar_y_ordenar_pilas;

import java.util.*;

public class Mezclar_y_ordenar_pilas {

    static public int pila1[];
    static public int pila2[];
    static public int pila3[];
    static public int pila4[];
    static public int pila5[];
    static public int tope1 = 0;
    static public int tope2 = 0;
    static public int tope3 = 0;
    static public int tope4 = 0;
    static public int tope5 = 0;
    static public boolean vf = false;
    static public int t;

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Random rnd = new Random();
        int aux = 0;
        System.out.println("Digite tamaño de la pila 1");
        int t1 = leer.nextInt();
        int[] pila1 = new int[t1];
        System.out.println("Digite tamaño de la pila 2");
        int t2 = leer.nextInt();
        int[] pila2 = new int[t2];
        int[] pila3 = new int[t1 + t2];
        int[] pila4 = new int[pila3.length];
        int[] pila5 = new int[pila3.length];
        t = t1 + t2;

        System.out.println("Pila 1" + "\n");
        for (int i = 0; i < t1; i++) {
            pila1[i] = rnd.nextInt(20) + 1;
            tope1++;
            System.out.println(pila1[i]);

        }
        System.out.println("");
        System.out.println("Pila 2" + "\n");
        for (int i = 0; i < t2; i++) {
            pila2[i] = rnd.nextInt(20) + 1;
            tope2++;
            System.out.println(pila2[i]);

        }
        while (tope1 > 0) {
            tope1--;
            pila3[tope3] = pila1[tope1];
            tope3++;
        }
        aux = tope3;
        for (int i = aux; i < (t1 + t2); i++) {
            tope2--;
            pila3[tope3] = pila2[tope2];
            tope3++;

        }
        System.out.println("");
        System.out.println("Pila mezclada" + "\n");
        for (int i = 0; i < pila3.length; i++) {
            System.out.println(pila3[i]);

        }

        tope4++;
        pila4[tope4 - 1] = (pila3[tope3 - 1]);
        tope3--;

        while (tope3 > 0) {

            while (tope3 > 0 && pila3[tope3 - 1] >= pila4[tope4 - 1]) {

                tope4++;
                pila4[tope4 - 1] = (pila3[tope3 - 1]);
                tope3--;

            }

            while (tope3 > 0 && tope4 > 0 && pila3[tope3 - 1] < pila4[tope4 - 1]) {
                tope5++;
                pila5[tope5 - 1] = (pila4[tope4 - 1]);
                tope4--;
                vf = true;

            }

            while (vf == true) {
                tope4++;
                pila4[tope4 - 1] = (pila3[tope3 - 1]);
                tope3--;

                while (tope5 > 0) {
                    tope4++;
                    pila4[tope4 - 1] = (pila5[tope5 - 1]);
                    tope5--;

                }

                vf = false;

            }

        }
        System.out.println("");
        System.out.println("Pila ordenada");
        for (int i = 0; i < pila4.length; i++) {
            System.out.println(pila4[i]);

        }
    }
}
