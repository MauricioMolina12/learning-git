/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Personas;

/**
 *
 * @author ASUS
 */
public class Estudiante extends Lector{
    
    private int codigo_e;

    public Estudiante(int codigo_e, String nombre, String direccion, int telefono) {
        super(nombre, direccion, telefono);
        this.codigo_e = codigo_e;
    }

    public Estudiante() {
        super(null, null, 0);
    }
    

    public int getCodigo_e() {
        return codigo_e;
    }

    public void setCodigo_e(int codigo_e) {
        this.codigo_e = codigo_e;
    }

    @Override
    public void reservar(String material) {
        System.out.println("Digite el id de lector");
        int id = read.nextInt();
        
        
        System.out.println("Digite codigo material");
        int codigo = read.nextInt();
        
        System.out.println("Fecha reserva");
        String fr = read.next();
        
        System.out.println("Fecha límite: 30 días después de su reserva.");
    }

    @Override
    public void entregar(String material) {
    
        System.out.println("Digite el código del material");
        int codigo = read.nextInt();
        
        System.out.println("Fecha entrega");
        String fe = read.next();
    }
    
    
    
    
}
