package ejerciciobiblioteca;

import Personas.Bibliotecario;
import Personas.Docente;
import Personas.Estudiante;
import java.util.*;

public class Ejerciciobiblioteca {
    
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        
        Estudiante est = new Estudiante();
        Docente doc = new Docente();
        Bibliotecario bib = new Bibliotecario();
        System.out.println("Bienvenido bibliotecario");
        bib.registrar_m(read);
        
        int m = 0;
        do {
            
            System.out.println("Bienvenido al sistema");
            System.out.println("Escoja su cargo");
            System.out.println("0.Docente");
            System.out.println("1.Estudiante");
            System.out.println("2.Salir");
            int tu = read.nextInt();
            
            if (tu == 2) {
                System.exit(0);
                break;
            }
            if (tu != 1 && tu != 0) {
                System.out.println("Opción incorrecta. Vuelva a insertar.");
                break;
            
            }
            System.out.println("Menú");
            System.out.println("3.Reservar");
            System.out.println("5.Devolver");
            System.out.println("9.Salir");
            m = read.nextInt();
            
            if (m != 3 && m != 5) {
                System.out.println("Opción incorrecta. Vuelva a insertar.");
                
            }
            
            int x;
            x = tu + m;
            
            switch (x) {
                case 3:
                    System.out.println("Elija el tipo de texto");
                    System.out.println("1.Libro");
                    System.out.println("2.Revista");
                    System.out.println("3.Salir");
                    int n = read.nextInt();
                    if (n == 1) {
                        
                        doc.reservar("Libro");
                        System.out.println("Reservado!");
                        
                    } else if (n == 2) {
                        
                        doc.reservar("Revista");
                        
                    } else {
                        System.exit(0);
                    }
                    break;
                case 4:
                    System.out.println("Elija el tipo de texto");
                    System.out.println("1.Libro");
                    System.out.println("2.Revista");
                    System.out.println("3.Salir");
                    n = read.nextInt();
                    if (n == 1) {
                        
                        est.reservar("Libro");
                        
                    } else if (n == 2) {
                        
                        est.reservar("Revista");
                        
                    } else {
                        System.exit(0);
                    }
                    break;
                case 5:
                    System.out.println("Elija el tipo de texto");
                    System.out.println("1.Libro");
                    System.out.println("2.Revista");
                    System.out.println("3.Salir");
                    n = read.nextInt();
                    if (n == 1) {
                        
                        doc.entregar("Libro");
                        
                    } else if (n == 2) {
                        
                        doc.entregar("Revista");
                        
                    } else {
                        System.exit(0);
                    }
                    break;
                
                case 6:
                    System.out.println("Elija el tipo de texto");
                    System.out.println("1.Libro");
                    System.out.println("2.Revista");
                    System.out.println("3.Salir");
                    n = read.nextInt();
                    if (n == 1) {
                        
                        est.entregar("Libro");
                        
                    } else if (n == 2) {
                        
                        est.entregar("Revista");
                        
                    } else {
                        System.exit(0);
                    }
                    
                    break;
                
            }
        } while (m != 9);
        
    }
}
