import javax.swing.JOptionPane;

/*
 * Author: Patrick L�we
 * Program to compare 2 numbers
 */
public class CompareTwoNumbers {// main class

	public static void main(String[] args) { // main method
		// capture user input into strings
		String input_Num1 = JOptionPane.showInputDialog("Enter Number 1: ");
		String input_Num2 = JOptionPane.showInputDialog("Enter Number 2: ");
		// convert strings into type Integer
		int Num1 = Integer.parseInt(input_Num1);
		int Num2 = Integer.parseInt(input_Num2);
		
		// if statement depending on number comparisons
		if(Num1 < Num2) {
			JOptionPane.showMessageDialog(null, "Num1(" + Num1 + ") is less than Num2(" + Num2 + ")");
		}// if num1 < num2
		else if (Num2 < Num1){
			JOptionPane.showMessageDialog(null, "Num2(" + Num2 + ") is less than Num1(" + Num1 + ")");
		}// Num2 is less
		else {
			JOptionPane.showMessageDialog(null, "Num1(" + Num1 + ") & Num2(" + Num2 + ") are equivalent.");
		}// numbers are equivalent
	}// main method

}// main class
