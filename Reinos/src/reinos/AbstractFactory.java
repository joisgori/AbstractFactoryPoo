/*
 * la interfaz del abstract factory
 */
package reinos;

import reinos.ReinoElfos.Elfo;
import reinos.ReinoOrcos.Orco;

/**
 *
 * @author Josué González <00034715@uca.edu.sv>
 */
public interface AbstractFactory {
    Elfo getElfo(String Tipo);
    Orco getOrco(String Tipo);
}
