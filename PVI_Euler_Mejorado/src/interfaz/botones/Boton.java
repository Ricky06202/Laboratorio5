package interfaz.botones;

import java.awt.Dimension;

import javax.swing.JButton;

import interfaz.diseños.Colores;
import interfaz.interacciones.CambiarColorBoton;

import java.awt.Color;

public class Boton extends JButton{
    Color normal = Colores.boton, seleccionado = Colores.botonSeleccionado;
    public Boton(String texto){
        super(texto);
        setPreferredSize(new Dimension(200,70));
        setBorderPainted(false);
        addMouseListener(new CambiarColorBoton(this, normal, seleccionado));
    }
}
