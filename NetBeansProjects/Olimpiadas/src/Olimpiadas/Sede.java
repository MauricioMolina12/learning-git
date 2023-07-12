
package Olimpiadas;


public class Sede {
    
    private String nombre_s;
    private int id_s;
    private int presupuesto_s;
    private String ubicación_s;
    private int numero_c;

    public Sede(String nombre_s, int id_s, int presupuesto_s, String ubicación_s, int numero_c) {
        this.nombre_s = nombre_s;
        this.id_s = id_s;
        this.presupuesto_s = presupuesto_s;
        this.ubicación_s = ubicación_s;
        this.numero_c = numero_c;
    }

    public String getNombre_s() {
        return nombre_s;
    }

    public void setNombre_s(String nombre_s) {
        this.nombre_s = nombre_s;
    }

    public int getId_s() {
        return id_s;
    }

    public void setId_s(int id_s) {
        this.id_s = id_s;
    }

    public int getPresupuesto_s() {
        return presupuesto_s;
    }

    public void setPresupuesto_s(int presupuesto_s) {
        this.presupuesto_s = presupuesto_s;
    }

    public String getUbicación_s() {
        return ubicación_s;
    }

    public void setUbicación_s(String ubicación_s) {
        this.ubicación_s = ubicación_s;
    }

    public int getNumero_c() {
        return numero_c;
    }

    public void setNumero_c(int numero_c) {
        this.numero_c = numero_c;
    }

    
    
    
}
