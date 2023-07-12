package Principal;

import Olimpiadas.Comisario;
import Olimpiadas.Eventos;
import Olimpiadas.Sede;
import Olimpiadas.Deporte;
import Olimpiadas.Polideportivo;
import Olimpiadas.deporteunico;

import java.util.*;

public class Olimpiadas {
    
    static ArrayList<Sede> sede = new ArrayList<Sede>();
    static ArrayList<Comisario> c = new ArrayList<Comisario>();
    static ArrayList<Eventos> e = new ArrayList<Eventos>();
    static ArrayList<Polideportivo> pd = new ArrayList<Polideportivo>();
    static ArrayList<deporteunico> du = new ArrayList<deporteunico>();
    static ArrayList<Deporte> de = new ArrayList<Deporte>();
    
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int opc = 0;
        do {
            System.out.println("---Bienvenido al sistema de olimpiadas---");
            System.out.println("Menú");
            System.out.println("1.Registrar sedes & complejos");
            System.out.println("2.Mostrar información");
            System.out.println("10.Salir");
            opc = read.nextInt();
            
            switch (opc) {
                case 1:
                    System.out.println("Digite número de sedes"); //Preguntamos por el nùmero de sedes que quiere registrar 
                    int se = read.nextInt();
                    
                    for (int i = se; i > 0; i--) { //Este for servirá para crear tantas sedes como el usuario digite

                        System.out.println("Ingrese el nombre de la sede");
                        String nombre_s = read.next();
                        
                        System.out.println("Digite el id de la sede");
                        int id_s = read.nextInt();
                        
                        System.out.println("Ingrese la ubicación");
                        String ubicacion_s = read.next();
                        
                        System.out.println("Digite el presupuesto");
                        int presupuesto_s = read.nextInt();
                        
                        System.out.println("Digite el número de complejos que tiene la sede"); //Acá pedimos el número de complejos que tiene la sede
                        int numero_c = read.nextInt();
                        
                        sede.add(new Sede(nombre_s, id_s, presupuesto_s, ubicacion_s, numero_c));
                        Sede sd = new Sede(nombre_s, id_s, presupuesto_s, ubicacion_s, numero_c);
                        
                        do { //Acá se crea un ciclo que pregunta la información del complejo 

                            System.out.println("Ingrese el nombre del complejo");
                            String nombre_c = read.next();
                            
                            System.out.println("Digite el id del complejo");
                            int id_c = read.nextInt();
                            
                            System.out.println("Ingrese dirección del complejo");
                            String dir = read.next();
                            
                            System.out.println("Digite el área (m2)");
                            double area = read.nextDouble();
                            
                            System.out.println("Ingrese el Jefe organizacional");
                            String jefe = read.next();
                            
                            System.out.println("Número de deportes que se practican");
                            int nd = read.nextInt();
                            
                            if (nd == 1) { //En este ciclo condicional él determinará si el complejo es uni o polideportivo  

                                System.out.println("Nombre del deporte");
                                String nomd = read.next();
                                
                                Deporte d = new Deporte(nomd, null, id_c);
                                du.add(new deporteunico(d, id_c, nombre_c, dir, area, jefe, sd));//Acá guarda la información de unideportivo
                                deporteunico duni = new deporteunico(d, id_c, nombre_c, dir, area, jefe, sd);
                                
                                System.out.println("Digite cantidad de eventos");
                                int ce = read.nextInt();
                                
                                for (i = 0; i < ce; i++) {
                                    
                                    System.out.println("Digite el código del evento");
                                    int id_evento = read.nextInt();
                                    
                                    System.out.println("Ingrese el nombre del evento");
                                    String nombre_e = read.next();
                                    
                                    System.out.println("Ingrese la fecha");
                                    String fecha = read.next();
                                    
                                    System.out.println("Ingrese la duración");
                                    String duración = read.next();
                                    
                                    System.out.println("Digite el número de participantes");
                                    int num_p = read.nextInt();
                                    
                                    e.add(new Eventos(id_evento,nombre_e, fecha,duración, num_p, duni));
                                }
                                
                            } else if (nd > 1) {
                                
                                do {
                                    
                                    System.out.println("Ingrese el nombre del deporte");
                                    String nombre = read.next();
                                    
                                    System.out.println("Digite el indicador de área");
                                    String indicador = read.next();
                                    
                                    de.add(new Deporte(nombre, indicador, id_c));
                                    
                                    nd--;
                                    
                                } while (nd != 0);
                                
                                pd.add(new Polideportivo(de, id_c, nombre_c, dir, area, jefe, sd)); //Acá guarda la información de polideportivo
                                Polideportivo pod = new Polideportivo(de, id_c, nombre_c, dir, area, jefe, sd);
                                
                                System.out.println("Digite cantidad de eventos");
                                int ce = read.nextInt();
                                
                                for (i = 0; i < ce; i++) {
                                    
                                    System.out.println("Digite el código del evento");
                                    int id_evento = read.nextInt();
                                    
                                    System.out.println("Ingrese el nombre del evento");
                                    String nombre_e = read.next();
                                    
                                    System.out.println("Ingrese la fecha");
                                    String fecha = read.next();
                                    
                                    System.out.println("Ingrese la duración");
                                    String duración = read.next();
                                    
                                    System.out.println("Digite el número de participantes");
                                    int num_p = read.nextInt();
                                    
                                    e.add(new Eventos(id_evento,nombre_e, fecha,duración, num_p, pod,0));
                                }
                            }
                            
                            numero_c--;
                            
                        } while (numero_c != 0);
                    }
                    
                    break;
                
                case 2: //En esta sección imprimiremos la información de los coliseos con sus respectivas sedes
                    if (pd.size() > 0 && du.size() > 0) {
                        for (int i = 0; i < pd.size(); i++) {
                            pd.get(i).mostrarp();
                        }
                        System.out.println("--------------------------------------------");
                        for (int i = 0; i < du.size(); i++) {
                            du.get(i).mostrardu();
                        }
                    } else if (du.size() > 0 && pd.isEmpty()) {
                        for (int i = 0; i < du.size(); i++) {
                            du.get(i).mostrardu();
                        }
                        
                    } else if (pd.size() > 0 && du.isEmpty()) {
                        for (int i = 0; i < pd.size(); i++) {
                            pd.get(i).mostrarp();
                        }
                        System.out.println("------------------------------------");
                        
                    }
                    System.out.println("---Eventos---");
                    for (int i = 0; i < e.size(); i++) {
                        
                    }
                    break;
                
            }
        } while (opc != 0);
        
    }
}
