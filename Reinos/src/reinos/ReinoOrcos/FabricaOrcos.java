
package reinos.ReinoOrcos;

import reinos.AbstractFactory;
import reinos.ReinoElfos.Elfo;

/**
 *
 * @author Josué González <00034715@uca.edu.sv>
 */
public class FabricaOrcos implements AbstractFactory{
    
    @Override
    public Elfo getElfo(String Tipo) {
        return null;
    }

    @Override
    public Orco getOrco(String Tipo) {
        switch (Tipo) {
            case "Lanzador":
                return new Lanzador();
            case "Hechicero":
                return new Hechicero();
            case "Bestia":
                return new BestiaMayor();
        }
        return null;
    }
}

