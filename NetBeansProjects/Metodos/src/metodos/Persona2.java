package metodos;

public class Persona2 {

    String primernombre;
    String segundonombre;
    String primerapellido;
    String segundoapellido;
    int edad;
    String seccional;
    String ti;
    int id;
    String programa;

    public Persona2() {
    }

    public Persona2(String primernombre, String segundonombre, String primerapellido, String segundoapellido, int edad, String seccional, String ti, int id, String programa) {
        this.primernombre = primernombre;
        this.segundonombre = segundonombre;
        this.primerapellido = primerapellido;
        this.segundoapellido = segundoapellido;
        this.edad = edad;
        this.seccional = seccional;
        this.ti = ti;
        this.id = id;
        this.programa = programa;
    }

    public String getPrimernombre() {
        return primernombre;
    }

    public void setPrimernombre(String primernombre) {
        this.primernombre = primernombre;
    }

    public String getSegundonombre() {
        return segundonombre;
    }

    public void setSegundonombre(String segundonombre) {
        this.segundonombre = segundonombre;
    }

    public String getPrimerapellido() {
        return primerapellido;
    }

    public void setPrimerapellido(String primerapellido) {
        this.primerapellido = primerapellido;
    }

    public String getSegundoapellido() {
        return segundoapellido;
    }

    public void setSegundoapellido(String segundoapellido) {
        this.segundoapellido = segundoapellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSeccional() {
        return seccional;
    }

    public void setSeccional(String seccional) {
        this.seccional = seccional;
    }

    public String getTi() {
        return ti;
    }

    public void setTi(String ti) {
        this.ti = ti;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPrograma() {
        return programa;
    }

    public void setPrograma(String programa) {
        this.programa = programa;
    }

    public void imprimir(String primernombre, String segundonombre, String primerapellido, String segundoapellido, int edad, String seccional, String ti, int id, String programa) {
        System.out.println("Nombre: " +primernombre + " " + segundonombre + " " + primerapellido + " " + segundoapellido );
        System.out.println("Edad: " +edad);
        System.out.println("Seccional: "+seccional);
        System.out.println("Tipo de identificación: " +ti);
        System.out.println("Número de identificación: "+id);
        System.out.println("Programa matriculado: "+programa);
        System.out.println("Felicidades! Ahora eres unilibrista y haces parte del programa de " + programa + " en la universidad libre seccional " + seccional);
    }


}
