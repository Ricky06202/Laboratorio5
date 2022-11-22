package interfaz.campos;

import java.awt.Font;
import javax.swing.JLabel;

import interfaz.diseños.Colores;
import interfaz.diseños.Letras;

public class Texto extends JLabel {
    public Texto(String texto,Font letra){
        setFont(letra);
        setForeground(Colores.texto);
        setHorizontalAlignment(CENTER);
        setText(texto);
        // setBorder(new EmptyBorder(15,0,0,0));
    }
    public Texto(String texto){
        this(texto, Letras.texto);
    }
    public Texto(){
        this("", Letras.texto);
    }
    public Texto(Font letra){
        this("", letra);
    }
}
