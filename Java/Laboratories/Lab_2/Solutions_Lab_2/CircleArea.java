/**
 * Author: Fintan Costello & Alex Cronin
 * Description: In this program the user is prompted to enter the radius of a circle
 * of a box using JOptionPane InputDialog boxes. A value is entered as a String and converted
 * (parsed)into a double. The area is then calculated and the result is output to the user 
 * using a JOptionPane showMessageDialog box.
 */

import javax.swing.JOptionPane; // imported to allow the use of the JOptionPane class

public class CircleArea {

    public static void main(String[] args) {
        // set up the variables to be used in input.  The String variable takes input from the
        // JOptionPane InputDialog, and this is then converted (parsed) into a double.
        double radius;
        String radiusString;

        // use JOptionPanes to get the input strings for the radius of the circle
        // the convert it into a double and put in the double variable
        radiusString = JOptionPane.showInputDialog(null, "Enter circle radius:");
        radius = Double.parseDouble(radiusString);

        // work out the area by multiplying PI by the radius squared
        double area = 3.1416*radius*radius;
        // the following two lines are alternative which you could use. They are from the
        // Math class which is explained in the JAVA API
        //      double area = Math.PI*radius*radius;
        //      double area = Math.PI*Math.pow(radius,2);

        // use the MessageDialog to output the message to the user.
        JOptionPane.showMessageDialog(null, "Circle of radius "+radius+" has area "+area);

        // exit the program correctly.
        System.exit(0);
    }
}
