package empleado;

import java.util.*;

public class Empleado {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int salud= 75000;
        int valorh= 50000;
        int sueldof = 0;
        System.out.println("¿Cual es su nombre?");
        String nombre= leer.next();
        
        System.out.println("Digite su número de identificación");
        int id= leer.nextInt();
        
        System.out.println("Digite su sueldo");
        int sueldo = leer.nextInt();
        
        System.out.println("Digite las horas trabajadas extras");
        int horas= leer.nextInt();
        
        sueldof= horas*valorh+sueldo-salud;
        System.out.println("Su sueldo final incluyendo sus horas extras trabajadas y descontando el insumo de salud es de " + sueldof);
        
        Persona emple1 = new Persona(nombre, id, sueldo, horas, valorh, salud, sueldof);
        emple1.imprimir(nombre, id, sueldo, horas, valorh, salud, sueldof);
        
        System.out.println("¿Cual es su nombre?");
        nombre= leer.next();
        emple1.setnombre(nombre);
        
        System.out.println("Digite numero de id");
        id= leer.nextInt();
        emple1.setid(id);
      
        emple1.imprimir(nombre, id, sueldo, horas, valorh,salud, sueldof);
        
        

    }

}
