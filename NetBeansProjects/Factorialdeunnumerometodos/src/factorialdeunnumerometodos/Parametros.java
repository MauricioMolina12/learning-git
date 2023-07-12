
package factorialdeunnumerometodos;

public class Parametros {
    
    int num;
    int fact;

    public Parametros() {
    }

    public Parametros(int num, int fact) {
        this.num = num;
        this.fact = fact;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getFact() {
        return fact;
    }

    public void setFact(int fact) {
        this.fact = fact;
    }

    
    public void imprimir(int num, int fact) {
        System.out.println("El factorial del número "+num+" es: " +fact);
    }


    
    
    
    
}
