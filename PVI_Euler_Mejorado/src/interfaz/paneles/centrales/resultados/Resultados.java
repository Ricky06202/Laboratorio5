package interfaz.paneles.centrales.resultados;

import interfaz.paneles.centrales.propiedades.Contenedor;
import interfaz.tablas.Tabla;

public class Resultados extends Contenedor{
    public Tabla tabla;
    public ConjuntoDatos datos;
    public Resultados(){
        datos = new ConjuntoDatos();
        add(datos);
        tabla = new Tabla(true);
        tabla.setBounds(50, 200, 700, 400);
        tabla.modelo.cambiarDimensiones(0, 3);
        tabla.modelo.cambiarIdentificadores("N,X,Y".split(","));
        tabla.centrarColumna(0);
        add(tabla);
    }
}
