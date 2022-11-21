package interfaz.interacciones;

import java.awt.Color;

import java.awt.event.MouseEvent;

import javax.swing.event.MouseInputListener;

import interfaz.campos.Cuadro;

public class ReponerSugerenciaCuadro implements MouseInputListener{

    private Cuadro cuadro;
    private Color normal, sugerencia;
    private String textoSugerencia;

    public ReponerSugerenciaCuadro(Cuadro cuadro, Color normal, Color sugerencia, String textoSugerencia){
        this.cuadro = cuadro;
        this.normal = normal;
        this.sugerencia = sugerencia;
        this.textoSugerencia = textoSugerencia;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource().equals(cuadro) && e.getSource() instanceof Cuadro){
            if(cuadro.getText().equals(textoSugerencia)){
                cuadro.setText("");
                cuadro.setForeground(normal);
            }
        }else{
            if(cuadro.getText().isBlank()){
                cuadro.setText(textoSugerencia);
                cuadro.setForeground(sugerencia);
            }
        }
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
        // TODO Auto-generated method stub
        
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        // TODO Auto-generated method stub
        
    }
    
}
