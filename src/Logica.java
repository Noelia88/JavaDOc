import javax.swing.JOptionPane;
/**
 * 
 * @author noeli
 *
 */

public class Logica {

	
	/**
	 * OJO CON LA SUMA
	 */
	public void sumar() {
		int num1= 5; // Esta variable es entera
		int num2= 6;
		
		JOptionPane.showMessageDialog(null,(num1+num2));
	}
	
	
	/**
	 * 
	 * @param num1
	 * @param num2
	 */
	
	public void restar(int num1, int num2)
	{
		JOptionPane.showMessageDialog(null,(num1-num2));
	}
	
	
	
	public int multiplicar(int num1, int num2)
	{
		return num1*num2;
	}
	
}
