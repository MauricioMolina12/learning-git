
package Clases;

public abstract class Productos {
    
    protected int ddca;  //Dia de la fecha de caducidad
    protected int mmca;  //Mes de la fecha de caducidad
    protected int aaca;  //Año de la fecha de caducidad
    protected int nlote;  //Número de lote 
    protected String nombre;  //Nombre del producto

    public Productos(int ddca, int mmca, int aaca, int nlote, String nombre) {
        this.ddca = ddca;
        this.mmca = mmca;
        this.aaca = aaca;
        this.nlote = nlote;
        this.nombre = nombre;
    }

    public int getDdca() {
        return ddca;
    }

    public void setDdca(int ddca) {
        this.ddca = ddca;
    }

    public int getMmca() {
        return mmca;
    }

    public void setMmca(int mmca) {
        this.mmca = mmca;
    }

    public int getAaca() {
        return aaca;
    }

    public void setAaca(int aaca) {
        this.aaca = aaca;
    }

    public int getNlote() {
        return nlote;
    }

    public void setNlote(int nlote) {
        this.nlote = nlote;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    
    
}
