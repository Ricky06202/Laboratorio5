package interfaz.paneles.acciones;

import java.awt.FlowLayout;
import java.awt.ComponentOrientation;

import interfaz.Ventana;
import interfaz.botones.BotonChico;
import interfaz.paneles.centrales.propiedades.Contenedor;

public class Acciones extends Contenedor{

    public BotonChico cerrar, minimizar;

    public Acciones(Ventana ventana) {
        setLayout(new FlowLayout(FlowLayout.RIGHT,0,0));
        setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);

        cerrar = new BotonChico("X");
        cerrar.addActionListener((e) -> ventana.dispose());

        minimizar = new BotonChico("—");
        minimizar.addActionListener((e) -> ventana.setState(Ventana.ICONIFIED));

        add(cerrar);
        add(minimizar);
    }
}
