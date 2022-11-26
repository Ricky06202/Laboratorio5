package interfaz.paneles.centrales.resultados;

import java.awt.FlowLayout;

import interfaz.campos.Texto;
import interfaz.paneles.centrales.propiedades.Contenedor;

public class ConjuntoDatos extends Contenedor{
    public Texto x0 = new Texto("Xo = ??"),
    xn = new Texto("Xn = ??"),
    y0 = new Texto("Yo = ??"),
    n = new Texto("N = ??"),
    h = new Texto("H = ??"),
    f = new Texto("f(x,y) = ?????????????");
    public ConjuntoDatos(){
        setLayout(new FlowLayout(FlowLayout.CENTER, 50, 5));
        setAlignmentX(CENTER_ALIGNMENT);
        setAlignmentY(CENTER_ALIGNMENT);
        setBounds(100,0,630,300);
        add(x0);
        add(xn);
        add(y0);
        add(n);
        add(h);
        add(f);
    }
}
