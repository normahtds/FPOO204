import javax.swing.JOptionPane;

public class Vehiculo {

    //atributos colocados y privados
    private String modelo;
    private int placa;
    private int capacidadCarga;
    private Conductor conductor;

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
    //get y set de los atributos
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

    public Conductor getConductor() {return conductor;}

    //metodos que necesitan para utilizar la clase Vehiculo y su relacion con la clase Conductor
    public void asignarConductor(Conductor conductor) {
        if (this.conductor == null) {
            this.conductor = conductor;
            JOptionPane.showMessageDialog(null, "Conductor asignado correctamente");
        }
        else {
            JOptionPane.showMessageDialog(null, "El vehiculo ya tiene conductor asignado");
        }
    }

    public void registrarVehiculo() {
        JOptionPane.showMessageDialog(null, "El vehiculo se ha registrado: \n"
        + "Modelo: " + modelo + "\n"
        + "Placa: " + placa + "\n"
        + "Capacidad de carga: " + capacidadCarga);
    }
    public void mostrarVehiculoConductor() {
        String mensa = "Modelo: " + modelo + "\n"
        + "Placa: " + placa + "\n"
        + "Capacidad de carga (kg): " + capacidadCarga;
        if (conductor != null) {
            mensa += "\nConductor asignado: :" + conductor.getNombre();
        }
        else {
            mensa += "\nConductor no encontrado";
        }
        JOptionPane.showMessageDialog(null, mensa);
    }
}
