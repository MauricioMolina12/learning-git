package parcial.ii;

import java.util.*;

public class ParcialII {

    static Scanner read = new Scanner(System.in);
    static Banquero ban = new Banquero();
    static Cliente c = new Cliente();
    static ArrayList<Usuario> username = new ArrayList<Usuario>();
    static ArrayList<Cliente> client = new ArrayList<Cliente>();

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int opc = 0;
        int cl;
        int opc2 = 0;
        do {
            System.out.println("MENÚ TIPO USUARIO");
            System.out.println("1.Cliente");
            System.out.println("2.Banquero");
            System.out.println("3.Salir");
            opc = read.nextInt();

            switch (opc) {
                case 1:
                    System.out.println("________________________________________");
                    System.out.println("MENÚ CLIENTE");
                    System.out.println("¿Que deseas realizar?");
                    System.out.println("1.Consultar");
                    System.out.println("2.Retirar");
                    System.out.println("3.Salir");
                    cl = read.nextInt();

                    if (cl == 1) {
                        if (0 == client.size()) {
                            System.out.println("Primero debe registrar un número de cuenta");
                        } else if (client.size() > 0) {
                            System.out.println("Digite número cuenta");
                            int ncuenta = read.nextInt();

                            System.out.println("Saldo disponible: " + "$ " + client.get(c.consultar(client, ncuenta)).getMonto());
                        }
                    
                        } else if (cl == 2) {
                            if (0 == client.size()) {
                                System.out.println("No puedes retirar dinero de una cuenta que no existe.");
                            } else if (client.size() > 0) {
                                System.out.println("Digite número de cuenta.");
                                int ncuenta = read.nextInt();
                                c.retiro(client, read, ncuenta);

                            }
                        }
                    
                    break;
                case 2:
                    boolean e = false;
                    do {
                        System.out.println("");
                        System.out.println("------------------------------------");
                        System.out.println("Digite usuario");
                        String username = read.next();
                        System.out.println("Digite contraseña");
                        String password = read.next();
                        System.out.println("------------------------------------");
                        if (username.equals(ban.getUsuario()) && password.equals(ban.getContraseña())) {
                            e = true;
                            System.out.println("Acceso permitido");
                        } else {
                            System.out.println("Usuario o contraseña incorrecta");
                        }

                    } while (e == false);
                    do {
                        System.out.println("");
                        System.out.println("------------------------------------");
                        System.out.println("MENÚ BANQUERO");
                        System.out.println("1.Registrar");
                        System.out.println("2.Consignar");
                        System.out.println("3.Imprimir datos cliente");
                        System.out.println("4.Salir");
                        System.out.println("Digite la opción-->");
                        System.out.println("------------------------------------");
                        opc2 = read.nextInt();

                        if (opc2 == 1) {
                            ban.registra(read, client);
                        } else if (opc2 == 2) {
                            System.out.println("Digite número de cuenta");
                            int ncuenta = read.nextInt();
                            ban.consignar(client, read, ncuenta);
                        } else if (opc2 == 3) {
                            if (0 == client.size()) {
                                System.out.println("No existe aún un cliente.");
                            } else {
                                for (int i = 0; i < client.size(); i++) {
                                    c.imprimir(i, client);
                                }
                            }
                        }

                    } while (opc2 != 4);

            }
        } while (opc != 3);

    }
}
