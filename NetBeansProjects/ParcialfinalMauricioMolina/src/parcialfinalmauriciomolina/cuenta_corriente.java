
package parcialfinalmauriciomolina;

public class cuenta_corriente extends Cuenta_bancaria{
    
    int cantsobregiro;

    public cuenta_corriente(int cantsobregiro,int numcuenta, double saldocuenta, String nomtitular) {
        super(numcuenta, saldocuenta, nomtitular);
        this.cantsobregiro = (int) ((saldocuenta*10)/100);
    }
    
    public void imprimir (){
        System.out.println("Nombre: " + this.nomtitular);
        System.out.println("El numero de cuenta es: " + this.numcuenta);
        System.out.println("El saldo de cuenta es: " + this.saldocuenta);
        System.out.println("El sobre giro es de: " + this.cantsobregiro);
    }

    public int getCantsobregiro() {
        return cantsobregiro;
    }

    public void setCantsobregiro(int cantsobregiro) {
        this.cantsobregiro = cantsobregiro;
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
    
    public void retirar (int retirar){
        if (cantsobregiro>=retirar) {
            saldocuenta-=retirar;
            
            
        }else{
            System.out.println("el dinero que desea retirar excede el saldo que tiene en su cuenta");
        }
    }
    
    
        
    
      
    
    
}
