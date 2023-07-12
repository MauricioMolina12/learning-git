package parcialfinalmauriciomolina;

public class Cuenta_bancaria {

    int numcuenta;
    double saldocuenta;
    String nomtitular;

    public Cuenta_bancaria(int numcuenta, double saldocuenta, String nomtitular) {
        this.numcuenta = numcuenta;
        this.saldocuenta = saldocuenta;
        this.nomtitular = nomtitular;
    }

    public int getNumcuenta() {
        return numcuenta;
    }

    public double getSaldocuenta() {
        return saldocuenta;
    }

    public String getNomtitular() {
        return nomtitular;
    }

    public void imprimir() {
        System.out.println("Nombre: " + this.nomtitular);
        System.out.println("El numero de cuenta es: " + this.numcuenta);
        System.out.println("El saldo de cuenta es: " + this.saldocuenta);

    }

    public void depositar(int deposito) {
        saldocuenta += deposito;
    }

    public void retirar(int retirar) {
        if (retirar <= saldocuenta) {
            saldocuenta -= retirar;
        } else {
            System.out.println("el dinero que desea retirar excede el saldo que tiene en su cuenta");
        }
    }

}


