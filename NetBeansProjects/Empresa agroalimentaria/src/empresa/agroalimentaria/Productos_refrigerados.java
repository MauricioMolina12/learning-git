package empresa.agroalimentaria;

public class Productos_refrigerados extends Productos_general {

    long codigo;
    int dia2, mes2, año2;
    double temp;
    String pais;

    public Productos_refrigerados(long codigo, int dia2, int mes2, int año2, double temp, String pais, int dia, int mes, int año, int nlote) {
        super(dia, mes, año, nlote);
        this.codigo = codigo;
        this.dia2 = dia2;
        this.mes2 = mes2;
        this.año2 = año2;
        this.temp = temp;
        this.pais = pais;
    }

    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public int getDia2() {
        return dia2;
    }

    public void setDia2(int dia2) {
        this.dia2 = dia2;
    }

    public int getMes2() {
        return mes2;
    }

    public void setMes2(int mes2) {
        this.mes2 = mes2;
    }

    public int getAño2() {
        return año2;
    }

    public void setAño2(int año2) {
        this.año2 = año2;
    }

    public double getTemp() {
        return temp;
    }

    public void setTemp(double temp) {
        this.temp = temp;
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

    public void datosrefri() {
        System.out.println("Datos productos refrigerados");
        System.out.println("Fecha de caducidad: " + getDia() + "/" + getMes() + "/" + getAño());
        System.out.println("Número de lote: " + getNlote());
        System.out.println("Fecha de envasado: " + getDia2() + "/" + getMes2() + "/" + getAño2());
        System.out.println("País de origen: " + getPais());
        System.out.println("Temperatura: " + getTemp());
    }
}
