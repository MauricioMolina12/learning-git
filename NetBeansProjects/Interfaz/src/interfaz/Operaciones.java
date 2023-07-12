
package interfaz;

public class Operaciones {
    
    double digito1;
    double digito2;

    public Operaciones() {
    }

    public double getDigito1() {
        return digito1;
    }

    public void setDigito1(double digito1) {
        this.digito1 = digito1;
    }

    public double getDigito2() {
        return digito2;
    }

    public void setDigito2(double digito2) {
        this.digito2 = digito2;
    }
    
    public double suma (){
        double s;
        s = digito1 + digito2;
        return s;
    }
    public double resta(){
        double r;
        r = digito1 - digito2;
        return r;
    }
    public double producto(){
        double p;
        p = digito1 * digito2;
        return p;
    }
    public double división(){
        double d;
        d = digito1 / digito2;
        return d;
    }
}
