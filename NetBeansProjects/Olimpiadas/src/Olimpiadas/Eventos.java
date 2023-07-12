
package Olimpiadas;

public class Eventos {
    
    private int id_evento;
    private String fecha;
    private String nombre_e;
    private String duración;
    private int num_p;

    public Eventos(int id_evento, String fecha, String nombre_e, String duración, int num_p) {
        this.id_evento = id_evento;
        this.fecha = fecha;
        this.nombre_e = nombre_e;
        this.duración = duración;
        this.num_p = num_p;
    }

    public int getId_evento() {
        return id_evento;
    }

    public void setId_evento(int id_evento) {
        this.id_evento = id_evento;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getNombre_e() {
        return nombre_e;
    }

    public void setNombre_e(String nombre_e) {
        this.nombre_e = nombre_e;
    }

    public String getDuración() {
        return duración;
    }

    public void setDuración(String duración) {
        this.duración = duración;
    }

    public int getNum_p() {
        return num_p;
    }

    public void setNum_p(int num_p) {
        this.num_p = num_p;
    }
    
    
    
   
    
    
}
