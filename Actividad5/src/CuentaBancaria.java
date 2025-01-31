import java.util.Scanner;
public class CuentaBancaria {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);

        int saldo = 0;
        System.out.println("Ingrese una opcion D para deposito, R para retiro");

        while(true) {
            String init = cs.nextLine().trim();
            if (init.isEmpty()) {
                break;
            }
            char op = init.charAt(0);
            int monto = Integer.parseInt(init.substring(2));

            switch(op) {
                case 'D':
                    saldo += monto;
                    System.out.println("Deposito de " + monto + "pesos y su saldo es:" + saldo);
                    break;
                case 'R':
                    if (monto <= saldo) {
                        saldo -= monto;
                        System.out.println("Retiro de " + monto + "pesos");
                    }
                    break;
                default:
                    System.out.println("Operacion incorrecta");
            }
        }
        System.out.println("Saldo total: " + saldo);
    }
}
