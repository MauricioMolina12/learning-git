
package Builder;

//CLASE PRODUCTO

public class Car {
        
    private String modelo = "";
    private String tipo = "";
    private String color = "";

    public String getModelo() {
        return modelo;
    }

    public String getTipo() {
        return tipo;
    }

    public String getColor() {
        return color;
    }

    
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "\nmodelo = " + modelo + "\ntipo = " + tipo + "\ncolor = " + color;
    }

    
    
    
    
}
