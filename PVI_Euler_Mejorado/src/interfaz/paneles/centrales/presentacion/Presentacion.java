package interfaz.paneles.centrales.presentacion;

import interfaz.campos.Imagen;
import interfaz.paneles.centrales.propiedades.Contenedor;

public class Presentacion extends Contenedor {
    public Presentacion() {
        add(new TemaEIntegrantes());
        int escala = 200;
        add(new Imagen(10, 5, escala, escala, "src\\imagenes\\logoUTP.png"));
        add(new Imagen(600-5, 5, escala, escala, "src\\imagenes\\logoSistemas.png"));
    }
}
