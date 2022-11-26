package interfaz.paneles.centrales.datos;

import interfaz.botones.Boton;
import interfaz.diseños.Letras;
import interfaz.interacciones.CalcularEulerMejorado;
import interfaz.paneles.centrales.Central;
import interfaz.paneles.centrales.propiedades.Contenedor;

public class Datos extends Contenedor {
    public Boton calcular;
    public ConjuntoCampos campos;
    public Central padre;
    public Datos(Central padre){
        this.padre = padre;
        campos = new ConjuntoCampos();
        add(campos);
        calcular = new Boton("Calcular", Letras.botonLetraGrande);
        calcular.setBounds(300,500,200,70);
        calcular.addActionListener(new CalcularEulerMejorado(this));
        add(calcular);
    }
}
