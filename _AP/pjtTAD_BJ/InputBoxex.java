import javax.swing.JOptionPane;

public class InputBoxex{
	public static void main(String[] args){
		String nombre;
		nombre = JOptionPane.showInputDialog("Nombre: ");
		String apellido;
		apellido = JOptionPane.showInputDialog("Apellido: ");
		
		String nombre_completo;
		nombre_completo = apellido + " " + nombre;
		
		jOptionPane.showMessageDialog(null, nombre_completo);
		System.exit(0);
	}

}