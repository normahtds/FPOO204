
import java.util.Scanner;
public class SalaJuegos {

    public static void main(String[] args) {

        Scanner edad = new Scanner(System.in);

        System.out.println("Ingrese su edad: ");
        int ed = edad.nextInt();

        if(ed<4){
            System.out.println("Es menor de 4 años, no paga su entrada");
        }
        if(ed>=4 && ed<18){
            System.out.println("Tiene que pagar su entrada $110");
        }
        if(ed>18) {
            System.out.println("Tiene que pagar su entrada $190");
        }
    }
}
