/**
 * Author: Fintan Costello & Alex Cronin
 * Description: In this program the user is prompted to enter the width length and height
 * of a box using JOptionPane InputDialog boxes. Values are entered as strings and converted
 * (parsed)into doubles. They are then multiplied together to calculate the volume and the 
 * result is output to the user using a JOptionPane MessageDialog box.
 */

import javax.swing.JOptionPane;

public class BoxVolume {

    public static void main(String[] args) {
        // set up the variables to be used in input.  The string variables take input from the
        // JOptionPane InputDialogs, and these are then converted (parsed) into doubles.
        double width;
        double length;
        double height;
        String widthString;
        String lengthString;
        String heightString;

        // use JOptionPanes to get the input strings for width, length and height, and
        // the convert each into a double and put in the correct variable.
        widthString = JOptionPane.showInputDialog(null, "Enter box width (in metres):");
        width = Double.parseDouble(widthString);
        lengthString = JOptionPane.showInputDialog(null, "Enter box length (in metres):");
        length = Double.parseDouble(lengthString);
        heightString = JOptionPane.showInputDialog(null, "Enter box height(in metres):");
        height = Double.parseDouble(heightString);

        // work out the volume by multiplying the three inputs.
        double volume = width * length * height;

        // make the output message and put it in a string variable outputString and the use that variable
        // in the MessageDialog.
        String outputString;
        outputString = "A box of width " + width + " metres, length " + length + " metres, and height " + height + " metres has a volume of " + volume + " metres cubed.";
        JOptionPane.showMessageDialog(null, outputString);

        // exit the program correctly.
        System.exit(0);
    }
}
