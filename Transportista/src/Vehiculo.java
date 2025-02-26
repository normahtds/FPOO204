import javax.swing.JOptionPane;

public class Vehiculo {

    private String modelo;
    private int placa;
    private int capacidadCarga;

    public Vehiculo() {

        this.modelo = modelo;
        this.placa = placa;
        this.capacidadCarga = capacidadCarga;

        this.modelo = JOptionPane.showInputDialog("Ingrese el modelo del vehiculo: ");

        String plac = JOptionPane.showInputDialog("Ingrese la placa del vehiculo: ");
        this.placa = Integer.parseInt(plac);

        String capacidad = JOptionPane.showInputDialog("Ingrese la capacidad de carga del vehiculo: ");
        this.capacidadCarga = Integer.parseInt(capacidad);
    }
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getPlaca() {
        return placa;
    }

    public void setPlaca(int placa) {
        this.placa = placa;
    }

    public int getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(int capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    public void registrarVehiculo() {
        JOptionPane.showMessageDialog(null, "El vehiculo se ha registrado: \n"
        + "Modelo: " + modelo + "\n"
        + "Placa: " + placa + "\n"
        + "Capacidad de carga: " + capacidadCarga);

    }
}
