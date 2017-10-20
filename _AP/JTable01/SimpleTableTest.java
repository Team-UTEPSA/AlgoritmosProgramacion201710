import javax.swing.*; 
import javax.swing.table.*; 

public class SimpleTableTest extends JFrame { 

   public SimpleTableTest() { 
      setLocation(100,100); 
      setSize(250,100); 

      String[][] data = {  {"eggs", "sandwich", "steak", "snickers"}, 
                           {"bacon", "pickles", "potato", "apple"}, 
                           {"syrup", "mayo", "corn", "banana"}, 
                           {"pancakes", "chips", "broccoli", "crunch bar"}, 
                           {"sausage", "pizza", "pie", "protein shake"}}; 
      String[] headers = {"Breakfast", "Lunch", 
"Dinner", "Snack"}; 
      DefaultTableModel model = new DefaultTableModel(data, headers); 
      JTable table = new JTable(model); 
      JScrollPane scroll = new JScrollPane(table); 

      getContentPane().add(scroll); 

      setVisible(true); 
   } 

   public static void main(String[] args) { 
      SimpleTableTest simpleTableTest = new SimpleTableTest(); 
   } 
} 
