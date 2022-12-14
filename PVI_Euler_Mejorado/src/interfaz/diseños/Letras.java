package interfaz.diseños;

import java.awt.Font;

public final class Letras {
    
    public final static Font
        titulo = ponerLetra("Magneto", 1, 40),
        boton = ponerLetra("Forte", 1, 30),
        botonLetraChica = ponerLetra("Forte", 1, 29),
        botonLetraGrande = ponerLetra("Forte", 1, 40),
        botonChico = ponerLetra("Cooper Black", 1, 29),
        texto = ponerLetra("Segoe Print", 0, 30),
        textoTabla = ponerLetra("Segoe Print", 0, 20),
        textoTituloTabla = ponerLetra("Segoe Print", 1, 20)
    ;

    private static Font ponerLetra(String nombre, int estilo, int tamaño){
        // 0 normal, 1 negrita, 2 cursiva
        return new Font(nombre, estilo, tamaño);
    }
}
