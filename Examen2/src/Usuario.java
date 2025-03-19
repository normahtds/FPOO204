import javax.swing.JOptionPane;
import java.util.Random;
public class Usuario {

    private String nombre;
    private String app;
    private String apm;
    private String annacimiento;
    private String carrera;
    private String anCurso = "2025";


    public String getApp() {
        return app;
    }

    public void setApp(String app) {
        this.app = app;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApm() {
        return apm;
    }

    public void setApm(String apm) {
        this.apm = apm;
    }

    public String getAnnacimiento() {
        return annacimiento;
    }

    public void setAnnacimiento(String annacimiento) {
        this.annacimiento = annacimiento;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public Usuario() {
        this.nombre = nombre;
        this.app = app;
        this.apm = apm;
        this.annacimiento = annacimiento;
        this.carrera = carrera;

        nombre = JOptionPane.showInputDialog("Ingrese el nombre del usuario: ");
        app = JOptionPane.showInputDialog("Ingrese el apellido paterno del usuario: ");
        apm = JOptionPane.showInputDialog("Ingrese el apellido materno del usuario: ");
        annacimiento = JOptionPane.showInputDialog("Ingrese el año de nacimiento del usuario: ");
        carrera = JOptionPane.showInputDialog("IIngrese el nombre de la carrera del usuario: ");
//.substring = extraer los datos de un ddeterminado rango
        //.length() = para saber cuantos caracteres



    }

    public void mostrarInfo() {
        Random rand = new Random();
        int numero = rand.nextInt();
        if (numero >= 2)

        JOptionPane.showMessageDialog(null,"Su matricula es: " + nombre.substring(0,1)
                + app.substring(0,2).toUpperCase() + apm.substring(0,2).toUpperCase()
                + annacimiento.substring(2,4) + anCurso.substring(2,4)
                + carrera.substring(0,3).toUpperCase() + numero);
    }

}
