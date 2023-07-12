
package Olimpiadas;

import java.util.ArrayList;

public class Polideportivo extends Complejo{
           
    private ArrayList <Deporte> d;
    

    public Polideportivo(ArrayList<Deporte> d, int id_c, String nombre_c, String dir, double area, String jefe, Sede sede) {
        super(id_c, nombre_c, dir, area, jefe, sede);
        this.d = d;
    }

    public ArrayList<Deporte> getD() {
        return d;
    }

    public void setD(ArrayList<Deporte> d) {
        this.d = d;
    }
    
    public void mostrarp(){
         System.out.println("---Información polideportivo---");
        
            System.out.println("Nombre: " + getNombre_c());
            System.out.println("ID: " + getId_c());
            System.out.println("Dirección: " + getDir());
            System.out.println("Área en m2: " + getArea());
            System.out.println("Sede: " + getSede().getNombre_s() + "," + getSede().getUbicación_s());
            System.out.println("ID sede: " + getSede().getId_s());
            System.out.println("Presupuesto: " + getSede().getPresupuesto_s());
            System.out.println("Deportes:");
            for (int j = 0; j < d.size(); j++) { 
                if (getD().get(j).getId_c() == getId_c()) { 
                    System.out.println(getD().get(j).getNombre() + "|" + getD().get(j).getIndicador());
                }
                
                
                
            }

        }
    }
    
    

