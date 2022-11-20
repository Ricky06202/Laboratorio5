package interfaz;

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.BorderLayout;

import interfaz.paneles.acciones.BarraAcciones;
import interfaz.paneles.menu.Menu;
import interfaz.paneles.centrales.*;

public class Ventana extends JFrame{
    private JPanel barraAcciones, menu,
        central, datos, presentacion, resultados;
    public Ventana(){
        setSize(1000,700);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setLayout(new BorderLayout());
        inicializarComponentes();
        
        setVisible(true);
    }

    public void inicializarComponentes(){
        barraAcciones = new BarraAcciones();
        add(barraAcciones, BorderLayout.NORTH);

        menu = new Menu();
        add(menu, BorderLayout.WEST);

        central = new Central();
        add(central, BorderLayout.CENTER);
    }
}
