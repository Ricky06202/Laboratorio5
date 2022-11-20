package interfaz.paneles.acciones;

import java.awt.Dimension;

import javax.swing.JPanel;

import interfaz.diseños.Colores;

public class BarraAcciones extends JPanel{
    public BarraAcciones() {
        setPreferredSize(new Dimension(0,50));
        setBackground(Colores.barraAcciones);
    }
}
