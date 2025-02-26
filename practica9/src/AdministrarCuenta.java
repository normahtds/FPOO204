import javax.swing.JOptionPane;

public class AdministrarCuenta {

    private String titular;
    private int edad;
    private int noCuenta;
    private double saldo = 100;
    private double monto;
    private int cuentaD;

    public AdministrarCuenta () {
        this.titular = "Desconocido";
        this.edad = 0;
        this.noCuenta = 0;
        this.saldo = 100;
        this.monto = 0;
    }

        public String getTitular () {
            return titular;
        }

        public void setTitular (String titular){
            this.titular = titular;
        }

        public int getEdad () {
            return edad;
        }

        public void setEdad ( int edad){
            this.edad = edad;
        }

        public int getNoCuenta () {
            return noCuenta;
        }

        public void setNoCuenta ( int noCuenta){
            this.noCuenta = noCuenta;
        }

        public double getSaldo () {
            return saldo;
        }

        public void setSaldo ( double saldo){
            this.saldo = saldo;
        }

        public double getMonto () {
            return monto;
        }

        public void setMonto ( double monto){
            this.monto = monto;
        }

        public int getCuentaD () {
            return cuentaD;
        }

        public void setCuentaD ( int cuentaD){
            this.cuentaD = cuentaD;
        }

        public void Consultar_saldo () {

            titular = JOptionPane.showInputDialog("Ingrese el titular");
            noCuenta = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el No. Cuenta: "));
            saldo = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el Saldo: "));
            JOptionPane.showMessageDialog(null, "Titular: " + titular + " No. Cuenta es :" + noCuenta + " y su saldo es: " + saldo);

        }

        public void Ingresar_efectivo () {
            noCuenta = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el No. Cuenta: "));
            monto = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el Monto: "));
            saldo += monto;
            JOptionPane.showMessageDialog(null, "No. de cuenta: " + noCuenta + " y el monto que ingresaste es: " + monto +
                    " tu saldo nuevo es: " + saldo);

        }

        public void Retirar_efectivo () {
            noCuenta = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el No. Cuenta: "));
            monto = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el monto que desea retirar: "));
            if (monto <= saldo) {
                saldo -= monto;
                JOptionPane.showMessageDialog(null, "No. de cuenta: " + noCuenta + " --RETIRO EXITOSO-- " + " tu saldo nuevo es: " + saldo);
            } else {
                JOptionPane.showMessageDialog(null, "No. de cuenta: " + noCuenta + " --SALDO INSUFICIENTE-- ");
            }
        }

        public void Depositar_efectivo () {
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
                JOptionPane.showMessageDialog(null, "No. de cuenta: " + noCuenta + " --TRASNFERENCIA EXITOSA-- " + " tu saldo nuevo es: " + saldo);
            } else {
                JOptionPane.showMessageDialog(null, "No. de cuenta: " + noCuenta + " --SALDO INSUFICIENTE-- ");
            }
        }
}
