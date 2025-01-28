
import java.util.Scanner;

public class Contrasena {

    public static void main(String[] args) {

        Scanner contra = new Scanner(System.in);

        String contrasena = "Alumnoo";

        System.out.println("Ingrese una contraseña: ");
        String cont = contra.nextLine();

        if(contrasena == "Alumnoo") {
            System.out.println("La contraseña es correcta");
        }
        else{
            System.out.println("La contaseña no es correcta");
        }
    }
}
