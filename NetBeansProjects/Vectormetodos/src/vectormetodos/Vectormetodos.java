package vectormetodos;

import java.util.*;

public class Vectormetodos {

    public static double pasar(double c) {

        double fa;
        fa = 32 + (9 * c / 5);

        return fa;

    }

    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);
        
        System.out.println("Digite los grados centigrados a convertir");
        double c= l.nextDouble();
        
        System.out.println("Los grados a convertir : " + pasar(c));
    }

}
