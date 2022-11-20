package interfaz.paneles.centrales;

import javax.swing.JPanel;

import interfaz.diseños.Colores;

import java.awt.GridLayout;

// esta clase nos servira para poder hacer el cambio de paneles (principal, datos, resultados)
public class Central extends JPanel{
    public Central() {
        setBackground(Colores.central);
        setLayout(new GridLayout(1,1));
    }
}
