import java.util.Scanner;
public class ArbolNav {
    public static void main(String[] args) {
        Scanner as  = new Scanner(System.in);

        System.out.println("Ingrese el numero de la base del arbol: ");
        int base = as.nextInt();

        while(base % 2 == 0) {
            System.out.println("El numero de la base debe de ser impar");
            base = as.nextInt();
        }

        int altura = (base + 1) / 2;
        int nivel = 1;

        while(nivel <= altura){
            int espacio = altura - nivel;
            int asterisco = 2 * nivel - 1;

            int i = 0;
            while(i < espacio){
                System.out.print(" ");
                i++;
            }
            int j = 0;
            while(j < asterisco){
                System.out.print("*");
                j++;
            }
            System.out.println();
            nivel++;
        }

        int espaciob = altura - 1;
        int troncoa = 2;
        int contador = 0;

        while(contador < troncoa) {
            int x = 0;
            while (x < espaciob) {
                System.out.print("*");
                contador++;
            }
        }
    }
}
