package parcial1mauricio_molina_punto2;

import java.util.*;

public class Parcial1Mauricio_Molina_punto2 {

    public static int[] cola1 = new int[5];

    public static int[] cola2 = new int[cola1.length];

    public static int[] cola3 = new int[cola1.length];

    public static int fr1 = 0;

    public static int fi1 = 4;

    public static int fr2 = -1;

    public static int fi2 = -1;

    public static int fr3 = -1;

    public static int fi3 = -1;

    public static void main(String[] args) {

        Random rnd = new Random();
        System.out.println("cola generada: ");

        for (int i = 0; i < cola1.length; i++) {
            cola1[i] = rnd.nextInt(40);
            System.out.print(cola1[i] + "\t");
        }

        Scanner leer = new Scanner(System.in);
        System.out.println("");
        System.out.println("Que dato desea eliminar: ");
        int dato = leer.nextInt();

        boolean vf = false;

        while (!vf) {

            if (fr1 == cola1.length) {
                System.out.println("no se encontró el dato");

            }

            if (fr1 < cola1.length && cola1[fr1] != dato) {

                if (fr2 == -1 && fi2 == -1) {
                    fr2++;
                    fi2++;

                    cola2[fi2] = cola1[fr1];

                    fr1++;

                } else {
                    fi2++;

                    cola2[fi2] = cola1[fr1];
                    fr1++;

                }

            }

            if (fr1 < cola1.length && cola1[fr1] == dato) {
                vf = true;

                fr1++;
                fr3++;
                fi3++;

                while (fi2 != -1 && fr2 <= fi2) {

                    cola3[fi3] = cola2[fr2];

                    fr2++;
                    fi3++;
                }

                while (fr1 <= fi1) {
                    cola3[fi3] = cola1[fr1];

                    fr1++;
                    fi3++;
                }
                System.out.println("Cola nueva");
                int n = fr3;
                for (n = n; n < fi3; n++) {
                    System.out.print(cola3[n] + "\t");
                }

            }

        }

    }

}
