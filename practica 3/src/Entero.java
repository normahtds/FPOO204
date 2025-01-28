
import java.util.Scanner;

public class Entero {
    public static void main(String[] args) {

        Scanner ent = new Scanner(System.in);

        System.out.println("Ingresa un numero entero: ");
        int x = ent.nextInt();

        int suma = 0;

        for (int i = 1; i <= x; i++) {
            suma += i;
        }
        System.out.println("La suma de los numeros enteros es: " + suma);
    }
}
