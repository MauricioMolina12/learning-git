package cuentacifrasapp;

import java.util.*;

public class CuentaCifrasApp {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int numero = 0;
        do {
            System.out.println("Digite un número");
            numero = leer.nextInt();
        } while (numero < 0);
        
        int numCifras = cuentaCifras(numero);

        if (numCifras == 1) {
            System.out.println("El numero " + numero + " tiene " + numCifras + " cifra");
        } else {
            System.out.println("El numero " + numero + " tiene " + numCifras + " cifras");
        }
    }

    public static int cuentaCifras(int numero) {
        int contador = 0;
        for (int i = numero; i > 0; i /= 10) {
            //Incrementamos el contador
            contador++;
        }
        return contador;
    }

}
