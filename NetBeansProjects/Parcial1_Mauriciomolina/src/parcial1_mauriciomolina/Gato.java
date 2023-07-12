package parcial1_mauriciomolina;

public class Gato extends Animal {

    String lenguaje;

    public Gato(String lenguaje, String sexo, String nombre, int edad) {
        super(sexo, nombre, edad);
        this.lenguaje = lenguaje;
    }
    public void imprimir (){ 
        System.out.println("");
        System.out.println("");
        System.out.println("Nombre del animal: " + getNombre());
        System.out.println("Sexo: " + getSexo());
        System.out.println("Edad: " + getEdad());
        System.out.println("Lenguaje: " + lenguaje);
    }
}
