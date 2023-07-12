package parcialfinalmauriciomolina;

public class Cuenta_ahorro extends Cuenta_bancaria {

    double tasainteres;

    public Cuenta_ahorro(double tasainteres, int numcuenta, double saldocuenta, String nomtitular) {
        super(numcuenta, saldocuenta, nomtitular);
        this.tasainteres = tasainteres;
    }

    public double getTasainteres() {
        return tasainteres;
    }

    public void setTasainteres(double tasainteres) {
        this.tasainteres = tasainteres;
    }

    public int getNumcuenta() {
        return numcuenta;
    }

    public void setNumcuenta(int numcuenta) {
        this.numcuenta = numcuenta;
    }

    public double getSaldocuenta() {
        return saldocuenta;
    }

    public void setSaldocuenta(double saldocuenta) {
        this.saldocuenta = saldocuenta;
    }

    public String getNomtitular() {
        return nomtitular;
    }

    public void setNomtitular(String nomtitular) {
        this.nomtitular = nomtitular;
    }

    public void imprimir() {
        System.out.println("Nombre: " + this.nomtitular);
        System.out.println("El numero de cuenta es: " + this.numcuenta);
        System.out.println("El saldo de cuenta es: " + this.saldocuenta);
        System.out.println("La tasa de interés es: " + this.tasainteres);
        
        
    }
    public void calcularinteres(int tasaint){
        
        int interes= (int) (tasaint*saldocuenta);
        saldocuenta+=interes;
        System.out.println("Interés: " + interes);
        
    }

}
