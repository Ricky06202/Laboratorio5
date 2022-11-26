package interfaz.interacciones;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import interfaz.botones.Boton;
import interfaz.paneles.centrales.Central;

public class CambiarPanelBoton implements ActionListener{

    private Boton boton;
    private Central central;

    public CambiarPanelBoton(Boton boton, Central central){
        this.boton = boton;
        this.central = central;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(boton)){
            central.removeAll();
            central.add(boton.panel);                      
            central.updateUI();                
        }
    }
    
}
