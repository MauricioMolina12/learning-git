
package Olimpiadas;

public class Comisario {
    
    private int id_com;
    private String nombre_com;
    private String profesión_com;

    public Comisario(int id_com, String nombre_com, String profesión_com) {
        this.id_com = id_com;
        this.nombre_com = nombre_com;
        this.profesión_com = profesión_com;
    }

    public int getId_com() {
        return id_com;
    }

    public void setId_com(int id_com) {
        this.id_com = id_com;
    }

    public String getNombre_com() {
        return nombre_com;
    }

    public void setNombre_com(String nombre_com) {
        this.nombre_com = nombre_com;
    }

    public String getProfesión_com() {
        return profesión_com;
    }

    public void setProfesión_com(String profesión_com) {
        this.profesión_com = profesión_com;
    }

    
    
}
