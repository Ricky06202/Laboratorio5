package metodo;

import metodo.datos.Funcion;

public abstract class Euler {
    private Funcion y;
    private double x0, xn, h,xActual, yActual;
    private int n;

    

    public Euler(Funcion y, int n, double x0, double xn, double y0) {
        this.y = y;
        this.n = n;
        this.x0 = x0;
        this.xn = xn;
        calcularH();
        xActual = x0;
        yActual = y0;
    }

    @Override
    public String toString() {
        return String.format("x = %f, y = %f", xActual, yActual);
    }

    private void calcularH(){
        h = (xn - x0) / n;
    }

    public abstract void calcularY();

    public double getxActual() {
        return xActual;
    }

    public void setxActual(double xActual) {
        this.xActual = xActual;
    }

    public double getyActual() {
        return yActual;
    }

    public void setyActual(double yActual) {
        this.yActual = yActual;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public double getY(double x, double y) {
        return this.y.evaluar(x, y);
    }

    public double getH() {
        return h;
    }
}
