/*
 * La clase FabricaReinos que permitirá escoger el caso de fabricación entre Elfo u Orco.
 */
package reinos;

import reinos.ReinoElfos.FabricaElfos;
import reinos.ReinoOrcos.FabricaOrcos;

/**
 *
 * @author Josué González <00034715@uca.edu.sv>
 */
public class FabricaReinos {
    public static AbstractFactory getFactory(String Tipo){
        switch (Tipo){
            case "Elfo":
                return  new FabricaElfos();
            case "Orco":
                return new FabricaOrcos();
        }
        return null;
    }
}
