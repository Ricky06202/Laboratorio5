package interfaz.tablas;

import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.basic.BasicScrollBarUI;
import javax.swing.table.DefaultTableCellRenderer;

import interfaz.diseños.Colores;
import interfaz.diseños.Letras;
public class Tabla extends JScrollPane {
    public Modelo modelo;
    public Matriz matriz;

    public Tabla(boolean esEditable){
        modelo = new Modelo(){
            public boolean isCellEditable(int fila, int columna){return esEditable;}
        };

        matriz = new Matriz(modelo);

        matriz.setFont(Letras.textoTabla);
        matriz.setForeground(Colores.texto);
        matriz.setBackground(Colores.tabla);
        matriz.setRowHeight(matriz.getRowHeight() + 10);

        matriz.getTableHeader().setFont(Letras.textoTituloTabla);
        matriz.getTableHeader().setForeground(Colores.letraTitulotabla);
        matriz.getTableHeader().setBackground(Colores.tituloTabla);

        setViewportView(matriz);

        getViewport().setBackground(matriz.getBackground());

        setBorder(new EmptyBorder(0,0,0,0));

        setOpaque(false);
        
        getVerticalScrollBar().setOpaque(false);
        getVerticalScrollBar().setUI(new BasicScrollBarUI() {
            @Override
            protected void configureScrollBarColors() {
                this.thumbColor = Colores.tituloTabla;
                this.trackColor = Colores.barraAcciones;
            }
        });
    }

    public void centrarColumna(int columna){
        DefaultTableCellRenderer centrado = new DefaultTableCellRenderer();
        centrado.setHorizontalAlignment(DefaultTableCellRenderer.CENTER);
        matriz.getColumnModel().getColumn(columna).setCellRenderer(centrado);
    }
}
