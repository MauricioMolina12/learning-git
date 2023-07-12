
package Clases;

import java.util.ArrayList;

public class PagOrd {
    
    protected int id;
    protected ArrayList<Orden> LOrden;
    protected ArrayList<Pago> LPago;

    public int getId() {
        return id;
    }

    
    public PagOrd(int id, ArrayList<Orden> LOrden, ArrayList<Pago> LPago) {
        this.id = id;
        this.LOrden = LOrden;
        this.LPago = LPago;
    }
    
    public void setId(int id) {
        this.id = id;
    }


    public ArrayList<Orden> getLOrden() {
        return LOrden;
    }

    public void setLOrden(ArrayList<Orden> LOrden) {
        this.LOrden = LOrden;
    }

    public ArrayList<Pago> getLPago() {
        return LPago;
    }

    public void setLPago(ArrayList<Pago> LPago) {
        this.LPago = LPago;
    }
    
    
}
