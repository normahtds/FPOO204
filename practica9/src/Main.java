import javax.swing.JOptionPane ;
public class Main {
    public static void main(String[] args) {
        AdministrarCuenta cliente = new AdministrarCuenta();

        while (true) {
            String[] opcion = {"Consultar saldo", "Ingresar efectivo", "Retirar efectivo", "Depositar efectivo"};
            int opc = JOptionPane.showOptionDialog(null, "Ingrese la opcion que desea realizar: ", "Caja Popular",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opcion, opcion[1]);

            switch (opc) {
                case 1:
                    cliente.Consultar_saldo();
                case 2:
                    cliente.Ingresar_efectivo();
                case 3:
                    cliente.Retirar_efectivo();
                case 4:
                    cliente.Depositar_efectivo();
                    break;
                    default:
            }
        }
    }
}