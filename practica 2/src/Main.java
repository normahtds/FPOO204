//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

//IMPORTACIONES
//import java.util.Random;
import java.util.Scanner;



//Clase Principal
public class Main {

    //Metodo Main
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
    /* System.out.printf("Hola, Norma!");
        String cadenas = "norma" + "trejo" + "de santiago";

        System.out.println(cadenas);

        //La funcion length es para saber cuantos caracteres tiene
        System.out.println(cadenas.length());

        //Extrae los datos de un determinado rango
        System.out.println(cadenas.substring(2,5));
        System.out.println(cadenas.substring(2));
        System.out.println(cadenas.substring(0,5));
     */

      /*  //3. Variables

        int x=5, x2;
        double y=1.25, y2;
        String z= "204", z1;

        //Conversion de cadena a int
        x2= Integer.parseInt(z);

        //Conversion de double a cadena
        z1= String.valueOf(y);

        //Converion de int a double
        double asd= Double.valueOf(x); //en esta conversion solo es para nuemeros como enteros y el parse es para cadenas

        // Converion Implicita
        int num= 12;
        double numD= num;
        System.out.println("Conversion Implicita"+num);

        System.out.println(x2);
        System.out.println(z1);
        System.out.println(asd);

        Random rdn= new Random();

        int numAleatorio= rdn.nextInt();
        double numDouble= rdn.nextDouble();

        System.out.println("Aleatorio entero: "+numAleatorio);
        System.out.println("Aleatorio double: "+numDouble);
        */

        /* //4. Solicitud de datos
        Scanner scn=new Scanner(System.in);

        System.out.println("Introduzca cualquier dato");
        String dato=scn.nextLine();

        System.out.println("Introduzca un numero entero");
        int datoentero=scn.nextInt();

        System.out.println("Introduzca un numero con decimales");
        double datodecimal=scn.nextDouble();

        System.out.println("Cualquier dato: "+dato);

        System.out.println("Dato entero: "+datoentero);

        System.out.println("Dato decimal: "+datodecimal);

         */

        //5. Boolean, operadores logicos y de comparacion

        System.out.println(10 > 9); //true
        System.out.println(10 == 9); //false
        System.out.println(10 < 9); //false
        System.out.println(10 >= 9); //true
        System.out.println(10 <= 9); //false
        System.out.println(10 != 9); //true

        int x= 3;
        System.out.println(x< 5 && x>10); //false
        System.out.println(x< 5 || x>10); //true
        System.out.println(!(x< 5 && x>10)); //true
    }
}