
package empresa;

public class Trabajador {
    
    String nombre;
    String apellido;
    int id;
    double sueldobase;
    int horas;
    double valorh;
    double salud;
    double pensión;
    double sueldot;
    double sueldof;

    public Trabajador() {
    }

    public Trabajador(String nombre, String apellido, int id, double sueldobase, int horas, double valorh, double salud, double pensión, double sueldot, double sueldof) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.id = id;
        this.sueldobase = sueldobase;
        this.horas = horas;
        this.valorh = valorh;
        this.salud = salud;
        this.pensión = pensión;
        this.sueldot = sueldot;
        this.sueldof = sueldof;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSueldobase() {
        return sueldobase;
    }

    public void setSueldobase(double sueldobase) {
        this.sueldobase = sueldobase;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public double getValorh() {
        return valorh;
    }

    public void setValorh(double valorh) {
        this.valorh = valorh;
    }

    public double getSalud() {
        return salud;
    }

    public void setSalud(double salud) {
        this.salud = salud;
    }

    public double getPensión() {
        return pensión;
    }

    public void setPensión(double pensión) {
        this.pensión = pensión;
    }

    public double getSueldot() {
        return sueldot;
    }

    public void setSueldot(double sueldot) {
        this.sueldot = sueldot;
    }

    public double getSueldof() {
        return sueldof;
    }

    public void setSueldof(double sueldof) {
        this.sueldof = sueldof;
    }

    
    public void imprimir(String nombre, String apellido, int id, double sueldobase, int horas,double valorh,double salud, double pensión,double sueldot, double sueldof) {
        System.out.println("Nombre: " + nombre + " " + apellido);
        System.out.println("Numero de identificacion: " + id);
        System.out.println("Su sueldo base es: " + sueldobase);
        System.out.println("Horas extras trabajadas " + horas);
        System.out.println("Su sueldo final es de: " + sueldof);
    }

    
    
    
    
}
