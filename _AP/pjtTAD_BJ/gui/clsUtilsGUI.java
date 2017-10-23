package gui;

import javax.swing.*;


public class clsUtilsGUI
{
    public void msgbox(String msg){
        JOptionPane.showMessageDialog(null, msg, "TAD:: Información", JOptionPane.INFORMATION_MESSAGE);
    }

    
    public byte inputbox_Byte(String msg){
        return Byte.parseByte(JOptionPane.showInputDialog(msg),16);
    }
    
    
    public int inputbox_Int(String msg){
        return Integer.parseInt(JOptionPane.showInputDialog(msg));
    }
    

    public String inputbox_String(String msg){
        return JOptionPane.showInputDialog(msg).toString();
    }
    
    
  
    
}
