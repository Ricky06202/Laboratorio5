package metodo;

import metodo.datos.Funcion;

public class EulerMejorado extends Euler{

    public EulerMejorado(Funcion y, int n, double x0, double xn, double y0) {
        super(y, n, x0, xn, y0);
    }

    @Override
    public void calcularY() {
        setyActual(getyActual() + getH() * (getY(getxActual(), getyActual()) + getY(getxActual() + getH(), getyActual() + getH() * getY(getxActual(), getyActual()))) / 2);
        setxActual(getxActual() + getH());
    }
    
}
