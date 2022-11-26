package interfaz.paneles.centrales.datos;

import java.awt.GridLayout;

import interfaz.campos.Campo;
import interfaz.paneles.centrales.propiedades.Contenedor;

public class ConjuntoCampos extends Contenedor{

    public Campo x0 = new Campo("Xo =", "1",20,0),
    xn = new Campo("Xn =", "1.5",20,0),
    y0 = new Campo("Yo =", "4",20,0),
    n = new Campo("N =", "5",20,0);

    public ConjuntoCampos(){
        setLayout(new GridLayout(4,0,0,20));
        setBounds(180,80,400,300);
        add(x0);
        add(xn);
        add(y0);
        add(n);
    }
}

