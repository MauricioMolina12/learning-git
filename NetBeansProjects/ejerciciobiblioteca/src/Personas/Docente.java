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
public class Docente extends Lector {

    private int codigo_d;

    public Docente(int codigo_d, String nombre, String direccion, int telefono) {
        super(nombre, direccion, telefono);
        this.codigo_d = codigo_d;
    }

    public Docente() {
        super(null, null, 0);
    }

    public int getCodigo_d() {
        return codigo_d;
    }

    public void setCodigo_d(int codigo_d) {
        this.codigo_d = codigo_d;
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
