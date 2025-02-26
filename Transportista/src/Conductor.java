import javax.swing.JOptionPane;

public class Conductor {

    private String nombre;
    private int identificacion;
    private int licencia;

    public Conductor() {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.licencia = licencia;

        this.nombre = JOptionPane.showInputDialog("Ingrese el nombre del conductor: ");

        String ident = JOptionPane.showInputDialog("Ingrese el identificacion del conductor: ");
        this.identificacion = Integer.parseInt(ident);

        String licen = JOptionPane.showInputDialog("Ingrese el licencia del conductor: ");
        this.licencia = Integer.parseInt(licen);

    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIdentificacion() {
        return identificacion;
    }

    public int getLicencia() {
        return licencia;
    }
    public void RegistrarConductor() {
        JOptionPane.showMessageDialog(null, "El conductor se ha registrado: \n"
        + "Nombre: " + nombre + "\n"
        + "Identificacion: " + identificacion + "\n"
        + "Licencia: " + licencia);
    }
}
