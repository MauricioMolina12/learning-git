
package empresa08;

public class Persona {
    
    String nombre;
    int edad;
    int id;
    char sexo;
    double peso;
    double altura;

    public Persona() {
    }

    public Persona(String nombre, int edad, int id, char sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.id = id;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    public void imprimir (String nombre, int edad, int id, char sexo, double peso, double altura){
        
        System.out.println("El nombre es: " + nombre);
        System.out.println("La edad es: " + edad);
        System.out.println("El número de id es: " + id);
        System.out.println("El sexo es: " + sexo);
        System.out.println("El peso es: " + peso);
        System.out.println("La altura es: " + altura);
    }
    
}
