package estudiando1;

public class Sujeto {

    String nombre;
    String apellido;
    int id;

    public Sujeto() {
    }

    public Sujeto(String nombre, String apellido, int id) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.id = id;
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

    public void imprimir(String nombre, String apellido, int id) {
        System.out.println("Su nombre es " + nombre);
        System.out.println("Su apellido es " + apellido);
        System.out.println("Su id es " + id);
    }

}


