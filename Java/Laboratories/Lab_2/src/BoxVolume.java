import javax.swing.JOptionPane;

/*
 * Author: Patrick Löwe
 * Program to calculate the volume of a box
 * Given length, width, and height
 */
public class BoxVolume { // Class declaration

	public static void main(String[] args) { // main method
		// Capture L, W, & H in strings from user input
		String input_Length = JOptionPane.showInputDialog("Enter Length in metres: ");
		String input_Width = JOptionPane.showInputDialog("Enter Width in metres: ");
		String input_Height = JOptionPane.showInputDialog("Enter Height in metres: ");
		
		// convert strings into type Double
		double box_Length = Double.parseDouble(input_Length);
		double box_Width = Double.parseDouble(input_Width);
		double box_Height = Double.parseDouble(input_Height);
		
		// calculate the area by multiplying the 3 variables
		double box_Volume = box_Length * box_Height * box_Width;
		
		// display a message showing the variables entered, and the calculated area
		JOptionPane.showMessageDialog(null, "A box of width " + input_Width + "m, length " + input_Length + "M, and height " + input_Height + "M has a volume of " + box_Volume + "M cubed");
		
		//exit gracefully
		System.exit(0);
	}

}
