package cuadromagico;

import java.util.*;

public class Cuadromagico {

    public static void imprimir(int cuadromagico[][], int tam) {
        for (int i = 0; i < tam; i++) {
            for (int j = 0; j < tam; j++) {
                System.out.print(cuadromagico[i][j] + "\t");
                
            }
            
            System.out.println("");
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int j;
        int i;
        int n;
        System.out.println("Digite el tamaño del cuadro");
        int tam = leer.nextInt();
        System.out.println("");

        int iantes = 0;
        int jantes = 0;

        int[][] cuadromagico = new int[tam][tam];
        for (i = 0; i < tam; i++) {
            for (j = 0; j < tam; j++) {
                cuadromagico[i][j] = 0;

            }
        }
        n = 1;
        i = 0;
        j = (tam - 1) / 2 + 1;
        j--;
        while (n != (tam * tam) + 1) {
            if (cuadromagico[i][j] == 0) {
                cuadromagico[i][j] = n;
            } else {
                i = iantes + 1;
                j = jantes;
                cuadromagico[i][j] = n;

            }
            iantes = i;
            jantes = j;

            n++;
            j++;
            i--;
            if (i < 0 && j == tam) {
                i = tam - 1;
                j = 0;
            } else if (i < 0) {
                i = i + tam;
            } else if (j == tam) {
                j = 0;

            }
        }

        imprimir(cuadromagico, tam);

    }

}
