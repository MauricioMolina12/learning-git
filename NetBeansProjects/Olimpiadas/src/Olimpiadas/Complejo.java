
package Olimpiadas;


public abstract class Complejo {
    
    private int id_c;
    private String nombre_c;
    private String dir;
    private double area;
    private String jefe;
    private Sede sede;

    public Complejo(int id_c, String nombre_c, String dir, double area, String jefe, Sede sede) {
        this.id_c = id_c;
        this.nombre_c = nombre_c;
        this.dir = dir;
        this.area = area;
        this.jefe = jefe;
        this.sede = sede;
    }

    public int getId_c() {
        return id_c;
    }

    public void setId_c(int id_c) {
        this.id_c = id_c;
    }

    public String getNombre_c() {
        return nombre_c;
    }

    public void setNombre_c(String nombre_c) {
        this.nombre_c = nombre_c;
    }

    public String getDir() {
        return dir;
    }

    public void setDir(String dir) {
        this.dir = dir;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public String getJefe() {
        return jefe;
    }

    public void setJefe(String jefe) {
        this.jefe = jefe;
    }

    public Sede getSede() {
        return sede;
    }

    public void setSede(Sede sede) {
        this.sede = sede;
    }

   
    
    
    
}
