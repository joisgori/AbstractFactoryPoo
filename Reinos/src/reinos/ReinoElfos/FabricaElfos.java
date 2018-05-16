package reinos.ReinoElfos;

import reinos.AbstractFactory;
import reinos.ReinoOrcos.Orco;

/**
 *
 * @author Josué González <00034715@uca.edu.sv>
 */
public class FabricaElfos implements AbstractFactory {

    @Override
    public Orco getOrco(String Tipo) {
        return null;
    }

    @Override
    public Elfo getElfo(String Tipo) {
        switch (Tipo) {
            case "Arquero":
                return new Arquero();
            case "Mago":
                return new Mago();
            case "Rey":
                return new ReyElfo();
        }
        return null;
    }
}
