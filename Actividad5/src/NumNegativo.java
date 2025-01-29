
import java.util.Scanner;
public class NumNegativo {

    public static void main(String[] args) {

        Scanner nn = new Scanner(System.in);

        System.out.println("Ingrese un numero entero positivo: ");
        int num = nn.nextInt();

        for (int i = 1; i<=num; i+=2 ) {
            if (i > 1) {
                System.out.print(" ,");
            }
            System.out.print(i);
        }

    }
}
