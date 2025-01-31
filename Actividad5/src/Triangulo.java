
import java.util.Scanner;
public class Triangulo {

    public static void main(String[] args) {
        Scanner tr = new Scanner(System.in);

        System.out.println("Ingrese un numero entero: ");
        int numero = tr.nextInt();

        for(int i=1; i<=numero; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

