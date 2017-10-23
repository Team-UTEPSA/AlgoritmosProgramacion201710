package gui;

import javax.swing.JOptionPane;

public class InputBoxInt{
    public static void main(String[] args){
        
        byte x;
        byte y;
        int z;
        
        x = Byte.parseByte(JOptionPane.showInputDialog("x: "),16);
        
        y = Byte.parseByte(JOptionPane.showInputDialog("y: "),16);
        
        z = x + y;
        
        String resultado = x + " + " + y + " = " + z;

        JOptionPane.showMessageDialog(null, resultado);
        System.exit(0);
    }

}