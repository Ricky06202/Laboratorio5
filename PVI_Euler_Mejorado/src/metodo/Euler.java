package metodo;

import metodo.datos.Funcion;

public class Euler {
    private Funcion y;
    private double x0, xn, y0, yn, h, yUltimo, yAnterior;
    private int n;

    public void calcularH(){
        h = (xn - x0) / n;
    }
}
