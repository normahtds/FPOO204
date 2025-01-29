
import java.util.Scanner;
public class Calculadora {

    public static void main(String[] args) {
        Scanner ope = new Scanner(System.in);


        System.out.println("Ingrese un numero: ");
        double num = ope.nextDouble();

        System.out.println("Ingrese un numero: ");
        double num2 = ope.nextDouble();

        System.out.println("+, -, *, /");

        System.out.println("Escoge una opcion: ");
        char opcion = ope.next().charAt(0);



        double resultado = 0;
        boolean validar = true;

        switch (opcion) {
            case '+':
                resultado = num + num2;
                break;
            case '-':
                resultado = num - num2;
                break;
            case '*':
                resultado = num * num2;
                break;
            case '/':
                if (num2 != 0) {
                    resultado = (num / num2);
                }
                else {
                    System.out.println("No hay division con cero");
                    validar = false;
                }
                break;
            default:
                System.out.println("Operador no valido");
                validar = false;
        }
        if (validar) {
            System.out.println("El resultado es: " + resultado);
        }
    }
}
