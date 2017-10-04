/* 
 * Author: Patrick Löwe
 * Program to print triangle based on user input as height & base
 */
import javax.swing.JOptionPane;

public class StarTriangle { // class declaration

	public static void main(String[] args) { // main method
		// string for star size
		String stringSize = JOptionPane.showInputDialog(null,"Enter Triangle Size: ");
		// convert user input to int
		int starSize = Integer.parseInt(stringSize);
		
		// loops through each row of stars
		for (int i = 0; i < starSize; i++) {
			// loops through each column of stars
			for( int j = 0; j < i; j++) {
				System.out.print("*"); // prints a star for each row
			}
		System.out.println();// prints new line
		}
	}

}
