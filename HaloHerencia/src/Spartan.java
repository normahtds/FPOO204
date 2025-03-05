public class Spartan extends Soldado{

    private  int escudo;

    public Spartan(String nombre, int salud, String arma, int escudo) {
        super(nombre, salud, arma); // en esta linea es donde se se hereda lo que antes ya teniamos en Soldado
        this.escudo = escudo;
    }

    public void recargarEscudo() {
        escudo = 100;
        System.out.println("El Spartan " + nombre + " recargo su escudo al maximo" + escudo);
    }

    @Override //es utilizado para el polimormismo y buena escritura
    public void recibirDano(int dano) {
        if(escudo > 0){
            escudo -= dano;
            if (escudo < 0){
                salud += escudo;
                escudo = 0;
            }
            System.out.println("El Spartan " + nombre + " recibio daño, Escudo: " + escudo + " Salud: " + salud);
        }
        else{
            super.recibirDano(dano); // Se hereda el daño de la clase Padre
        }
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Escudo: " + this.escudo);
    }
}
