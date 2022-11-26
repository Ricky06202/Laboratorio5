package interfaz;

import javax.swing.JFrame;

import java.awt.BorderLayout;

import interfaz.interacciones.ArrastrarVentana;
import interfaz.paneles.acciones.BarraAcciones;
import interfaz.paneles.menu.Menu;
import metodo.datos.Funcion;
import interfaz.paneles.centrales.*;

public class Ventana extends JFrame{
    private Central central;

    public int xMouse, yMouse;

    public Ventana(Funcion f, String textoFuncion){
        setSize(1000,700);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setUndecorated(true);
        setLayout(new BorderLayout());
        inicializarComponentes(f, textoFuncion);
        
        setVisible(true);
    }

    public void inicializarComponentes(Funcion f, String textoFuncion){
        var barraAcciones = new BarraAcciones(this);
        barraAcciones.addMouseListener(new ArrastrarVentana(this));
        barraAcciones.addMouseMotionListener(new ArrastrarVentana(this));
        add(barraAcciones, BorderLayout.NORTH);
        
        central = new Central(f, textoFuncion);
        add(central, BorderLayout.CENTER);

        var menu = new Menu(central);
        add(menu, BorderLayout.WEST);

        
    }
}
