package interfaz.paneles.centrales.datos;

import java.awt.GridLayout;

import interfaz.campos.Campo;
import interfaz.paneles.centrales.propiedades.Contenedor;

public class ConjuntoCampos extends Contenedor{

    public Campo x0 = new Campo("x0 = ", "1", 10, 10),
    xn = new Campo("xN = ", "1.5", 10, 10),
    y0 = new Campo("y0 = ", "4", 10, 10),
    n = new Campo("N = ", "5", 10, 10);

    public ConjuntoCampos(){
        setLayout(new GridLayout(2,2,5,5));
        setBounds(300,300,0,0);
        add(x0);
        add(xn);
        add(y0);
        add(n);
    }
}

