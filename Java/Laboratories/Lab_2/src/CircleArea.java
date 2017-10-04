import javax.swing.JOptionPane;

/*
 * Author: Patrick Löwe
 * Program to calculate radius from input
 */
public class CircleArea { // class declaration

	public static void main(String[] args) { // main method
		// store user input in string
		String radius_Input = (JOptionPane.showInputDialog("Enter circle radius: "));
		// variable for converting string above into type double
		double radius_dbl = Double.parseDouble(radius_Input);
		// variable for value of PI
		double PI = 3.1416;
		// variable for area
		double area = (radius_dbl * radius_dbl) * PI;
		
		//display message with initial value & results
		JOptionPane.showMessageDialog(null, "Circle of Radius: " + radius_dbl + " has area: " + area);
		// exit system gracefully
		System.exit(0);
	}

}
