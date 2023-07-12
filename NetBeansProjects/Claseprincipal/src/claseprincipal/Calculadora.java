package claseprincipal;

public class Calculadora {

    float n1;
    float n2;

    public Calculadora() {
    }

    public float getN1() {
        return n1;
    }

    public void setN1(float n1) {
        this.n1 = n1;
    }

    public float getN2() {
        return n2;
    }

    public void setN2(float n2) {
        this.n2 = n2;
    }

    public void sumar() {

        float s;
        s = n1 + n2;
        System.out.println(n1 + " + " + n2  + " es: " + s);

    }

    public void restar() {
        float r;
        r = n1 - n2;
        System.out.println(n1 + " - " + n2  + " es: " + r);

    }

    public void multiplicar() {
        float m;
        m = n1 * n2;
        System.out.println(n1 + " x " + n2  + " es: " + m);
    }

    public void división() {
        float d;
        d = n1 / n2;
        System.out.println(n1 + " / " + n2  + " es: " + d);
    }

}
