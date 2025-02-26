//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Vehiculo vh = new Vehiculo();
        Conductor conductor = new Conductor();

        vh.registrarVehiculo();
        conductor.RegistrarConductor();
    }
}