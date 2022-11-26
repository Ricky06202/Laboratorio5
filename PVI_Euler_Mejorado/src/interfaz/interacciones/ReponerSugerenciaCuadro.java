package interfaz.interacciones;

import java.awt.Color;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import interfaz.campos.Cuadro;

public class ReponerSugerenciaCuadro implements FocusListener {

    private Cuadro cuadro;
    private Color normal, sugerencia;
    private String textoSugerencia;
    private boolean fueEditado = false;

    public ReponerSugerenciaCuadro(Cuadro cuadro, Color normal, Color sugerencia, String textoSugerencia){
        this.cuadro = cuadro;
        this.normal = normal;
        this.textoSugerencia = textoSugerencia;
        this.sugerencia = sugerencia;
    }

    @Override
    public void focusGained(FocusEvent arg0) {
        if(!fueEditado){
            fueEditado = true;
            cuadro.setText("");
            cuadro.setForeground(normal);
        }
    }

    @Override
    public void focusLost(FocusEvent arg0) {
        if(cuadro.getText().isEmpty()){
            fueEditado = false;
            cuadro.setText(textoSugerencia);
            cuadro.setForeground(sugerencia);
        }
    }
    
}
