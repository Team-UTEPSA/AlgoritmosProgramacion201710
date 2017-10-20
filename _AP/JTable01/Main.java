import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Main {
  public static void main(String[] argv) {
    // Create a table with 10 rows and 5 columns
    JTable table = new JTable(10, 5);

    // Make the table vertically scrollable
    JScrollPane scrollPane = new JScrollPane(table);

  }
}