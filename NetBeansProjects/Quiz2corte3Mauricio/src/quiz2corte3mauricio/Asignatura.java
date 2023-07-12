package quiz2corte3mauricio;

public class Asignatura {

    int codasig;
    String nombreasig;
    String libroguia;
    int ceddoc;
    String textoguia;

    public Asignatura(int codasig, String nombreasig, String libroguia, int ceddoc) {
        this.codasig = codasig;
        this.nombreasig = nombreasig;
        this.libroguia = libroguia;
        this.ceddoc = ceddoc;
    }

    public int getCodasig() {
        return codasig;
    }

    public void setCodasig(int codasig) {
        this.codasig = codasig;
    }

    public String getNombreasig() {
        return nombreasig;
    }

    public void setNombreasig(String nombreasig) {
        this.nombreasig = nombreasig;
    }

    public String getTextoguia() {
        return libroguia;
    }

    public void setLibroguia(String libroguia) {
        this.libroguia = libroguia;
    }

    public int getCeddoc() {
        return ceddoc;
    }

    public void setCeddoc(int ceddoc) {
        this.ceddoc = ceddoc;
    }

    public void imprimir() {
        System.out.println("Codigo asignatura: " + this.codasig);
        System.out.println("Nombre asignatura: " + this.nombreasig);
        System.out.println("Cedula del docente: " + this.ceddoc);
    }

}
