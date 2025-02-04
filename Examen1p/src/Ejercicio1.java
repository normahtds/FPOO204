
import java.util.Scanner;
public class Ejercicio1 {

    public static void main(String[] args) {

        System.out.println("Serie de numeros");
        int resul= 0;
        for (int i = 10; i <= 1000; i=i+10){
            resul= i+10;
            System.out.printf( i + " ," + resul + "\n");
        }
    }
}
