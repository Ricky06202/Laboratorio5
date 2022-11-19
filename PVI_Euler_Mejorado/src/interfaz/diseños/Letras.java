package interfaz.diseños;

import java.awt.Font;

public final class Letras {
    

    private Font ponerLetra(String nombre, int estilo, int tamaño){
        // 0 normal, 1 negrita, 2 cursiva
        return new Font(nombre, estilo, tamaño);
    }
}
