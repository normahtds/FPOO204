import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Empleado> empleados = new ArrayList<Empleado>(); //generar una lista
        int opciones;
        opciones = Integer.parseInt(JOptionPane.showInputDialog("Selecione una de las opciones\n "
        + "1. Agregar empleado\n"
        + "2. Enlistar empleado\n"
        +"3. Salir"));

        switch (opciones) {
            case 1:
                String tipoEmpleado = JOptionPane.showInputDialog("Ingrese un tipo de empleado (Administrativo/Conductor):");

                String nombre = JOptionPane.showInputDialog("Ingrese el nombre del empleado: ");

                int id = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el id del empleado: "));

                double salario = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el salario del empleado: "));

                if(tipoEmpleado.equals("Conductor")){
                    String licencia = JOptionPane.showInputDialog("Ingrese el tipo de licencia del empleado: ");
                    empleados.add(new Conductor(nombre, id, salario, licencia));
                }
                else if(tipoEmpleado.equals("Administrativo")){
                    String departamento = JOptionPane.showInputDialog("Ingrese el departamento del empleado: ");
                    empleados.add(new Administrativo(nombre, id, salario, departamento));
                }
                else {
                    JOptionPane.showMessageDialog(null, "Tipo de empleado no valido");
                }
            break;
            case 2:
                if (empleados.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "No se encontro el empleado");
                }
                else {
                    for (Empleado emp: empleados) {
                        emp.mostrarInfo();
                    }
                }
            break;
            case 3:
                JOptionPane.showMessageDialog(null, "Salir del sistema");
                break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcion no valida");

        }
    }
}