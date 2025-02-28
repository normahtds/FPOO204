import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Vehiculo vehiculo = null;
        Conductor conductor = null;
        Envio envio = null;
        Entrega entrega = null;

        while (true){
            //menu para poder utilizar una opcion y que muestre la informacion
            String[] opciones = {"Registrar Vehiculo", "Registrar Conductor", "Asignar Conductor a Vehiculo",
            "Registrar Envio", "Actualizar Estado de Entrega", "Salir"};

            int selec = JOptionPane.showOptionDialog(null, "Seleccione una opcion: ", "Menu",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opciones, opciones[0]);

            switch (selec) {
                case 0: // registrar vehiculo
                    vehiculo = new Vehiculo();
                            vehiculo.registrarVehiculo();
                    JOptionPane.showMessageDialog(null, "El vehiculo se ha registrado.");
                    break;
                case 1: // registro de conductor
                    conductor = new Conductor();
                            conductor.RegistrarConductor();
                    JOptionPane.showMessageDialog(null, "El conductor se ha registrado.");
                    break;
                case 2: // asignacion de vehiculo y asignacion de conductor
                    if(vehiculo == null) {
                        JOptionPane.showMessageDialog(null, "Se debe de registrar el vehiculo");
                    }
                    else if (conductor == null) {
                        JOptionPane.showMessageDialog(null, "Se debe de registrar el conductor");
                    }
                    else {
                        vehiculo.asignarConductor(conductor);
                        vehiculo.mostrarVehiculoConductor();
                    }
                    break;
                case 3: // crear envio
                    envio = Envio.crearEnvio();
                    JOptionPane.showMessageDialog(null, "El envio se ha enviado.");
                    break;
                case 4: // crear entrega
                    if(entrega == null) {
                        String numeroGuia = JOptionPane.showInputDialog("Ingrese el numero de Guia");
                        entrega = new Entrega(numeroGuia);
                    }
                    entrega.mostrarEstado();
                    entrega.actualizarEstado();
                    entrega.mostrarEstado();
                    break;
                case 5: // salir del programa
                    JOptionPane.showMessageDialog(null, "Salir");
                    System.exit(0);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcion no valida");
            }
        }
    }
}