package numerodecifrasmetodos;

import java.util.*;

public class Numerodecifrasmetodos {

    public static int contador(int numero) {
        int c = 0;
        for (int i = numero; i > 0; i /= 10) {
            c++;

        }
        return c;
    }

    public static void main(String[] args) {
        Scanner leer= new Scanner (System.in);
        
        int numero=0;
        do {
            System.out.println("Digite un número");
            numero= leer.nextInt();
        } while (numero<0);
        
        int contarcifras= contador(numero);
        
        if (contarcifras == 1) {
            System.out.println("El numero " + numero + " tiene " + contarcifras + " cifra");
        } else {
            System.out.println("El numero " + numero + " tiene " + contarcifras + " cifras");
            
        }
        

    }
}
