import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese 3 numeros:");
        String num = sc.nextLine();

//String nums = String.valueOf(num);

        System.out.println((num.substring(0,1)+ num.substring(0,2)+num.substring(0,3)));
        int resultado =0;
        System.out.println((num.substring(0,1)+Integer.parseInt(num))+(num.substring(0,2)+Integer.parseInt(num)));

        System.out.println(resultado);

    }
}