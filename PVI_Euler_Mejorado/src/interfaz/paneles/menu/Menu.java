package interfaz.paneles.menu;

import java.awt.Dimension;

import javax.swing.JPanel;

import interfaz.diseños.Colores;

public class Menu extends JPanel{
    public Menu(){
        setPreferredSize(new Dimension(200,0));
        setBackground(Colores.menu);
    }
}
