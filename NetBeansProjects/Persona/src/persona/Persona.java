package persona;

public class Persona {
    String nombre;
    int edad;
    String tipoid;
    int ni;

    
    public Persona(String nombre, int edad, String tipoid, int ni) {
        this.nombre = nombre;
        this.edad = edad;
        this.tipoid = tipoid;
        this.ni = ni;
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
    
    
    public void imprimir(){
        System.out.println("La edad es: " + getEdad()); 
        System.out.println("Su nombre es" + getNombre());
    }
     
    public void tipoid(){
        System.out.println("Tipo de identificación: " + this.tipoid);
        System.out.println("Numero de identificación: " + this.ni);
    }
}
