package interfaz.campos;

import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.border.EmptyBorder;

import interfaz.diseños.Colores;
import interfaz.diseños.Letras;

public class Texto extends JLabel {
    public Texto(Font letra){
        setFont(letra);
        setForeground(Colores.texto);
        setHorizontalAlignment(CENTER);
        // setBorder(new EmptyBorder(15,0,0,0));
    }
    public Texto(){
        this(Letras.texto);
    }
}
