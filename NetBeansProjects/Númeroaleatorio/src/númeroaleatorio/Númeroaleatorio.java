package númeroaleatorio;

import java.util.*;

public class Númeroaleatorio {

    public static int generaNumero(int num1, int num2) {
        int resu = (int) Math.floor(Math.random()*(num2-num1)+num1);
        return resu;
    }

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Digite el limite");
        int limite = leer.nextInt();
        System.out.println("Digite el primer número");
        int num1 = leer.nextInt();
        System.out.println("Digite el segundo número");
        int num2 = leer.nextInt();
        
        for (int i = 0; i < limite; i++) {
            System.out.println(generaNumero(num1, num2));
        }
    }
}


    

