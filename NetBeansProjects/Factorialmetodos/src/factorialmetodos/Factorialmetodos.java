package factorialmetodos;

import java.util.*;

public class Factorialmetodos {

    public static int factorial(int num) {
        int fac = 1;
        if (num == 0) {
            return 1;

        } else {
            for (int i = 1; i <= num; i++) {
                fac = fac * i;
            }
            return fac;
        }
    }


    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Digite el número que le quiere sacar factorial");
        int num=leer.nextInt();
        System.out.println("El factorial es: " + factorial(num));
    }

}
