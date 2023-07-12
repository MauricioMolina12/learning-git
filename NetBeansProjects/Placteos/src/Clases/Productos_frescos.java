
package Clases;

public class Productos_frescos extends Productos{
    
    private int ddf; //Dia de la fecha de envasado productos frescos
    private int mmf; //Mes de la fecha de envasado productos frescos
    private int aaf; //Año de la fecha de envasado productos frescos
    private String pais; //Pais de origen

    public Productos_frescos(int ddf, int mmf, int aaf, String pais, int ddca, int mmca, int aaca, int nlote, String nombre) {
        super(ddca, mmca, aaca, nlote, nombre);
        this.ddf = ddf;
        this.mmf = mmf;
        this.aaf = aaf;
        this.pais = pais;
    }

    public int getDdf() {
        return ddf;
    }

    public void setDdf(int ddf) {
        this.ddf = ddf;
    }

    public int getMmf() {
        return mmf;
    }

    public void setMmf(int mmf) {
        this.mmf = mmf;
    }

    public int getAaf() {
        return aaf;
    }

    public void setAaf(int aaf) {
        this.aaf = aaf;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getDdca() {
        return ddca;
    }

    public void setDdca(int ddca) {
        this.ddca = ddca;
    }

    public int getMmca() {
        return mmca;
    }

    public void setMmca(int mmca) {
        this.mmca = mmca;
    }

    public int getAaca() {
        return aaca;
    }

    public void setAaca(int aaca) {
        this.aaca = aaca;
    }

    public int getNlote() {
        return nlote;
    }

    public void setNlote(int nlote) {
        this.nlote = nlote;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    

    
    
}
