import javax.swing.JOptionPane;


public class Aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Logica milogica = new Logica();
		milogica.sumar();
		milogica.restar(5,3);
		int mult= milogica.multiplicar(2, 4);
		JOptionPane.showMessageDialog(null, mult);
		
		//añadimos comentario
		
		
		
	}

	
}
