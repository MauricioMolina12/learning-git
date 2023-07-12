package claseprincipal;

import java.util.*;

public class Claseprincipal {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int opc;

        do {
            System.out.println("Digite su primer digito");
            float n1 = read.nextFloat();

            System.out.println("Digite su segundo digito");
            float n2 = read.nextFloat();

            Calculadora C = new Calculadora();
            System.out.println("");
            System.out.println("Calculadora basica");
            System.out.println("¿Que desea hacer?");
            System.out.println("Presione 1 si desea sumar");
            System.out.println("Presione 2 si desea restar");
            System.out.println("Presione 3 si desea multiplicar");
            System.out.println("Presione 4 si desea dividir");
            System.out.println("Presione 5 si desea salir del programa");
            System.out.println("Escoga una opción: ");
            System.out.println("");
            opc = read.nextInt();

            switch (opc) {
                case 1:
                    C.setN1(n1);
                    C.setN2(n2);
                    C.sumar();
                    System.out.println("");
                    break;
                case 2:
                    C.setN1(n1);
                    C.setN2(n2);
                    C.restar();
                    System.out.println("");
                    break;
                case 3:
                    C.setN1(n1);
                    C.setN2(n2);
                    C.multiplicar();
                    System.out.println("");
                    break;
                case 4:
                    C.setN1(n1);
                    C.setN2(n2);
                    if (n1 == 0 && n2 == 0) {
                        System.out.println("Eso es una indeterminación, por lo tanto no se puede realizar.");
                    } else {
                         C.división();
                         System.out.println("");
                    }
                    break;
                case 5:
                    System.exit(0);
                    break;
            }
        } while (opc != 5);

    }

}
