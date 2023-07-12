package juego;

public class Player {

    int dificultad;
    int puntaje;
    String nombre;

    public Player(int dificultad, int puntaje, String nombre) {
        this.dificultad = dificultad;
        this.puntaje = puntaje;
        this.nombre = nombre;
    }

    public int getDificultad() {
        return dificultad;
    }

    public void setDificultad(int dificultad) {
        this.dificultad = dificultad;
    }

    public int getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void Imprimir() {
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Dificultad: " + this.dificultad);
        System.out.println("Puntuación: " + this.puntaje + "\n");
    }
}


