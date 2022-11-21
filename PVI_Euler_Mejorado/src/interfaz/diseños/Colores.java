package interfaz.diseños;

import java.awt.Color;

public final class Colores {
    
    public final static Color 
        barraAcciones = ponerColor("fffac1"),
        central = ponerColor("fffbf3"),
        menu = ponerColor("ea7e2e"),
        boton = ponerColor("ea7e2e"),
        botonSeleccionado = ponerColor("d74021"),
        letraBoton = ponerColor("fffac1"),
        botonChico = ponerColor("fffac1"),
        botonChicoSeleccionado = ponerColor("fff470"),
        letraBotonChico = ponerColor("d74021"),
        texto = ponerColor("d74021"),
        titulo = ponerColor("d74021"),
        campo = ponerColor("fffac1"),
        letraSugerenciaCampo = ponerColor("ea7e2e"),
        letraCampo = ponerColor("d74021")
    ;

    private static Color ponerColor(String hexadecimal){
        int rgb = Integer.parseInt(hexadecimal, 16);
        return new Color(rgb);
    }
}
