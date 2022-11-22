package interfaz.paneles.centrales.presentacion;

import java.awt.GridLayout;

import interfaz.campos.Texto;
import interfaz.paneles.centrales.propiedades.Contenedor;

public class TemaEIntegrantes extends Contenedor{
    public TemaEIntegrantes() {
        setLayout(new GridLayout(10,1));
        setBounds(50, 200, 700, 500);
    
        var textoMetodos = new Texto("Usando el Metodo de Euler Mejorado");
    
        var textoMetodos2 = new Texto("Para Resolver Problemas de PVI");
    
        var textoCreadoPor = new Texto("Creado por:");
    
        var textoIntegrantes = new Texto("Ricardo Sanjur");
    
        // var textoIntegrantes2 = new Texto("Thaís Samudio");
    
        
        add(textoMetodos);
        add(textoMetodos2);
        add(new Texto());
        add(textoCreadoPor);
        add(textoIntegrantes);
        // add(textoIntegrantes2);
    }
}
