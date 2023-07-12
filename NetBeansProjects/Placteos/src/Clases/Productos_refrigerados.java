
package Clases;

public class Productos_refrigerados extends Productos {

private int COL; //código del organismo de supervisión alimentaria
private int ddr; //Dia de la fecha de envasado productos refrigerados
private int mmr; //Mes de la fecha de envasado productos refrigerados
private int aar; //Año de la fecha de envasado productos refrigerados
private String temp; //Temperatura de los productos refrigerados
private String pais; //Pais de origen

    public Productos_refrigerados(int COL, int ddr, int mmr, int aar, String temp, String pais, int ddca, int mmca, int aaca, int nlote, String nombre) {
        super(ddca, mmca, aaca, nlote, nombre);
        this.COL = COL;
        this.ddr = ddr;
        this.mmr = mmr;
        this.aar = aar;
        this.temp = temp;
        this.pais = pais;
    }

    public int getCOL() {
        return COL;
    }

    public void setCOL(int COL) {
        this.COL = COL;
    }

    public int getDdr() {
        return ddr;
    }

    public void setDdr(int ddr) {
        this.ddr = ddr;
    }

    public int getMmr() {
        return mmr;
    }

    public void setMmr(int mmr) {
        this.mmr = mmr;
    }

    public int getAar() {
        return aar;
    }

    public void setAar(int aar) {
        this.aar = aar;
    }

    public String getTemp() {
        return temp;
    }

    public void setTemp(String temp) {
        this.temp = temp;
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
