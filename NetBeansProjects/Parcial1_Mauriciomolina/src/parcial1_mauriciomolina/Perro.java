package parcial1_mauriciomolina;

public class Perro extends Animal {

    String lenguaje;

    public Perro(String lenguaje, String sexo, String nombre, int edad) {
        super(sexo, nombre, edad);
        this.lenguaje = lenguaje;
    }

    public void imprimirdatos() {
        System.out.println("Nombre del animal: " + getNombre());
        System.out.println("Sexo: " + getSexo());
        System.out.println("Edad: " + getEdad());
        System.out.println("Lenguaje: " + lenguaje);
    }
}
