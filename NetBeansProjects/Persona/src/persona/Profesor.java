package persona;

public class Profesor extends Persona {

    String materia;
    String cargo;
    int añostrabajo;
    int coevaluacion;

    public Profesor(String materia, String cargo, String nombre, int edad, String tipoid, int ni, int años, int co) {
        super(nombre, edad, tipoid, ni);
        this.materia = materia;
        this.cargo = cargo;
        this.añostrabajo = años;
        this.coevaluacion = co;
    }

    public int getCoevaluacion() {
        return coevaluacion;
    }

    public void setCoevaluacion(int coevaluacion) {
        this.coevaluacion = coevaluacion;
    }

    public int getAñostrabajo() {
        return añostrabajo;
    }

    public void setAñostrabajo(int añostrabajo) {
        this.añostrabajo = añostrabajo;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
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
        System.out.println("La materia es: " + this.materia);
        System.out.println("Su cargo es: " + this.cargo);
    }

    public void informacionpersonal() {
        System.out.println("Lleva trabajando: " + this.añostrabajo + " años");
        System.out.println("Su coevaluacion es igual a: " + getCoevaluacion());
    }
}
