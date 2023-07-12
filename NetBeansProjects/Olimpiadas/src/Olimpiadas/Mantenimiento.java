
package Olimpiadas;

public class Mantenimiento {
    
    private int id_mant;
    private String tipo_mant;
    private String fecha;

    public Mantenimiento(int id_mant, String tipo_mant, String fecha) {
        this.id_mant = id_mant;
        this.tipo_mant = tipo_mant;
        this.fecha = fecha;
    }

    public int getId_mant() {
        return id_mant;
    }

    public void setId_mant(int id_mant) {
        this.id_mant = id_mant;
    }

    public String getTipo_mant() {
        return tipo_mant;
    }

    public void setTipo_mant(String tipo_mant) {
        this.tipo_mant = tipo_mant;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
    
    
    
}
