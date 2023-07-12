package empleado;

public class Persona {

    String nombre;
    int id;
    int sueldo;
    int horas;
    int valorh;
    int salud;
    int sueldof;
    

    public Persona(String nombre, int id, int sueldo, int horas, int valorh, int salud, int sueldof) {

        this.nombre = nombre;
        this.id = id;
        this.sueldo = sueldo;
        this.horas= horas;
        this.valorh= valorh;
        this.sueldof= sueldof;
        this.salud= salud;
    }

    public String getnombre() {
        return nombre;
    }

    public void setnombre(String nombre) {
        this.nombre = nombre;
    }

    public int getid() {
        return id;
    }

    public void setid(int id) {
        this.id = id;
    }

    public int getsueldo() {
        return sueldo;
    }

    public void setsueldo(int sueldo) {
        this.sueldo = sueldo;
    }
    public int gethoras() {
        return horas;
    }
    public void sethoras (int horas){
        this.horas= horas;
    }
    
    public int getvalorh (){
        return valorh;
    }
    public int getsalud (){
        return salud;
    }
    public int getsueldof(){
        return sueldof;
    }
    public void imprimir(String nombre, int id, int sueldo, int horas, int valorh, int salud, int sueldof) {
        
        System.out.println("Nombre: " + nombre);
        System.out.println("Número de identificación: " + id);
        System.out.println("Sueldo base: " + sueldo);
        System.out.println("Horas trabajadas: " + horas );
        System.out.println("Su sueldo final es de " + sueldof);
    }
}
