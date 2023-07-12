package classes_orientada_objetos;

public class profesor extends persona1 {

    private String materia;
    private String cargo;

    public profesor(String materia, String cargo, String nombre, int edad, int celul, String sexo) {
        super(nombre, edad, celul, sexo);
        this.materia = materia;
        this.cargo = cargo;

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

    public void imprimirprofesor() {

        System.out.println("el profesor dicta la materia de " + this.materia);
        System.out.println("ocupa el cargo de " + this.cargo);
    }
}
