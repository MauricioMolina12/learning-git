package empresa.agroalimentaria;

public class Productos_congelados extends Productos_general {

    int dia3, mes3, año3;
    String pais;
    double temp;
    String tcong;

    public Productos_congelados(int dia3, int mes3, int año3, String pais, double temp, String tcong, int dia, int mes, int año, int nlote) {
        super(dia, mes, año, nlote);
        this.dia3 = dia3;
        this.mes3 = mes3;
        this.año3 = año3;
        this.pais = pais;
        this.temp = temp;
        this.tcong = tcong;
    }

    public int getDia3() {
        return dia3;
    }

    public void setDia3(int dia3) {
        this.dia3 = dia3;
    }

    public int getMes3() {
        return mes3;
    }

    public void setMes3(int mes3) {
        this.mes3 = mes3;
    }

    public int getAño3() {
        return año3;
    }

    public void setAño3(int año3) {
        this.año3 = año3;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public double getTemp() {
        return temp;
    }

    public void setTemp(double temp) {
        this.temp = temp;
    }

    public String getTcong() {
        return tcong;
    }

    public void setTcong(String tcong) {
        this.tcong = tcong;
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

    public void datoscongelados() {
        System.out.println("Fecha de caducidad: " + getDia3() + "/" + getMes3() + "/" + getAño3());
        System.out.println("Número de lote: " + getNlote());
        System.out.println("Temperatura: " + getTemp());
        System.out.println("Tipo de congelado: " + getTcong());
    }
}
