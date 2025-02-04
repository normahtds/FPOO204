import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa un numero: ");
        int num = sc.nextInt();
        int res = 0;
        int resu = 1;


        for (int i = 0 ; i <= res ; i++) {
            if (num % 2 == 0) {
                res = (num / 2);
                System.out.println(res);
                if (res %2 == 1) {
                    resu= (res / 2);
                    System.out.println(resu);

                }
            }
            else {
                res = (num * 3 + 1);
                System.out.println(res);
                if (res %2 == 0)
                    resu= (res / 2);
            }


        }
    }
}
