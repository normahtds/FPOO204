import javax.swing.JOptionPane;

public class Envio {
    //atributos colocados y privados
    private String codigoEnvio;
    private String destino;
    private int peso;

    public Envio(String codigoEnvio, String destino) {
       this.codigoEnvio = codigoEnvio;
       this.destino = destino;
    }

    public Envio() {
        this.codigoEnvio = codigoEnvio;
        this.destino = destino;
        this.peso = peso;
    }
    //get y set de los atributos
    public String getCodigoEnvio() {
        return codigoEnvio;
    }

    public String getDestino() {
        return destino;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
    //metodos que necesitan para utilizar la clase Envio
    public static Envio crearEnvio() {
        String codigo = JOptionPane.showInputDialog("Ingrese el codigo de envio: ");
        String destino = JOptionPane.showInputDialog("Ingrese el destino: ");
        String pesoes = JOptionPane.showInputDialog("Ingrese el peso: ");

        if(pesoes.isEmpty()){
            return new Envio(codigo, destino);
        }
        else {
            int peso = Integer.parseInt(pesoes);
            return new Envio(codigo, destino);
        }
    }
    public void mostrarEnvio() {
        JOptionPane.showMessageDialog(null, "Codigo de envio: " + codigoEnvio
        + "\nDestino: " + destino
        + "\nPeso: " + peso);
    }
}
