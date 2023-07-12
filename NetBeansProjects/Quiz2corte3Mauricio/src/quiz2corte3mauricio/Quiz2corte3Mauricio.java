package quiz2corte3mauricio;

import java.util.*;

public class Quiz2corte3Mauricio {

    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);
        int opc, opctwo;
        Asignatura calculo = new Asignatura(11274, "Calculo integral", "calculo universitario", 1043476);
        Asignatura estructura = new Asignatura(12285, "Estructuras lenguaje", "Programación amateur", 1042473);

        do {
            System.out.println("\nMENÚ");
            System.out.println("1.Imprimir todos los datos de ambas asignaturas");
            System.out.println("2.Cambiar el nombre del libro guía de cualquiera de las asignaturas");
            System.out.println("3.Dado un código solicitado por el usuario, comprobar si coincide con alguna de las dos asignaturas que se tienen, imprimir el nombre del libro o texto guía.");
            System.out.println("4.Comprobar si el mismo docente ambas asignaturas o perteneces a diferente docente.");
            System.out.println("5.Salir");
            System.out.println("");
            System.out.println("Digite la opción que va a querer");
            opc = l.nextInt();

            switch (opc) {
                case 1:
                    calculo.imprimir();
                    System.out.println("El texto guía es: " + calculo.getTextoguia());
                    estructura.imprimir();
                    System.out.println("El texto guía es: " + estructura.getTextoguia());
                    break;
                case 2:
                    System.out.println("Diga el libro que le cambiará el nombre: 1.Calculo, 2.Estructura");
                    opctwo = l.nextInt();
                    if (opctwo == 1) {
                        System.out.println("Diga el nuevo nombre que tendrá la materia de calculo");
                        String nom = l.next();
                        calculo.setLibroguia(nom);

                    } else {
                        System.out.println("Diga el nuevo nombre que tendrá la materia de estructuras");
                        String nomtwo = l.next();
                        estructura.setLibroguia(nomtwo);
                    }
                    break;
                case 3:
                    System.out.println("Digite el codigo de la asignatura");
                    int cod = l.nextInt();

                    if (cod == 11274) {
                        System.out.println("El texto guía es: " + "calculo universitario");

                    }
                    if (cod == 12285) {
                        System.out.println("El texto guía es: " + "Programación amateur");

                    }
                    break;
                case 4:
                    System.out.println("Digite la cedula del docente");
                    int cedcod = l.nextInt();

                    if (calculo.ceddoc == estructura.ceddoc) {
                        System.out.println("Tienen el mismo docente");

                    } else {
                        System.out.println("Tienen diferente docente");
                    }
                    break;
                default:
                    System.out.println("Escoga bien");
                    break;
            }
        } while (opc != 5);
        System.out.println("Fin del programa");

    }

}
