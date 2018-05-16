/*
 * Acá se colocará el main del programa
 */
package reinos;

import reinos.ReinoElfos.Elfo;
import reinos.ReinoOrcos.Orco;

/**
 *
 * @author Josué González <00034715@uca.edu.sv>
 */
public class Reinos {

    public static void main(String[] args) {
        AbstractFactory factory;

        factory = FabricaReinos.getFactory("Elfo");
        Elfo mago = factory.getElfo("Mago");

        mago.atacar();

        factory = FabricaReinos.getFactory("Elfo");
        Elfo arquero = factory.getElfo("Arquero");

        arquero.atacar();

        factory = FabricaReinos.getFactory("Elfo");
        Elfo rey = factory.getElfo("Rey");

        rey.atacar();

        factory = FabricaReinos.getFactory("Orco");
        Orco lanzador = factory.getOrco("Lanzador");

        lanzador.atacar();

        factory = FabricaReinos.getFactory("Orco");
        Orco hechicero = factory.getOrco("Hechicero");

        hechicero.atacar();

        factory = FabricaReinos.getFactory("Orco");
        Orco bestia = factory.getOrco("Bestia");

        bestia.atacar();

    }

}
