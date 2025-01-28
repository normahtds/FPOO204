
import java.util.Scanner;

public class Frase {

    public static void main(String[] args) {
        Scanner fras  = new Scanner(System.in);

        System.out.println("Ingresa una frase: ");
        String frase = fras.nextLine();

        String fraseinvert = new StringBuilder(frase).reverse().toString();

        System.out.println("La frase invertida es: " + fraseinvert);
    }
}
