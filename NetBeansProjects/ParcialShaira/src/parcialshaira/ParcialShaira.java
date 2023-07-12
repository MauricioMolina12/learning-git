package parcialshaira;

import java.util.*;

public class ParcialShaira {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Random rnd = new Random();
        int elecciones[][] = new int[5][5];
        int localidades[] = new int[5];
        int votos[] = new int[5];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                elecciones[i][j] = rnd.nextInt(500) + 100;

            }

        }
        System.out.println("Votos");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(elecciones[i][j] + "\t");

            }
            System.out.println("");
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                localidades[i] += elecciones[i][j];

            }

        }
        System.out.println("___________________________________________________________________________");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                votos[j] += elecciones[i][j];

            }
        }
        System.out.println("___________________________________________________________________________");
        System.out.println("Cantidad de votos por candidato");
        for (int i = 0; i < 5; i++) {
            System.out.println("El candidato [" + i + "] recibió = " + localidades[i] + " votos");
        }
        int mayor = 0;
        int cmy = 0;
        for (int j = 0; j < 5; j++) {
            if (votos[j] > mayor) {
                mayor = votos[j];
                cmy = j;

            }

        }
        System.out.println("___________________________________________________________________________");
        System.out.println("El candidato que más votos recibió fue el candidato [" + cmy + "] con " + mayor + " votos");
        System.out.println("");
        System.out.println("__________________________________________________________________________");
        for (int i = 0; i < 5; i++) {
            int sumaF = 0;
            for (int j = 0; j < 5; j++) {
                sumaF += elecciones[i][j];

            }
            double promedio = sumaF / (5 * 5);
            System.out.println("\nEl promedio de votos del candidadto [" + i + "] es: " + promedio);

        }

    }
}

