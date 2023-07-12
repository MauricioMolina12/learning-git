package Clases;

public class Libros {

    String tituloL, tipoL, autor, editorial;
    int codL, cantidadL;
    Pedidos pedido;

    public Libros(String tituloL, String tipoL, String autor, String editorial, int codL, int cantidadL) {
        this.tituloL = tituloL;
        this.tipoL = tipoL;
        this.autor = autor;
        this.editorial = editorial;
        this.codL = codL;
        this.cantidadL = cantidadL;
    }

    public String getTituloL() {
        return tituloL;
    }

    public void setTituloL(String tituloL) {
        this.tituloL = tituloL;
    }

    public String getTipoL() {
        return tipoL;
    }

    public void setTipoL(String tipoL) {
        this.tipoL = tipoL;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public int getCodL() {
        return codL;
    }

    public void setCodL(int codL) {
        this.codL = codL;
    }

    public int getCantidadL() {
        return cantidadL;
    }

    public void setCantidadL(int cantidadL) {
        this.cantidadL = cantidadL;
    }

}
