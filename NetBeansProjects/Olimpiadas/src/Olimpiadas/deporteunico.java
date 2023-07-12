package Olimpiadas;

public class deporteunico extends Complejo {

    private Deporte deporte;

    public deporteunico(Deporte deporte, int id_c, String nombre_c, String dir, double area, String jefe, Sede sede) {
        super(id_c, nombre_c, dir, area, jefe, sede);
        this.deporte = deporte;
    }

    public Deporte getDeporte() {
        return deporte;
    }

    public void setDeporte(Deporte deporte) {
        this.deporte = deporte;
    }
    
    public void mostrardu(){
        System.out.println("---Información unideportivo---");
        
            System.out.println("Nombre: " + getNombre_c());
            System.out.println("ID: " + getId_c());
            System.out.println("Dirección: " + getDir());
            System.out.println("Área en m2: " +getArea());
            System.out.println("Sede: " + getSede().getNombre_s() + "," + getSede().getUbicación_s());
            System.out.println("ID sede: " + getSede().getId_s());
            System.out.println("Presupuesto: " + getSede().getPresupuesto_s());
            System.out.println("Deporte: " + getDeporte().getNombre());
        }
    }


