
package objetosyclaseshospital;
import java.util.*;
public class Objetosyclaseshospital {

    public static void main(String[] args) {
        Scanner leer= new Scanner (System.in);
        
        System.out.println("Digite su primer nombre");
        String nombre= leer.next();
        
        System.out.println("Digite su segundo nombre");
        String segnombre= leer.next();
        
        System.out.println("Digite su primer apellido");
        String apellido= leer.next();
        
        System.out.println("Digite su segundo apellido");
        String segapellido= leer.next();
        
        System.out.println("Digite tipo de identificación");
        String TI= leer.next();
        
        System.out.println("Digite su número de identificación");
        int NI= leer.nextInt();
        
        System.out.println("Digite su fecha de nacimiento de la siguiente manera: dia-mes-año");
        System.out.println("");
        
        System.out.println("Digite día");
        int dia= leer.nextInt();
        
        System.out.println("Digite mes");
        int mes= leer.nextInt();
        
        System.out.println("Digite año");
        int año= leer.nextInt();
        
        System.out.println("Lugar de nacimiento");
        String ln= leer.next();
        
        System.out.println("Digite padecimiento");
        String pade= leer.next();
        
        System.out.println("Digite nombre medico que lo atendió, así: nombre y apellido");
        
        System.out.println("Digite nombre");
        String medinom= leer.next();
        
        System.out.println("Digite apellido");
        String mediape= leer.next();
        
        System.out.println("Medicina recetada");
        String medicina= leer.next();
        
        Paciente paciente1 = new Paciente(nombre,segnombre,apellido,segapellido,TI,NI,dia,mes,año,ln,pade,medinom,mediape,medicina);
        paciente1.imprimir(nombre, segnombre, apellido, segapellido, TI, NI, dia, mes, año, ln, pade, medinom,mediape, medicina);
     
    }
    
}
