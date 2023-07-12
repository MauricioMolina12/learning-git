package cuadradomagico;
import java.util.*;
public class Cuadradomagico {

    public static void show(int matriz[][], int fc) {
        for (int i = 0; i < fc; i++) {
            for (int j = 0; j < fc; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println("");
    }

    public static void main(String args[]) {
     
        Scanner leer = new Scanner(System.in);

        int n = 1;

        System.out.println("Ingrese el numero de filas y columnas:");

        int fc = leer.nextInt();

        int[][] matriz = new int[fc][fc];

        for (int i = 0; i < fc; i++) {
            for (int j = 0; j < fc; j++) {
                matriz[i][j] = 0;

            }

        }

        int i = 0;
        int j = (fc - 1) / 2 + 1;
        j--;

        while (matriz[i][j] == 0) {
            matriz[i][j] = n;
            if (i == 0 & j == fc - 1) {
                i++;
            } else {
                i--;
                j++;
                if (i == -1) {
                    i = fc - 1;
                }
                if (j == fc) {
                    j = 0;
                }
                if (matriz[i][j] != 0) {
                    i += 2;
                    j--;
                }
            }

            n++;
            show(matriz, fc);
        }

    }

}


