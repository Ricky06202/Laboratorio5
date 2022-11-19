package interfaz;

import javax.swing.JFrame;
import java.awt.BorderLayout;

public class Ventana extends JFrame{
    public Ventana(){
        setSize(1000,700);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        setVisible(true);
    }
}
