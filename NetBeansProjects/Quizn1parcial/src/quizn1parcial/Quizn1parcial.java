package quizn1parcial;

import java.util.*;

public class Quizn1parcial {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        int contvoc1 = 0;
        int contvoc2 = 0;
        int contvoc3 = 0;
        int contvoc4 = 0;
        int contvoc5 = 0;
        String frase;

        int[] V = {0, 0, 0, 0, 0};
        char[] vocal = {'a', 'e', 'i', 'o', 'u'};

        System.out.println("Digite una frase");
        frase = leer.next();

        int N = frase.length();

        char[] Vector = new char[N];
        for (int i = 0; i < N; i++) {
            Vector[i] = frase.charAt(i);

        }
        System.out.println("La frase digitada es " + frase);
        for (int i = 0; i < N; i++) {
            System.out.println("La letra en la posición [" + i + "] es: " + Vector[i] + "\t");

        }

        for (int i = 0; i < frase.length(); i++) {

            if (Vector[i] == vocal[0]) {
                contvoc1++;

            } else if (Vector[i] == vocal[1]) {
                contvoc2++;
            } else if (Vector[i] == vocal[2]) {
                contvoc3++;
            } else if (Vector[i] == vocal[3]) {
                contvoc4++;
            } else if (Vector[i] == vocal[4]) {
                contvoc5++;
            }
        }
        V[0] = contvoc1;
        V[1] = contvoc2;
        V[2] = contvoc3;
        V[3] = contvoc4;
        V[4] = contvoc5;

        System.out.println("La frase ingresada tiene " + V[0] + " a");
        System.out.println("La frase ingresada tiene " + V[1] + " e");
        System.out.println("La frase ingresada tiene " + V[2] + " i");
        System.out.println("La frase ingresada tiene " + V[3] + " o");
        System.out.println("La frase ingresada tiene " + V[4] + " u");

    }
}
