package interfaz.botones;

import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JButton;

import interfaz.diseños.Colores;
import interfaz.diseños.Letras;
import interfaz.interacciones.CambiarColorBoton;

import java.awt.Color;

public class Boton extends JButton{
    Color normal = Colores.boton, seleccionado = Colores.botonSeleccionado;
    public Boton(String texto){
        super(texto);
        setBorderPainted(false);
        setFocusPainted(false);
        setBackground(normal);
        setFont(Letras.boton);
        setForeground(Colores.letraBoton);
        setPreferredSize(new Dimension(200,70));
        addMouseListener(new CambiarColorBoton(this, normal, seleccionado));
    }
    public Boton(String texto, Font letra){
        this(texto);
        setFont(letra);
    }
}
