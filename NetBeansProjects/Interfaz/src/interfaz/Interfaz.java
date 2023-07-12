package interfaz;

import java.util.Scanner;

public class Interfaz {

    public static void main(String[] args) {
        Scanner lea = new Scanner(System.in);

        int opción;
        Operaciones calculadora = new Operaciones();

        System.out.println("Digite su primer número");
        double digito1 = lea.nextDouble();

        System.out.println("");
        System.out.println("¿Que operación deseas realizar?");
        System.out.println("1.Suma");
        System.out.println("2.Resta");
        System.out.println("3.Multiplicación");
        System.out.println("4.División");
        System.out.println("5.Terminar");
        System.out.println("");
        opción = lea.nextInt();
        
        System.out.println("");
        System.out.println("Digite su segundo número");
        double digito2 = lea.nextDouble();

        switch (opción) {

            case 1:
                calculadora.setDigito1(digito1);
                calculadora.setDigito2(digito2);
                calculadora.suma();
                System.out.println("");
                System.out.println("Resultado suma ->: " + calculadora.suma());
                System.out.println("");
                break;

            case 2:
                calculadora.setDigito1(digito1);
                calculadora.setDigito2(digito2);
                calculadora.resta();
                System.out.println("");
                System.out.println("Resultado resta ->: " + calculadora.resta());
                System.out.println("");
                break;
            case 3:
                calculadora.setDigito1(digito1);
                calculadora.setDigito2(digito2);
                calculadora.producto();
                System.out.println("");
                System.out.println("Resultado multiplicación ->: " + calculadora.producto());
                System.out.println("");
                break;
            case 4:
                calculadora.setDigito1(digito1);
                calculadora.setDigito2(digito2);
                if (digito2 == 0) {
                    System.out.println("");
                    System.out.println("INDETERMINADO");
                }else{
                    calculadora.división();
                    System.out.println("");
                    System.out.println("Resultado división ->: " + calculadora.división());
                    System.out.println("");
                }
                break;
            default:
                System.out.println("Opción errada o salir");
        }

    }

}
