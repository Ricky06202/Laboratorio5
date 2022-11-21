package interfaz.interacciones;

import java.awt.event.MouseEvent;

import javax.swing.event.MouseInputListener;

import interfaz.Ventana;

public class ArrastrarVentana implements MouseInputListener{

    private Ventana ventana;

    public ArrastrarVentana(Ventana ventana){
        this.ventana = ventana;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void mouseExited(MouseEvent e) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void mousePressed(MouseEvent e) {
        ventana.xMouse = e.getX();
        ventana.yMouse = e.getY();
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        int x = e.getXOnScreen();
        int y = e.getYOnScreen();
        ventana.setLocation(x - ventana.xMouse, y - ventana.yMouse);
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        // TODO Auto-generated method stub
        
    }
    
}
