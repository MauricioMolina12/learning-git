/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Programa;

import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class prod_prov {
    
    protected  ArrayList <producto> prod;
    protected ArrayList <proveedor> prov;

    public prod_prov(ArrayList<producto> prod, ArrayList<proveedor> prov) {
        this.prod = prod;
        this.prov = prov;
    }

    public ArrayList<producto> getProd() {
        return prod;
    }

    public void setProd(ArrayList<producto> prod) {
        this.prod = prod;
    }

    public ArrayList<proveedor> getProv() {
        return prov;
    }

    public void setProv(ArrayList<proveedor> prov) {
        this.prov = prov;
    }

    
    

    
    
    
    
}
