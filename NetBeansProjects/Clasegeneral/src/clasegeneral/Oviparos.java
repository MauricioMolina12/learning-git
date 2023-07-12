
package clasegeneral;

public class Oviparos extends Animal{
    
    private String tipoovi;
    private String tamaño;

    public Oviparos(String tipoovi, String tamaño, String nombrean, String tipo, String raza) {
        super(nombrean, tipo, raza);
        this.tipoovi = tipoovi;
        this.tamaño = tamaño;
    }

    public String getTipoovi() {
        return tipoovi;
    }

    public void setTipoovi(String tipoovi) {
        this.tipoovi = tipoovi;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    
    public void imprimir() {
        System.out.println("Clasificación de los ovíparos: " + this.tipoovi);
        System.out.println("Tamaño: " + this.tamaño);
    }
    
    
    
}
