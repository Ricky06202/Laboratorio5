package interfaz.campos;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Imagen extends JLabel {

    public Imagen(int x, int y, int ancho, int alto, String ruta) {
        setBounds(x, y, ancho, alto);
        ponerIcono(ruta);
    }

    private void ponerIcono(String ruta) {
        ImageIcon imagen = new ImageIcon(ruta);
        Icon icono = new ImageIcon(
                imagen.getImage().getScaledInstance(this.getWidth(), this.getHeight(), Image.SCALE_SMOOTH));
        this.setIcon(icono);
    }
}
