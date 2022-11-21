package interfaz.campos;

import java.awt.Color;
import javax.swing.JTextField;

import interfaz.diseños.Colores;
import interfaz.diseños.Letras;
import interfaz.interacciones.ReponerSugerenciaCuadro;

public class Cuadro extends JTextField {
    
    private Color normal = Colores.letraCampo, sugerencia = Colores.letraSugerenciaCampo;

    public Cuadro(String textoSugerencia) {
        setFont(Letras.texto);
        setForeground(sugerencia);
        addMouseListener(new ReponerSugerenciaCuadro(this, normal, sugerencia, textoSugerencia));
    }
}
