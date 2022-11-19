package interfaz.tablas;

import javax.swing.JScrollPane;

public class Tabla extends JScrollPane {
    public Modelo modelo;
    public Matriz matriz;

    public Tabla(boolean esEditable){
        if(esEditable)
            modelo = new Modelo();
        else
            modelo = new Modelo(){
                public boolean isCellEditable(int fila, int columna){return false;}
            };
        matriz = new Matriz(modelo);
    }
}
