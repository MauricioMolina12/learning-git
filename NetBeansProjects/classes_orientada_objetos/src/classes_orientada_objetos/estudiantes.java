package classes_orientada_objetos;

public class estudiantes extends persona1 {

    private String carrera;
    private int legajo;
    private int semetre;

    public estudiantes(String carrera, int legajo, int semestre, String nombre, int edad, int celul, String sexo) {
        super(nombre, edad, celul, sexo);
        this.carrera = carrera;
        this.legajo = 0;
        this.semetre = semestre;

    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public int getSemetre() {
        return semetre;
    }

    public void setSemetre(int semetre) {
        this.semetre = semetre;
    }

    public void impriEstudiante() {
        System.out.println("está estudiando : " + this.carrera);
        System.out.println("su legajo es : " + this.legajo);
    }
}
