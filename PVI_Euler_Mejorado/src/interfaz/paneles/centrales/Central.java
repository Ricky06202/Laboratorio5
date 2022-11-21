package interfaz.paneles.centrales;

import javax.swing.JPanel;

import interfaz.diseños.Colores;
import interfaz.paneles.centrales.propiedades.Contenedor;

import java.awt.GridLayout;

// esta clase nos servira para poder hacer el cambio de paneles (principal, datos, resultados)
public class Central extends JPanel{

    public Contenedor presentacion, datos, resultados;

    public Central() {
        setBackground(Colores.central);
        setLayout(new GridLayout(1,1));

        presentacion = new Presentacion();
        add(presentacion);

        datos = new Datos();

        resultados = new Resultados();
    }
}
