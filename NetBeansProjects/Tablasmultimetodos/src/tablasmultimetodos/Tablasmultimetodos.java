package tablasmultimetodos;

import java.util.*;

public class Tablasmultimetodos {

    public static void tabla(int num) {

        for (int i = 1; i <= 20; i++) {

            System.out.println(num + "x" + i + "=" + i * num);

        }
    }

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Digite un número");
        int num= leer.nextInt();
        
        tabla(num);
    }

}
