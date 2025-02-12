//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Creamos Objeto = Instanciar objeto
        Spartan jefeMaestro = new Spartan();
        Spartan reach = new Spartan();

        //Asignamos los atributos del objeto
        jefeMaestro.nombre = "John";
        jefeMaestro.salud = 100;
        jefeMaestro.escudo = 90;
        jefeMaestro.armaPrincipal = "Rifle de asalto";

        //Usar sus metodos
        jefeMaestro.mostrarInfo();
        jefeMaestro.atacar("Elite");
        jefeMaestro.recargarArma(65);
        jefeMaestro.correr(true);

        //Atributos del segundo objeto
        reach.nombre = "Emile";
        reach.salud = 0;
        reach.escudo = 0;
        reach.armaPrincipal = "Aguijoneador";

        reach.mostrarInfo();
        reach.atacar("Brunt");
        reach.recargarArma(0);
        reach.correr(false);

    }
}