
public class Persona1 {
    
    
    String nombre;
    int id;
    int edad;
    String ciudad;
    String curso;

    public Persona1() {
    }

    public Persona1(String nombre, int id, int edad, String ciudad, String curso) {
        this.nombre = nombre;
        this.id = id;
        this.edad = edad;
        this.ciudad = ciudad;
        this.curso = curso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

  
    public void imprimir (String nombre, int id, int edad,String ciudad, String curso) {
       
        System.out.println("Nombre: " + nombre);
        System.out.println("Número de identificación: " + id);
        System.out.println("Edad: " + edad);
        System.out.println("Ciudad residente: " + ciudad);
        System.out.println("Curso a matricularse: " + curso);
        System.out.println("FELICIDADES! ESTÁS MATRICULADO");
    }
    
}
