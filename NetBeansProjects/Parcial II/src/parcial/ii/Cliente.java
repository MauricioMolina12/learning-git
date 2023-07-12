package parcial.ii;

import java.util.*;

public class Cliente extends Usuario {

    private int ncuenta;
    private int monto;

    public Cliente(int ncuenta, int monto, String nombre, String apellido, int id) {
        super(nombre, apellido, id);
        this.ncuenta = ncuenta;
        this.monto = monto;
    }

    public Cliente() {
        super(null, null, 0);
    }

    public int getNcuenta() {
        return ncuenta;
    }

    public void setNcuenta(int ncuenta) {
        this.ncuenta = ncuenta;
    }

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void retiro(ArrayList<Cliente> client, Scanner read, int ncuenta) {
    
        for (int i = 0; i < client.size(); i++) {
            if (ncuenta == client.get(i).getNcuenta()) {
                System.out.println("Digite cantidad a retirar");
                int cantidad = read.nextInt();
                if (client.get(i).monto >= cantidad) {
                    client.get(i).setMonto(client.get(i).getMonto() - cantidad);

                } else{
                    System.out.println("Su cantidad excede a su monto");
                }

            }

        }
    }

    public int consultar(ArrayList<Cliente> client, int ncuenta) {
        int c = 0;
        for (int i = 0; i < client.size(); i++) {
            if (ncuenta == client.get(i).getNcuenta()) {
               c = i;
               
            }
        }
     return c;
    }
    public void imprimir(int i,ArrayList<Cliente> client) {
        if (0 == client.size()) {
            System.out.println("No existe aún un cliente");
        } else {
            System.out.println("Nombre: " + client.get(i).getNombre() + " " + client.get(i).getApellido());
            System.out.println("ID: " + client.get(i).getId());
            System.out.println("Número de cuenta: " + client.get(i).getNcuenta());
            System.out.println("Saldo disponible: " + client.get(i).getMonto());
                    
        }
    }
    
    
}
