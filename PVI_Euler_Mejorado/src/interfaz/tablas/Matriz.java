package interfaz.tablas;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Matriz extends JTable {
    Matriz(DefaultTableModel modelo){
        super(modelo);
        getTableHeader().setReorderingAllowed(false);
    }
}
