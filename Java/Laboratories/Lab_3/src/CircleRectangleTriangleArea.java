import javax.swing.JOptionPane;

/*
 * Author: Patrick Löwe
 * Program to calculate area of triangle, rectangle, or circle
*/

public class CircleRectangleTriangleArea {

	public static void main(String[] args) {
		String input_Option = JOptionPane.showInputDialog("Circle, Rectangle, or Triangle: ");
		input_Option = input_Option.toLowerCase();
		
		if(input_Option.equals("circle")) {
			String input_Radius = JOptionPane.showInputDialog("Enter Circle Radius: ");
			double circle_Radius = Double.parseDouble(input_Radius);
			if(circle_Radius <= 0) {
				JOptionPane.showMessageDialog(null, "Radius < 0: Cannot Calculate");
			}// if radius < 0
			else {
				// variable for value of PI
				double PI = 3.1416;
				// variable for area
				double area = (circle_Radius * circle_Radius) * PI;
				JOptionPane.showMessageDialog(null, "Circle of Radius: " + circle_Radius + " has area: " + area);
			}// if radius > 0
		}
		
		
		else if (input_Option.equals("rectangle")){
			String input_Side1 = JOptionPane.showInputDialog("Enter Side 1: ");
			String input_Side2 = JOptionPane.showInputDialog("Enter Side 2: ");
			
			double dbl_Side1 = Double.parseDouble(input_Side1);
			double dbl_Side2 = Double.parseDouble(input_Side2);
			double rec_Area = dbl_Side1 * dbl_Side2;
			
			if(dbl_Side1 <= 0 || dbl_Side2 <= 0) {
				JOptionPane.showMessageDialog(null, "Cannot calculate with side length <=0");
			}
			else {
				JOptionPane.showMessageDialog(null, "Rectangle has area: "+rec_Area);
			}
		}
		
		
		else if (input_Option.equals("triangle")){
			String input_Base = JOptionPane.showInputDialog("Enter Base: ");
			String input_Height = JOptionPane.showInputDialog("Enter Perpendicular Height: ");
			
			double dbl_Base = Double.parseDouble(input_Base);
			double dbl_Height = Double.parseDouble(input_Height);
			double tri_Area = (dbl_Base/2) * dbl_Height;
			
			if(dbl_Base <= 0 || dbl_Height <= 0) {
				JOptionPane.showMessageDialog(null, "Cannot calculate with values <=0");
			}
			else {
				JOptionPane.showMessageDialog(null, "Triangle has area: "+tri_Area);
			}
		}
		
		
		else {
			JOptionPane.showMessageDialog(null, "Error");
		}
	}

}
