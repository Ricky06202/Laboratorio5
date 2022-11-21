package interfaz.botones;

import java.awt.Dimension;

import interfaz.diseños.Colores;
import interfaz.diseños.Letras;
import interfaz.interacciones.CambiarColorBoton;

public class BotonChico extends Boton{

    public BotonChico(String texto) {
        super(texto);
        normal = Colores.botonChico;
        seleccionado = Colores.botonChicoSeleccionado;
        setBackground(normal);
        setFont(Letras.botonChico);
        setForeground(Colores.letraBotonChico);
        setPreferredSize(new Dimension(60, 50));
        addMouseListener(new CambiarColorBoton(this, normal, seleccionado));
    }
    
}
