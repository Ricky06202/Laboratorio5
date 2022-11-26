package interfaz.campos;

import java.awt.GridLayout;

import interfaz.paneles.centrales.propiedades.Contenedor;

// el campo es una combinacion de un texto junto a un campo de texto
public class Campo extends Contenedor{

    public Cuadro cuadro;

    public Campo(String texto, String sugerencia, int espacioX, int espacioY) {
        setOpaque(false);
        setLayout(new GridLayout(1, 2, espacioX, espacioY));
        add(new Texto(texto));
        cuadro = new Cuadro(sugerencia);
        add(cuadro);
    }
    public Campo(String texto, String sugerencia) {
        this(texto, sugerencia, 0, 0);
    }
}
