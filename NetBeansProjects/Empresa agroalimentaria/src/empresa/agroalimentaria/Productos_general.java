package empresa.agroalimentaria;

public abstract class Productos_general {

    int dia, mes, año;
    int nlote;

    public Productos_general(int dia, int mes, int año, int nlote) {
        this.dia = dia;
        this.mes = mes;
        this.año = año;
        this.nlote = nlote;
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

}
