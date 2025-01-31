
import java.util.Scanner;
public class FrasePalab {
    public static void main(String[] args) {

        Scanner fr = new Scanner(System.in);

        System.out.println("Ingresa una frase: ");
        String frase = fr.nextLine();

        System.out.println("Ingresa una letra: ");
        char letra = fr.next().charAt(0);

        int contador = 0;

        for(int i=0; i<frase.length(); i++) {
            if(frase.charAt(i)==letra) {
                contador++;
            }
        }
        System.out.println("La letra" + letra + " aparece " + contador + " veces en la frase");
    }
}
