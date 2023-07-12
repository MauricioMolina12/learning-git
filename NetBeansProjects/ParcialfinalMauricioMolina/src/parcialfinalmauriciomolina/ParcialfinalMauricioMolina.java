package parcialfinalmauriciomolina;

import java.util.*;

public class ParcialfinalMauricioMolina {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Random rnd = new Random();
        double saldocuenta;
        int tc;
        do {
            System.out.println("Numero de cuenta");
            int numcuenta = reader.nextInt();
            saldocuenta = rnd.nextInt();
            System.out.println("Digite saldo");
            saldocuenta = reader.nextDouble();
            System.out.println("Digite su nombre");
            String nomtitular = reader.next();
            Cuenta_bancaria cliente = new Cuenta_bancaria(numcuenta, saldocuenta, nomtitular);
            System.out.println("\nMenú");
            System.out.println("Digite la cuenta que usará ");
            System.out.println("1.Cuenta ahorro");
            System.out.println("2.Cuenta corriente");
            System.out.println("3.Salir");
            tc = reader.nextInt();

            if (tc == 1) {
                System.out.println("\nMenú");
                System.out.println("1.Depositar");
                System.out.println("2.Retirar");
                int opc = reader.nextInt();

                switch (opc) {
                    case 1:
                        System.out.println("Cuanto dinero desea depositar?");
                        int dinerodep = reader.nextInt();
                        cliente.depositar(dinerodep);
                        cliente.imprimir();
                        break;
                    case 2:
                        System.out.println("Cuanto dinero desea retirar?");
                        int dineroret = reader.nextInt();
                        cliente.retirar(dineroret);
                        cliente.imprimir();
                }
            } else if (tc == 2) {
                double tasainteres = Math.random();
                System.out.println("La tasa de interés es: " + tasainteres);
                Cuenta_ahorro cliente1 = new Cuenta_ahorro(tasainteres, numcuenta, saldocuenta, nomtitular);
                System.out.println("\nMenú");
                System.out.println("1.Depositar");
                System.out.println("2.Retirar");
                System.out.println("3.Salir");
                int opc = reader.nextInt();
                switch (opc) {
                    case 1:
                        System.out.println("Cuanto dinero desea depositar?");
                        int dinerodep = reader.nextInt();
                        cliente1.depositar(dinerodep);
                        cliente1.imprimir();
                        break;
                    case 2:
                        System.out.println("Cuanto dinero desea retirar?");
                        int dineroret = reader.nextInt();
                        cliente1.retirar(dineroret);
                        cliente1.imprimir();
                        break;
                    case 3:
                        System.exit(0);

                }
                System.out.println("presione 1 para meterse nuevamente");
                System.out.println("presione 2 para finalizar");
                opc = reader.nextInt();
                if (opc == 2) {
                    System.exit(0);
                }

            }
        } while (tc != 3);

    }

}
