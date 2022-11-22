package interfaz.interacciones;

import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.event.MouseInputListener;

import java.awt.Color;

public class CambiarColorBoton implements MouseInputListener{

    private JButton boton;
    private Color normal, seleccionado;

    public CambiarColorBoton(JButton boton, Color normal, Color seleccionado){
        this.boton = boton;
        this.normal = normal;
        this.seleccionado = seleccionado;
    }

    @Override
    public void mouseClicked(MouseEvent arg0) {
        
    }

    @Override
    public void mouseEntered(MouseEvent arg0) {
        boton.setBackground(seleccionado);
        
    }

    @Override
    public void mouseExited(MouseEvent arg0) {
        boton.setBackground(normal);
        
    }

    @Override
    public void mousePressed(MouseEvent arg0) {
        
    }

    @Override
    public void mouseReleased(MouseEvent arg0) {
        
    }

    @Override
    public void mouseDragged(MouseEvent arg0) {
        
    }

    @Override
    public void mouseMoved(MouseEvent arg0) {
        
    }
    
}
