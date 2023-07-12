package empresa.agroalimentaria;

public class Productos_frescos extends Productos_general {

    int dia1, mes1, año1;
    String pais;

    public Productos_frescos(int dia1, int mes1, int año1, String pais, int dia, int mes, int año, int nlote) {
        super(dia, mes, año, nlote);
        this.dia1 = dia1;
        this.mes1 = mes1;
        this.año1 = año1;
        this.pais = pais;
    }

    public int getDia1() {
        return dia1;
    }

    public void setDia1(int dia1) {
        this.dia1 = dia1;
    }

    public int getMes1() {
        return mes1;
    }

    public void setMes1(int mes1) {
        this.mes1 = mes1;
    }

    public int getAño1() {
        return año1;
    }

    public void setAño1(int año1) {
        this.año1 = año1;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public int getNlote() {
        return nlote;
    }

    public void setNlote(int nlote) {
        this.nlote = nlote;
    }

    public void datosfrescos() {
        System.out.println("");
        System.out.println("Datos productos frescos");
        System.out.println("Fecha de caducidad: " + getDia() + "/" + getMes() + "/" + getAño());
        System.out.println("Número de lote: " + getNlote());
        System.out.println("Fecha de envasado: " + getDia1() + "/" + getMes1() + "/" + getAño1());
        System.out.println("País de origen: " + getPais());
    }
}
