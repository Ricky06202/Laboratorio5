package interfaz.tablas;

import javax.swing.table.DefaultTableModel;

public class Modelo extends DefaultTableModel{

    public void cambiarDimensiones(int fila, int columna){
        String identificadores = "";
        for (int iteracion = 0; iteracion < columna; iteracion++) {
            identificadores += "X" + iteracion;
            if(iteracion != columna-1)
                identificadores += ",";
        }
        cambiarIdentificadores(identificadores.split(","));
        setRowCount(0);
        setRowCount(fila);
    }

    public void cambiarIdentificadores(Object[] identificadores){
        setColumnIdentifiers(identificadores);
    }
}
