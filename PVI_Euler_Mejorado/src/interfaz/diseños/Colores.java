package interfaz.diseños;

import java.awt.Color;

public final class Colores {
    

    private Color ponerColor(String hexadecimal){
        int rgb = Integer.parseInt(hexadecimal, 16);
        return new Color(rgb);
    }
}
