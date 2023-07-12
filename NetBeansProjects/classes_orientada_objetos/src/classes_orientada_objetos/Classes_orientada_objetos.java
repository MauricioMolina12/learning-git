package classes_orientada_objetos;

import java.util.*;

public class Classes_orientada_objetos {

    public static void main(String[] args) {
        Scanner lea = new Scanner(System.in);

        System.out.println("Digite su nombre");
        String nombre = lea.next();

        System.out.println("Digite su edad");
        int edad = lea.nextInt();

        System.out.println("Digite su número telefonico");
        int celul = lea.nextInt();

        System.out.println("Digite su sexo");
        String sexo = lea.next();

        persona1 yo = new persona1(nombre, edad, celul, sexo);
        yo.imprimir3();

    }

}
