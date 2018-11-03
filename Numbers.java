import javax.swing.JOptionsPane;

public class Numbers{
	public static void main(String[] args){
		String firstNumber = JOptionpane.showInputDialog("Enter the First Number");
		// Convert the string to an integer

		int number1 = Integer.parseInt(firstNumber);
		String secondnumber = JOptionpane.showInputDialog("Enter the Second Number");

		// Convert the string to integer

		int number2 = Integer.parseInt(secondnumber);
		int sum = number1+number2;

		double average = (double)sum/2;

		JOptionPane.showMessageDialog(null, "Sum is :" + sum + "Average :" + average);
	}
}