import javax.swing.JOptionPane;

/*
 * Author: Patrick L�we
 * Program to compare 2 numbers
 */
public class Factors {// main class

	public static void main(String[] args) { // main method
		// capture user input into strings
		String input_Num1 = JOptionPane.showInputDialog("Enter Number 1: ");
		String input_Num2 = JOptionPane.showInputDialog("Enter Number 2: ");
		// convert strings into type Integer
		int Num1 = Integer.parseInt(input_Num1);
		int Num2 = Integer.parseInt(input_Num2);
		int lower; // variable for lower number
		int higher; // variable for higher number
		
		// if statement depending on number comparisons
		if(Num1 < Num2) {
			lower = Num1;
			higher = Num2;
		}// if num1 < num2
		else{
			lower = Num2;
			higher = Num1;
		}// Num2 is less
		
		if(higher % lower == 0) { // if lower is a facotr
			int times = higher / lower;// how many times lower goes into higher
			JOptionPane.showMessageDialog(null, lower + " is a factor of "+higher+" ("+lower+" goes into "+higher+" exactly "+times+" times");
		}
		else {// if lower is not a factor
			int factor = higher / lower;// how many times lower goes into higher
			int remainder = higher % lower;// what is remaining
			// display results in message
			JOptionPane.showMessageDialog(null, lower+" is not a factor of "+higher+" ("+lower+" goes into "+higher+" a total of "+factor+" times, with "+remainder+" over)");
		}
		//exit gracefully
		System.exit(0);
	}// main method

}// main class
