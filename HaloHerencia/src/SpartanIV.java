public class SpartanIV extends Spartan{

    public SpartanIV(String nombre, int salud, String arma, int escudo){
        super(nombre, salud, arma, 100);
    }

    public void usaPropulsores(){
        System.out.println("El Spartan " + nombre + " Usa propulsores para moverse rapidamente");
    }
}
