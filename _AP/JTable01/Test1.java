import javax.swing.*;

public class Test1
{
   public static void main(String[] args)
   {
       JFrame f = new JFrame();
       JTable t = new JTable();
       JScrollPane sp = new JScrollPane(t, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
       f.getContentPane().add(sp);
       f.setSize(300, 300);
       f.show();
   }
}
