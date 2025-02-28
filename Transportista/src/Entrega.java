import javax.swing.*;

public class Entrega {
    //atributos colocados y privados
    private String numeroGuia;
    private String estado;

    public Entrega(String numeroGuia) {
        this.numeroGuia = numeroGuia;
        this.estado = "Pendiente";
    }
    //get y set de los atributos
    public String getNumeroGuia() {
        return numeroGuia;
    }
    public String getEstado() {
        return estado;
    }
    //metodos que necesitan para utilizar la clase Entrega
    public void actualizarEstado() {
        String newEstado = JOptionPane.showInputDialog("Ingrese el nuevo estado (En proceso / Entregado): ");
        if (newEstado.equalsIgnoreCase("En proceso") || newEstado.equalsIgnoreCase("Entregado")) {
            estado = newEstado;
            JOptionPane.showMessageDialog(null, " el estado actualizado es: " + estado);
        }
        else {
            JOptionPane.showMessageDialog(null, "El estado no es correcto");
        }
    }
    public void mostrarEstado() {
        JOptionPane.showMessageDialog(null, "Numero de Guía: " + numeroGuia + "\nEstado: " + estado);
    }
}
