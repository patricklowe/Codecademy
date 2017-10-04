/* 
 * Author: Patrick Löwe
 * Program to print triangle based on user input as height & base
 */
import javax.swing.JOptionPane;

public class StarBox { // class declaration

	public static void main(String[] args) { // main method
		// Captures user input for box width & height
		String stringWidth = JOptionPane.showInputDialog(null,"Enter Box Width: ");
		String stringHeight = JOptionPane.showInputDialog(null,"Enter Box Height: ");
		// converts width & height into integers
		int boxWidth = Integer.parseInt(stringWidth);
		int boxHeight = Integer.parseInt(stringHeight);
		
		// prints out the top line of the box
		for (int i = 0; i < boxWidth; i++) {
				System.out.print("*");
			}
		System.out.println(); // creates line 2 of box
		
		for (int j=0; j<boxHeight-2;j++) {
			System.out.print("*"); // prints the left wall of the box
			for (int i=0; i<boxWidth-2;i++) {
				System.out.print(" "); // fills middle of box with empty space
			}
			System.out.println("*"); // creates right side of wall
		}
		for (int i = 0; i < boxWidth; i++) {
			System.out.print("*");// creates bottom line of box
		}
		// exit gracefully
		System.exit(0);	
	}
}
