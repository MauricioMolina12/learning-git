package parcial.ii;

import java.util.ArrayList;
import java.util.Scanner;

public class Banquero extends Usuario {

    private String usuario = "bnq012";
    private String contraseña = "banquero*7895";
    protected ArrayList<Usuario> usuarios;
    protected static ArrayList<Cliente> clientes;

    public Banquero() {
        super(null, null, 0);
    }

    public Banquero(String usuario, String contraseña, ArrayList<Usuario> usuarios, ArrayList<Cliente> clientes, String nombre, String apellido, int id) {
        super(nombre, apellido, id);
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.usuarios = usuarios;
        this.clientes = clientes;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(ArrayList<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
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

    public void consignar(ArrayList<Cliente> client, Scanner read, int ncuenta) {

        for (int i = 0; i < client.size(); i++) {
            if (ncuenta == client.get(i).getNcuenta()) {
                System.out.println("Digite cantidad a consignar");
                int cantidad = read.nextInt();
                client.get(i).setMonto(client.get(i).getMonto() + cantidad);

            }

        }

    }

    public void registra(Scanner read, ArrayList<Cliente> client) {
        System.out.println("Digite el numero de usuarios a registrar");
        int usu = read.nextInt();
        int e = 0;
        int ncu;
        for (int i = 0; i < usu; i++) {

            System.out.println("Digite el numero de cuenta");
            ncu = read.nextInt();
            for (int r = 0; r < client.size(); r++) {
                if (ncu == client.get(r).getNcuenta()) {
                    System.out.println("Esta cuenta ya existe.");
                    e = 1;
                }
            }
            if (e == 1) {
                i = ncu;
            } else {

                System.out.println("");
                System.out.println("Digite el id usuario");
                int id = read.nextInt();
                System.out.println("Digite el nombre del Usuario");
                String nombre = read.next();
                System.out.println("Digite el apellido del Usuario");
                String apellido = read.next();

                client.add(new Cliente(ncu, 0, nombre, apellido, id));
                System.out.println("Registro exitoso");
            }

        }

    }
}
