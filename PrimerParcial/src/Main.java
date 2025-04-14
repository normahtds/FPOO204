import java.util.Scanner;
public class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese 10 numeros: ");
        int num = sc.nextInt();


        System.out.println("Ingrese la opcion que desea realizar: " + "\n" +
                "1. Imprimir lista invertida"  + "\n" +
                "2. Imprimir lista sin repetir");
        int opc = sc.nextInt();

        switch (opc){
            case 1:
                String lisInvertida = new StringBuilder(num).reverse().toString();
                System.out.println("La lista invertida es: " + lisInvertida);

            case 2:
                if(num != num){
                    System.out.println("La lista sin repetir es: " + num);
            }
                break;
        }
    }
}