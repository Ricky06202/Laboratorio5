package interfaz.paneles.acciones;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JPanel;

import interfaz.Ventana;
import interfaz.diseños.Colores;

public class BarraAcciones extends JPanel{
    public BarraAcciones(Ventana ventana) {
        setPreferredSize(new Dimension(0,50));
        setBackground(Colores.barraAcciones);
        setLayout(new BorderLayout());
        add(new Acciones(ventana), BorderLayout.EAST);
        add(new Titulo(), BorderLayout.CENTER);
        add(new Logo(), BorderLayout.WEST);
    }
}
