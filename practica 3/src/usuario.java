
import java.util.Scanner;

public class usuario {
    public static void main(String[] args) {

        Scanner usuario = new Scanner(System.in);

        System.out.println("Ingresa tu nombre: ");
        String nombre = usuario.nextLine();
        System.out.println("Ingresa tu apellido paterno: ");
        String apellidop = usuario.nextLine();
        System.out.println("Ingrese su apellido materno: ");
        String apellidom = usuario.nextLine();

        String usuariocom = (nombre + " " + apellidop + " " + apellidom);

        System.out.println(usuariocom); //nombre solo

        System.out.println("Nombre de usuario completo tres veces: ");  // nombre repetido tres veces
        for (int i = 1; i <= 3; i++) {
            System.out.println("Repetir nombre" + i + ": " + usuariocom);
        }

        System.out.println("Nombre de usuarios en minusculas: " + usuariocom.toLowerCase()); //nombre con minusculas

        System.out.println("Nombre de usuarios en mayusculas: " + usuariocom.toUpperCase()); //nombre con mayusculas

        String[] separ = usuariocom.split(" ");
        StringBuilder user = new StringBuilder();

        for (String usseer : separ) {
            if (!usseer.isEmpty()) {
                user.append(Character.toUpperCase(usseer.charAt(0)));

            }
        }
        System.out.println(user.toString());
    }
}
