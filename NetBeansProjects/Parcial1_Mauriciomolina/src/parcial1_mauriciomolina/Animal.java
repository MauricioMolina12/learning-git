
package parcial1_mauriciomolina;

public abstract class Animal {
    
   String sexo;
   String nombre;
   int edad;

    public Animal(String sexo, String nombre, int edad) {
        this.sexo = sexo;
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
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
   
   
}
