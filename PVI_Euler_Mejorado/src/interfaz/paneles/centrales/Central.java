package interfaz.paneles.centrales;

import javax.swing.JPanel;

import interfaz.diseños.Colores;
import interfaz.paneles.centrales.datos.Datos;
import interfaz.paneles.centrales.presentacion.Presentacion;
import interfaz.paneles.centrales.resultados.Resultados;
import metodo.datos.Funcion;

import java.awt.GridLayout;

// esta clase nos servira para poder hacer el cambio de paneles (principal, datos, resultados)
public class Central extends JPanel{

    public Presentacion presentacion = new Presentacion();
    public Resultados resultados = new Resultados();
    public Datos datos = new Datos(this);
    public Funcion f;
    public String textoFuncion;

    public Central(Funcion f, String textoFuncion) {
        this.f = f;
        this.textoFuncion = textoFuncion;
        setBackground(Colores.central);
        setLayout(new GridLayout(1,1));

        add(presentacion);
    }
}
