package interfaz.paneles.acciones;

import javax.swing.border.EmptyBorder;

import interfaz.campos.Texto;
import interfaz.diseños.Letras;

public class Titulo extends Texto{

    private String texto = "Euler Mejorado";

    public Titulo() {
        super(Letras.titulo);
        setText(texto);
        setBorder(new EmptyBorder(15,0,0,0));
    }
}
