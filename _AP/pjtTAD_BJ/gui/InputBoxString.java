package gui;

import javax.swing.JOptionPane;

public class InputBoxString{
	public static void main(String[] args){
		String nombre;
		nombre = JOptionPane.showInputDialog("Nombre: ");
		
		String apellido;
		apellido = JOptionPane.showInputDialog("Apellido: ");
		
		String nombre_completo;
		nombre_completo = apellido + " " + nombre;
		
		JOptionPane.showMessageDialog(null, nombre_completo);
		System.exit(0);
	}

}