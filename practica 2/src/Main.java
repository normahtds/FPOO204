//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

//IMPORTACIONES

//Clase Principal
public class Main {

    //Metodo Main
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hola, Norma!");
        String cadenas = "norma" + "trejo" + "de santiago";

        System.out.println(cadenas);

        //La funcion length es para saber cuantos caracteres tiene
        System.out.println(cadenas.length());

        //Extrae los datos de un determinado rango
        System.out.println(cadenas.substring(2,5));
        System.out.println(cadenas.substring(2));
        System.out.println(cadenas.substring(0,5));
    }
}