package interfaz.tablas;

import javax.swing.JTable;

public class Matriz extends JTable {
    Matriz(Modelo modelo){
        setModel(modelo);
        getTableHeader().setReorderingAllowed(false);
    }
}
