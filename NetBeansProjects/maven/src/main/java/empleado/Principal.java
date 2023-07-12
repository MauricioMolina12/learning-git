/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package empleado;

/**
 *
 * @author ASUS
 */
import java.util.*;

public class Principal {
    
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        Programador p = new Programador();
        Gerente g = new Gerente();
        int opc = 0;
        
        do {            
            
            System.out.println("\n¿Eres programador o gerente?"
                    + "\n1.Programador"
                    + "\n2.Gerente"
                    + "\n3.Mostrar"
                    + "\n4.Salir");
            opc = read.nextInt();
            
            switch (opc) {
                
                case 1:
                    System.out.println("Digite su nombre");
                    String n = read.next();
                    
                    System.out.println("Digite su edad");
                    int e = read.nextInt();
                    
                    System.out.println("Digite su salario");
                    double s = read.nextDouble();
                    
                    System.out.println("Digite su lenguaje de programación");
                    String l = read.next();
                    
                    p.setNombre(n);
                    p.setEdad(e);
                    p.setSalario(s);
                    p.setLDP(l);
                    break;
                
                case 2:
                    System.out.println("Digite su nombre");
                    n = read.next();
                    
                    System.out.println("Digite su edad");
                    e = read.nextInt();
                    
                    System.out.println("Digite su salario");
                    s = read.nextDouble();
                    
                    System.out.println("Digite su departamento");
                    String d = read.next();
                    
                    g.setNombre(n);
                    g.setEdad(e);
                    g.setSalario(s);
                    g.setDepartamento(d);
                    break;
                
                case 3:
                    System.out.println("P or G");
                    String no = read.next();
                    
                    if (no.equalsIgnoreCase("p")) {
                        p.mostrar();
                    } else {
                        g.mostrar();
                    }
                    break;
                
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opción errada");
            }
            
        } while (opc!=4);
    }
}

