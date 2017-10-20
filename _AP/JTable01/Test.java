import java.awt.Dimension;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableModel;

/**
 * @see https://stackoverflow.com/a/37318673/230513
 */
public class Test {

    private void display() {
        JFrame f = new JFrame("Test");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        TableModel model = new AbstractTableModel() {
            private static final int N = 32;

            @Override
            public int getRowCount() {
                return N;
            }

            @Override
            public int getColumnCount() {
                return N;
            }

            @Override
            public Object getValueAt(int rowIndex, int colIndex) {
                return "R" + rowIndex + ":C" + colIndex;
            }
        };
        
        JTable table = new JTable(model) {
            @Override
            public Dimension getPreferredScrollableViewportSize() {
                return new Dimension(320, 240);
            }
        };
        
        table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        
        f.add(new JScrollPane(table));
        f.pack();
        f.setLocationRelativeTo(null);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(new Test()::display);
    }
}