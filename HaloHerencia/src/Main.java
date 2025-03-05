//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        SpartanII jefeMaestro = new SpartanII("Jonh", 100, "Rifle de asalto", 150);
        jefeMaestro.mostrarInfo();
        jefeMaestro.usarManejoAvanzado();
        jefeMaestro.atacar("Covenant");
        jefeMaestro.recibirDano(50);
        jefeMaestro.recargarEscudo();

        SpartanIII jefeAmigo = new SpartanIII("Sam", 75, "Escopeta", 80);
        jefeAmigo.mostrarInfo();
        jefeAmigo.atacar("Abejam");
        jefeAmigo.recibirDano(11);
        jefeAmigo.camuflajeActivo();

        SpartanIV jefeMalo = new SpartanIV("Ben", 200, "Rifle de asalto", 100);
        jefeMalo.mostrarInfo();
        jefeMalo.usaPropulsores();
        jefeMalo.recibirDano(195);
        jefeMalo.recargarEscudo();
    }
}