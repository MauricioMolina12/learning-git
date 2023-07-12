package classes_orientada_objetos;

public class persona1 {

    String nombre;
    int edad;
    int celul;
    String sexo;

    public persona1(String nombre, int edad, int celul, String sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.celul = celul;
        this.sexo = sexo;
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

    public int getCelul() {
        return celul;
    }

    public void setCelul(int celul) {
        this.celul = celul;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void imprimir3() {
        System.out.println("DATOS DE PERSONAS");
        System.out.println("el nombre es : " + this.nombre);
        System.out.println("tiene " + this.edad + " años de edad ");
        System.out.println("el numero de celular : " + this.celul);
        System.out.println("su sexo es : " + this.sexo);

    }
}
