package Clases;

public class Revistas {

    String tituloR, tipoR, autorR, editorialR;
    int codR, cantidadR;
    Pedidos pedido;

    public Revistas(String tituloR, String tipoR, String autorR, String editorialR, int codR, int cantidadR) {
        this.tituloR = tituloR;
        this.tipoR = tipoR;
        this.autorR = autorR;
        this.editorialR = editorialR;
        this.codR = codR;
        this.cantidadR = cantidadR;
    }

    public String getTituloR() {
        return tituloR;
    }

    public void setTituloR(String tituloR) {
        this.tituloR = tituloR;
    }

    public String getTipoR() {
        return tipoR;
    }

    public void setTipoR(String tipoR) {
        this.tipoR = tipoR;
    }

    public String getAutorR() {
        return autorR;
    }

    public void setAutorR(String autorR) {
        this.autorR = autorR;
    }

    public String getEditorialR() {
        return editorialR;
    }

    public void setEditorialR(String editorialR) {
        this.editorialR = editorialR;
    }

    public int getCodR() {
        return codR;
    }

    public void setCodR(int codR) {
        this.codR = codR;
    }

    public int getCantidadR() {
        return cantidadR;
    }

    public void setCantidadR(int cantidadR) {
        this.cantidadR = cantidadR;
    }

}
