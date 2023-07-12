
package estudiando1;
import java.util.*;

public class Estudiando1 {

    public static void agregar(String nombre,String apellido, int id){
        
        Sujeto person1= new Sujeto (nombre,apellido,id);
        
    }
    public static void imprimir (String nombre, String apellido, int id){
        
        Sujeto person1= new Sujeto (nombre,apellido,id);
        person1.imprimir(nombre, apellido, id);
    }
    public static void modificar (String nombre, String apellido, int id){
        
         Sujeto person1= new Sujeto (nombre,apellido,id);
         person1.setNombre(nombre);
         person1.setApellido(apellido);
         person1.setId(id);
    }
         
            
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Digite su nombre");
        String nombre= leer.next();
        
        System.out.println("Digite su apellido");
        String apellido= leer.next();
        
        System.out.println("Digite su id");
        int id= leer.nextInt();
        
        System.out.println("¿Quiere modificar el nombre 1.si, 2.no");
        int num= leer.nextInt();
        if (num==1) {
            System.out.println("Digite su nombre");
            nombre= leer.next();
            
            System.out.println("Digite su apellido");
            apellido= leer.next();
            
            System.out.println("Digite su id");
            id= leer.nextInt();
            
        }
        agregar(nombre, apellido, id);
        imprimir(nombre, apellido, id);
        modificar(nombre, apellido, id);
        
    }
    
}
