package main.pkgclass;

public class Libro extends Persona {

    int codigolibro, dia, mes, año, dia2, mes2, año2;
    String nombrelibro;

    public Libro(int codigolibro, int dia, int mes, int año, int dia2, int mes2, int año2, String nombrelibro, String nombre, String apellido, int cedula, int codigoe) {
        super(nombre, apellido, cedula, codigoe);
        this.codigolibro = codigolibro;
        this.dia = dia;
        this.mes = mes;
        this.año = año;
        this.dia2 = dia2;
        this.mes2 = mes2;
        this.año2 = año2;
        this.nombrelibro = nombrelibro;
    }

    public void prestar_libro() {
        System.out.println("");
        System.out.println("_________________________________________________________________");
        System.out.println("Prestamos de libros-Biblioteca Unilibre");
        System.out.println("");
        System.out.println("Nombre a quién se prestó: " + getNombre() + " " + getApellido());
        System.out.println("Cc: " + getCedula());
        System.out.println("Codigo estudiante: " + getCodigoe());
        System.out.println("Nombre libro: " + nombrelibro);
        System.out.println("Codigo libro: " + codigolibro);
        System.out.println("Fecha de prestamo: " + dia + "/" + mes + "/" + año);
        System.out.println("Fecha de devolución: " + dia2 + "/" + mes2 + "/" + año2);
        System.out.println("_________________________________________________________________");
        System.out.println("¡Registro exitoso! Que tengas un buen día.");
    }
}
