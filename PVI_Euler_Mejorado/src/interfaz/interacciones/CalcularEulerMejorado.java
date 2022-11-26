package interfaz.interacciones;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.JOptionPane;

import interfaz.paneles.centrales.datos.Datos;
import interfaz.paneles.centrales.resultados.Resultados;
import metodo.EulerMejorado;

public class CalcularEulerMejorado implements ActionListener{

    private Datos datos; 
    private Resultados salida;

    private DecimalFormat decimales = new DecimalFormat("#.############");
    private DecimalFormat menosDecimales = new DecimalFormat("#.######");
    private DecimalFormat dosDecimales = new DecimalFormat("#.##");

    public CalcularEulerMejorado(Datos datos){
        this.datos = datos;
        this.salida = datos.padre.resultados;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //* Obtenemos las Variables
        double x0, xn, y0;
        int n;
        try {
            x0 = Double.parseDouble(datos.campos.x0.cuadro.getText());    
            xn = Double.parseDouble(datos.campos.xn.cuadro.getText());    
            y0 = Double.parseDouble(datos.campos.y0.cuadro.getText());    
            n = Integer.parseInt(datos.campos.n.cuadro.getText());    
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(datos, "Error, Numero Ingresado Invalido", "ERROR NUMERO INVALIDO", JOptionPane.ERROR_MESSAGE, null);
            return;
        }

        //* Introducimos los valores al objeto Euler Mejorado
        var euler = new EulerMejorado(datos.padre.f, n, x0, xn, y0); 
        
        //* Mostramos los datos Principales
        salida.datos.x0.setText(actualizarValor(salida.datos.x0.getText()) + formato2(x0));
        salida.datos.xn.setText(actualizarValor(salida.datos.xn.getText()) + formato2(xn));
        salida.datos.y0.setText(actualizarValor(salida.datos.y0.getText()) + formato2(y0));
        salida.datos.n.setText(actualizarValor(salida.datos.n.getText()) + n);
        salida.datos.h.setText(actualizarValor(salida.datos.h.getText()) + formatoChico(euler.getH()));
        salida.datos.f.setText(actualizarValor(salida.datos.f.getText()) + datos.padre.textoFuncion);

        //* Borramos todas las filas
        salida.tabla.modelo.setRowCount(0);

        //* Ponemos el valor de la primera fila
        salida.tabla.modelo.addRow(new Object[] {0, formato(x0), formato(y0)});
        
        //* Calculamos e Introducimos los Datos a la tabla
        for (int contador = 1; contador <= n; contador++) {
            euler.calcularY();
            var fila = new Object[] {contador, formato(euler.getxActual()), formato(euler.getyActual())};
            salida.tabla.modelo.addRow(fila);
        }
    }

    private String formato(double n){
        return decimales.format(n);
    }
    private String formatoChico(double n){
        return menosDecimales.format(n);
    }
    private String formato2(double n){
        return dosDecimales.format(n);
    }

    private String actualizarValor(String valor){
        return valor.substring(0, valor.indexOf("=") + 1) + " ";
    }
    
}
