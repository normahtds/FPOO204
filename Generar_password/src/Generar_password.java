import javax.swing.JOptionPane;
import java .util.Random;
public class Generar_password {

    public String longitud = "abcdefghijkmnlopqrstzwx1234567890";
    char alta;
    char media;
    char baja;
    String pass;
    String com = "";

    public void Generar_password() {
        int p = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la longitud del password que deseas generar: "));
        JOptionPane.showInputDialog("Deseas agregar mayusculas: ");
        JOptionPane.showInputDialog("Desea agregar simbolos: ");
        Random rdn = new Random();


        for (int i = 0; i < p; i++) {
            p = rdn.nextInt(longitud.length());
            JOptionPane.showMessageDialog(null, "El password es: " + p);
        }
    }

}
