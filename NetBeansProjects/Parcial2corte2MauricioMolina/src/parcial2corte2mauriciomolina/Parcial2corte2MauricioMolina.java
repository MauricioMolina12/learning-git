package parcial2corte2mauriciomolina;
//Cree un vector con N elementos, de los cuales va pidiendo o generando aleatoriamente 1 por 1, 
//cada vez que inserte un número este debe “colocarlo” 
//en la posición que le corresponde para que el vector quede ordenado descendentemente 
//y muestre el vector después de cada inserción. 

import java.util.*;

public class Parcial2corte2MauricioMolina {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Random rnd = new Random();
        int i = 0, l, j, a, m, vectemp = 0, aux;

        System.out.println("Ingrese el tamaño del vector");
        int N = leer.nextInt();

        int Vec[] = new int[N];

        for (i = 0; i < N; i++) {
            aux = rnd.nextInt(N);
            Vec[i] = aux;

            for (l = N - 1; l > 0; l--) {
                for (j = 0; l > j; j++) {
                    if (Vec[j] < Vec[j + 1]) {
                        a = Vec[j];
                        Vec[j] = Vec[j + 1];
                        Vec[j + 1] = a;
                    }
                }
            }

            System.out.println("Se lee el " + aux + " Vector");

        }

        // Escribir vector
        for (i = 0; i < N; i++) {
            System.out.print(Vec[i] + "\t");
        }
       
    }

}
