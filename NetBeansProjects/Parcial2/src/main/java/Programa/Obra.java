/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Programa;

/**
 *
 * @author ASUS
 */
public class Obra {

    private int idObra;
    private String NombreObra;
    private String GeneroO;
    private String DuracionObra;
    private double PrecioObra;
    private int NumeroBoletos;
    private Sala sala;

    public Obra(int idObra, String NombreObra, String GeneroO, String DuracionObra, double PrecioObra, int NumeroBoletos, Sala sala) {
        this.idObra = idObra;
        this.NombreObra = NombreObra;
        this.GeneroO = GeneroO;
        this.DuracionObra = DuracionObra;
        this.PrecioObra = PrecioObra;
        this.NumeroBoletos = NumeroBoletos;
        this.sala = sala;
    }

    
    public int getIdObra() {
        return idObra;
    }

    public void setIdObra(int idObra) {
        this.idObra = idObra;
    }

    public String getNombreObra() {
        return NombreObra;
    }

    public void setNombreObra(String NombreObra) {
        this.NombreObra = NombreObra;
    }

    public String getGeneroO() {
        return GeneroO;
    }

    public void setGeneroO(String GeneroO) {
        this.GeneroO = GeneroO;
    }

    public String getDuracionObra() {
        return DuracionObra;
    }

    public void setDuracionObra(String DuracionObra) {
        this.DuracionObra = DuracionObra;
    }

    public double getPrecioObra() {
        return PrecioObra;
    }

    public void setPrecioObra(double PrecioObra) {
        this.PrecioObra = PrecioObra;
    }

    public int getNumeroBoletos() {
        return NumeroBoletos;
    }

    public void setNumeroBoletos(int NumeroBoletos) {
        this.NumeroBoletos = NumeroBoletos;
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }

    

    @Override
    public String toString() {
        return "\n<<<OBRA>>>" + "\t\nCÓDIGO OBRA: " + idObra + "\t\nNOMBRE OBRA: " + NombreObra + "\t\nGÉNERO: " + GeneroO + "\t\nDURACIÓN: " + DuracionObra + "\t\nPRECIO: " + PrecioObra + "\t\nNÚMERO DE BOLETOS: " + NumeroBoletos + "\t\nSALA ASIGNADA: " + sala.getIDS() + "\n______________________________________";
    }

    public void ReducirStock(int acumulador) {

        this.NumeroBoletos -= acumulador;
    }

}
