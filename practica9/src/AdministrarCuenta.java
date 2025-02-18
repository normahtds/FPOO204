import javax.swing.JOptionPane;

public class AdministrarCuenta {


    public String titular;
    int edad;
    int noCuenta;
    double saldo;
    double monto;
    int cuentaD;

    public void Consultar_saldo() {
        titular = JOptionPane.showInputDialog( "Ingrese el titular");
        noCuenta = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el No. Cuenta: "));
        saldo = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el Saldo: "));
        JOptionPane.showMessageDialog(null, "Titular: " + titular + " No. Cuenta es :" + noCuenta + " y su saldo es: " + saldo);

    }

    public void Ingresar_efectivo() {
        noCuenta = Integer.parseInt(JOptionPane.showInputDialog( "Ingrese el No. Cuenta: "));
        monto = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el Monto: "));
        saldo += monto;
        JOptionPane.showMessageDialog(null, "No. de cuenta: " + noCuenta + " y el monto que ingresaste es: " + monto +
                " tu saldo nuevo es: " + saldo);

    }

    public void Retirar_efectivo() {
        noCuenta = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el No. Cuenta: "));
        monto = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el monto que desea retirar: "));
        if (monto <= saldo) {
            saldo -= monto;
            JOptionPane.showMessageDialog(null, "No. de cuenta: " + noCuenta + " --RETIRO EXITOSO-- " +  " tu saldo nuevo es: " + saldo);
        }
        else {
            JOptionPane.showMessageDialog(null, "No. de cuenta: " + noCuenta + " --SALDO INSUFICIENTE-- ");
        }
    }

    public void Depositar_efectivo() {
        titular = JOptionPane.showInputDialog("Ingrese el titular");
        JOptionPane.showMessageDialog(null, titular);
        noCuenta = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el No. Cuenta: "));
        JOptionPane.showMessageDialog(null, noCuenta);
        cuentaD = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el cuenta que desea depositar: "));
        JOptionPane.showMessageDialog(null, cuentaD);
        monto = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el monto que desea de depositar: "));
        JOptionPane.showMessageDialog(null, monto);
        if (monto <= saldo) {
            saldo -= monto;
            cuentaD += monto;
            JOptionPane.showMessageDialog(null, "No. de cuenta: " + noCuenta + " --TRASNFERENCIA EXITOSA-- " +  " tu saldo nuevo es: " + saldo);
        }
        else {
            JOptionPane.showMessageDialog(null, "No. de cuenta: " + noCuenta + " --SALDO INSUFICIENTE-- ");
        }
    }
}
