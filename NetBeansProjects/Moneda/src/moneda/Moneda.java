package moneda;

import java.util.*;

public class Moneda {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        for (int n = 1; n <= 10; n++) {
            int f = 1;
            for (int i = 1; i <= n; i++) {
                f *= i;    //  equivalente a f = f * i             

            }
            System.out.print("El factorial de " + n);
            System.out.println(" es: " + f);
        }

    }

}
