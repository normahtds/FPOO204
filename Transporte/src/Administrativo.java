import javax.swing.JOptionPane;

public class Administrativo extends Empleado{
    private String departamento;

    public Administrativo(String nombre, int id, double salario, String licencia) {
        super(nombre, id, salario);
        this.departamento = departamento;
    }
    @Override
    public void mostrarInfo(){
        super.mostrarInfo();
        JOptionPane.showMessageDialog(null,"\nDepartamento: " + this.departamento);
    }
}
