
import java.util.Scanner;

public class NumAtras {
    public static void main(String[] args) {

        Scanner na =  new Scanner(System.in);

        System.out.println("Ingrese un numero entero positivo: ");
        int num = na.nextInt();

        for (int i = 0; i <= num; i++) {
            System.out.print(i);
            System.out.print(" ,");
        }
    }
}
