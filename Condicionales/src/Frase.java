
import java.util.Scanner;

public class Frase {

    public static void main(String[] args) {
        Scanner fras = new Scanner(System.in);

        System.out.println("Ingrese una frase o palabra: ");
        String frase = fras.nextLine();

        String reves = "";

        for (int i = frase.length() - 1; i >= 0; i--) {
            reves = reves + frase.charAt(i);
        }
        if (reves.equals(frase)) {
            System.out.println("La frase es palindromo");
        }
        else {
            System.out.println("La frase es no palindromo");
        }
    }
}
