
package Olimpiadas;

public class Deporte {
    
    private String nombre;
    private String indicador;
    private int id_c;

    public Deporte(String nombre, String indicador, int id_c) {
        this.nombre = nombre;
        this.indicador = indicador;
        this.id_c = id_c;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIndicador() {
        return indicador;
    }

    public void setIndicador(String indicador) {
        this.indicador = indicador;
    }

    public int getId_c() {
        return id_c;
    }

    public void setId_c(int id_c) {
        this.id_c = id_c;
    }

    public void imprimir(){
        System.out.println("Nombre deporte: " + nombre);
        System.out.println("Indicador: " + indicador);
    }

   
    
    
}
