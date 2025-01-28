
import java.util.Scanner;
public class ParImar {

    public static void main(String[] args) {

        Scanner numero = new Scanner(System.in);

        System.out.println("Ingrese un numero entero: ");
        int num = numero.nextInt();

        if(num%2==0){
            System.out.println("Par");
        }
        else{
            System.out.println("Impar");
        }
    }
}
