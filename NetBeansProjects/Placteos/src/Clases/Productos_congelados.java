
package Clases;

public class Productos_congelados extends Productos{
    
    private int ddc;//Dia de la fecha de envasado productos congelados
    private int mmc;//Mes de la fecha de envasado productos congelados
    private int aac;//Año de la fecha de envasado productos congelados
    private String pais; //Pais de origen
    private String temp; //Temperatura 

    public Productos_congelados(int ddc, int mmc, int aac, String pais, String temp, int ddca, int mmca, int aaca, int nlote, String nombre) {
        super(ddca, mmca, aaca, nlote, nombre);
        this.ddc = ddc;
        this.mmc = mmc;
        this.aac = aac;
        this.pais = pais;
        this.temp = temp;
    }

    public int getDdc() {
        return ddc;
    }

    public void setDdc(int ddc) {
        this.ddc = ddc;
    }

    public int getMmc() {
        return mmc;
    }

    public void setMmc(int mmc) {
        this.mmc = mmc;
    }

    public int getAac() {
        return aac;
    }

    public void setAac(int aac) {
        this.aac = aac;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getTemp() {
        return temp;
    }

    public void setTemp(String temp) {
        this.temp = temp;
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
