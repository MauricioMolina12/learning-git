package empresa;

import java.util.*;

public class Empresa {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        double salud = 0;
        double pensión = 0;
        double sueldot = 0;
        double valorh = 50.000;
        double sueldof = 0;

        System.out.println("¿Cual es su nombre?");
        String nombre = leer.next();

        System.out.println("¿Cual es su apellido?");
        String apellido = leer.next();

        System.out.println("Digite su número de identificación");
        int id = leer.nextInt();

        System.out.println("Digite su sueldo");
        int sueldobase = leer.nextInt();

        System.out.println("Digite las horas trabajadas extras");
        int horas = leer.nextInt();

        pensión = sueldobase * 8 / 100;
        salud = sueldobase * 4 / 100;
        sueldot = horas * valorh + sueldobase - salud;
        sueldof = sueldot - pensión;
        System.out.println("Su sueldo final incluyendo sus horas extras trabajadas y descontando el insumo de salud y pensión es de " + sueldof);

        Trabajador empleado1 = new Trabajador(nombre, apellido, id, sueldobase, horas, valorh, salud, pensión, sueldot, sueldof);
        empleado1.imprimir(nombre, apellido, id, sueldobase, horas, valorh, salud, pensión, sueldot, sueldof);

        System.out.println("¿Quiere agregar a otro empleado? 1.si, 2.no");
        int op = leer.nextInt();
        if (op == 1) {

            System.out.println("¿Cual es su nombre?");
            nombre = leer.next();
            empleado1.setNombre(nombre);

            System.out.println("¿Cual es su apellido?");
            apellido = leer.next();
            empleado1.setApellido(apellido);

            System.out.println("Digite su número de identificación");
            id = leer.nextInt();
            empleado1.setApellido(apellido);

            System.out.println("Digite su sueldo");
            sueldobase = leer.nextInt();
            empleado1.setSueldobase(sueldof);

            System.out.println("Digite las horas trabajadas extras");
            horas = leer.nextInt();
            empleado1.setHoras(horas);

            empleado1.imprimir(nombre, apellido, id, sueldobase, horas, valorh, salud, pensión, sueldot, sueldof);

        }

    }
}
