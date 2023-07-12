package parcial2punto2;

import java.util.*;

public class Parcial2punto2 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int M[][] = new int[10][10];
        int n = 6;
        int inicio = 0;
        int nlimite = n - 1;
        int c = 1;
        while (c <= (n * n)) {
            for (int i = inicio; i <= nlimite; i++) {
                M[inicio][i] = c++;
            }
            for (int i = inicio + 1; i <= nlimite; i++) {
                M[i][nlimite] = c++;
            }
            for (int i = nlimite - 1; i >= inicio; i--) {
                M[i][inicio] = c++;

            }
            inicio = inicio+1;
            nlimite= nlimite-1;
        }
        for (int i = 0; i < n; i++) {
            System.out.println();
            for (int j = 0; j < n; j++) {
                System.out.print(M[i][j] + "\t");
                
            }
            
        }

    }
}
