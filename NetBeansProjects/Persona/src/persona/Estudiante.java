package persona;

public class Estudiante extends Persona {

    String carrera;
    Long legajo;
    int curso;
    char tipo;

    public Estudiante(String carrera, Long legajo, int curso, char tipo, String nombre, int edad, String tipoid, int ni) {
        super(nombre, edad, tipoid, ni);
        this.carrera = carrera;
        this.legajo = legajo;
        this.curso = curso;
        this.tipo = tipo;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public Long getLegajo() {
        return legajo;
    }

    public void setLegajo(Long legajo) {
        this.legajo = legajo;
    }

    public int getCurso() {
        return curso;
    }

    public void setCurso(int curso) {
        this.curso = curso;
    }

    public char getTipo() {
        return tipo;
    }

    public void setTipo(char tipo) {
        this.tipo = tipo;
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

    public String getTipoid() {
        return tipoid;
    }

    public void setTipoid(String tipoid) {
        this.tipoid = tipoid;
    }

    public int getNi() {
        return ni;
    }

    public void setNi(int ni) {
        this.ni = ni;
    }

    public void imprimir() {
        System.out.println("La carrera es: " + this.carrera);
        System.out.println("Su legajo es: " + this.legajo);
    }

    public void tipo() {
        System.out.println("letra del curso: " + this.tipo);
        System.out.println("curso: " + this.curso);
    }

}
