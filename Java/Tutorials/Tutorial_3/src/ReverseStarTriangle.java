/* 
 * Author: Patrick Löwe
 * Program to print triangle based on user input as height & base
 */
import javax.swing.JOptionPane;

public class ReverseStarTriangle { // class declaration

	public static void main(String[] args) { // main method
		// string for star size
		String stringSize = JOptionPane.showInputDialog(null,"Enter Triangle Size: ");
		// convert user input to int
		int starSize = Integer.parseInt(stringSize);
		
		// loops through each row of stars
		for (int i = starSize; i > 0; i--) {
			// loops through each column of stars
			for( int j = i; j > 0; j--) {
				System.out.print("*"); // prints a star for each row
			}
		System.out.println();// prints new line
		}
	}

}
