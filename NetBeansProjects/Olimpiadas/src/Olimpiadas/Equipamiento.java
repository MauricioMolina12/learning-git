
package Olimpiadas;

public class Equipamiento {
    
    private int id_e;
    private String tipo_e;
    private int cant;
    private String estado;

    public Equipamiento(int id_e, String tipo_e, int cant, String estado) {
        this.id_e = id_e;
        this.tipo_e = tipo_e;
        this.cant = cant;
        this.estado = estado;
    }

    public int getId_e() {
        return id_e;
    }

    public void setId_e(int id_e) {
        this.id_e = id_e;
    }

    public String getTipo_e() {
        return tipo_e;
    }

    public void setTipo_e(String tipo_e) {
        this.tipo_e = tipo_e;
    }

    public int getCant() {
        return cant;
    }

    public void setCant(int cant) {
        this.cant = cant;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
    
}
