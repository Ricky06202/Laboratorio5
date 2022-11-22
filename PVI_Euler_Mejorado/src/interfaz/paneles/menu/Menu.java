package interfaz.paneles.menu;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JPanel;

import interfaz.botones.Boton;
import interfaz.diseños.Colores;
import interfaz.diseños.Letras;
import interfaz.interacciones.CambiarPanelBoton;
import interfaz.paneles.centrales.Central;

public class Menu extends JPanel{
    public Menu(Central central){
        setPreferredSize(new Dimension(200,0));
        setBackground(Colores.menu);
        setLayout(new FlowLayout(FlowLayout.CENTER, 0, 50));

        var presentacion = new Boton("Presentación", Letras.botonLetraChica);
        var datos = new Boton("Datos");
        var resultados = new Boton("Resultados");

        presentacion.panel = central.presentacion;
        datos.panel = central.datos;
        resultados.panel = central.resultados;

        presentacion.addActionListener(new CambiarPanelBoton(presentacion, central));
        datos.addActionListener(new CambiarPanelBoton(datos, central));
        resultados.addActionListener(new CambiarPanelBoton(resultados, central));

        add(presentacion);
        add(datos);
        add(resultados);
    }
}
