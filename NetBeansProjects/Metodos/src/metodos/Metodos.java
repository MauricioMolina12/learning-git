package metodos;

import java.util.*;

public class Metodos {

    public static void matricular(String primernombre, String segundonombre, String primerapellido, String segundoapellido, int edad, String seccional, String ti, int id, String programa) {

        Persona2 etde1 = new Persona2(primernombre, segundonombre, primerapellido, segundoapellido, edad, seccional, ti, id, programa);

    }

    public static void imprimir(String primernombre, String segundonombre, String primerapellido, String segundoapellido, int edad, String seccional, String ti, int id, String programa) {
        Persona2 etde1 = new Persona2(primernombre, segundonombre, primerapellido, segundoapellido, edad, seccional, ti, id, programa);

        etde1.imprimir(primernombre, segundonombre, primerapellido, segundoapellido, edad, seccional, ti, id, programa);
    }

    public static void agregar(String primernombre, String segundonombre, String primerapellido, String segundoapellido, int edad, String seccional, String ti, int id, String programa) {
        Persona2 etde1 = new Persona2(primernombre, segundonombre, primerapellido, segundoapellido, edad, seccional, ti, id, programa);
        etde1.setPrimernombre(primernombre);
        etde1.setSegundonombre(segundonombre);
        etde1.setPrimerapellido(primerapellido);
        etde1.setSegundoapellido(segundoapellido);
        etde1.setEdad(edad);
        etde1.setSeccional(seccional);
        etde1.setTi(ti);
        etde1.setId(id);
        etde1.setPrograma(programa);
    }

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("PROGRAMA DE INSCRIPCIÓN A LA UNIVERSIDAD LIBRE");
        System.out.println("");
        System.out.println("Digite nombre de estudiante");
        String primernombre = leer.next();
        System.out.println("Digite el segundo nombre");
        String segundonombre = leer.next();

        System.out.println("Digite el primer apellido del estudiante");
        String primerapellido = leer.next();

        System.out.println("Digite el segundo apellido");
        String segundoapellido = leer.next();

        System.out.println("Digite la edad");
        int edad = leer.nextInt();

        System.out.println("Digite la seccional");
        String seccional = leer.next();

        System.out.println("Digite el tipo de identificación");
        String ti = leer.next();

        System.out.println("Digite el número de identificación");
        int id = leer.nextInt();

        System.out.println("Digite el programa a cursar");
        String programa = leer.next();

        System.out.println("¿Quiere agregar otro estudiante? 1.Si, 2.no");
        int op = leer.nextInt();

        if (op == 1) {
            System.out.println("Digite nombre de estudiante");
            primernombre = leer.next();
            System.out.println("Digite el segundo nombre");
            segundonombre = leer.next();

            System.out.println("Digite el primer apellido del estudiante");
            primerapellido = leer.next();

            System.out.println("Digite el segundo apellido");
            segundoapellido = leer.next();

            System.out.println("Digite la edad");
            edad = leer.nextInt();

            System.out.println("Digite la seccional");
            seccional = leer.next();

            System.out.println("Digite el tipo de identificación");
            ti = leer.next();

            System.out.println("Digite el número de identificación");
            id = leer.nextInt();

            System.out.println("Digite el programa a cursar");
            programa = leer.next();

        }
        matricular(primernombre, segundonombre, primerapellido, segundoapellido, edad, seccional, ti, id, programa);
        imprimir(primernombre, segundonombre, primerapellido, segundoapellido, edad, seccional, ti, id, programa);
        agregar(primernombre, segundonombre, primerapellido, segundoapellido, edad, seccional, ti, id, programa);
    }

}
