/**
 * Author: Alex Cronin
 * Description: This program can calculate the area of a circle, rectangle or triangle.
 * The user is asked which shape they would like to calculate the area of.
 * They are then asked to enter 1 to 2 measurements which will be used by the program to complete this
 * task. If any measurement is less than 0 an error message will be output. If both
 * measurements are greater than or equal to 0 then the area of the shape is calculated
 * and output to the user.
*/

import javax.swing.JOptionPane;             //import JOptionPane class

public class CircleRectangleTriangleArea    //class declaration
{
    public static void main(String[] args)  //main method
	{
		final double PI = 3.14159 ;         //set value of PI
        double area;
		String shape = JOptionPane.showInputDialog(null, "Do you wish to calculate the area of a circle, rectangle or triangle" );//request shape from the user

        if ("circle".equalsIgnoreCase(shape)){                                                                         //check to see if "shape" String input equals to "circle"
            String stringRadius = JOptionPane.showInputDialog(null, "Enter radius value:" );                 //use JOptionPane to request radius from the user and assign it to String variable "stringRadius"
            double doubleRadius = Double.parseDouble(stringRadius);                                          //parse "stringRadius" to "doubleRadius"
            if (doubleRadius < 0){                                                                           //check if radius is less than zero
                JOptionPane.showMessageDialog(null, " Radius value less than zero: cannot compute circle area " );	//use JOptionPane to output error message
            }
            else{
                area = PI * doubleRadius * doubleRadius;                                                            //area of a circle is pi * radius * radius. Store answer in double variable 'area'
                JOptionPane.showMessageDialog(null, " A circle of radius " + doubleRadius + " has an area of " + area); // use JOptionPane to output circle area
            }
        }
        else if("rectangle".equalsIgnoreCase(shape)){                                                                  //check to see if "shape" String input equals to "rectangle"
            String stringWidth = JOptionPane.showInputDialog(null, "Enter the width of the rectangle:" );    //request width
            String stringHeight = JOptionPane.showInputDialog(null, "Enter the height of the rectangle:" );  //request height
            double width = Double.parseDouble(stringWidth);                                                  //parse string to double
            double height = Double.parseDouble(stringHeight);                                                //parse string to double
            if ((width < 0) || (height < 0)){                                                                //check if either input is less than zero
                JOptionPane.showMessageDialog(null, " Side less than zero: cannot compute rectangle area "); //output error message
            }
            else {
                area = width * height;                                                                       // area of a rectangle is width * height.
                JOptionPane.showMessageDialog(null, " A rectangle of width " + width + " and height " + height +  " has an area of " + area);//use JOptionPane to output rectangle area
            }
        }
        else if ("triangle".equalsIgnoreCase(shape) ){                                                                 //check to see if "shape" String input equals to "triangle"
            String stringBase = JOptionPane.showInputDialog(null, "Enter base of triangle:" );               //use JOptionPane to request input
            String stringHeight = JOptionPane.showInputDialog(null, "Enter perpendicular height of triangle:" );//use JOptionPane to request input
            double base = Double.parseDouble(stringBase);                                                    //parse string to double
            double height = Double.parseDouble(stringHeight);                                                //parse string to double
            if ((base < 0) || (height < 0)){// check if either parameter is less than zero                   //check if either input is less than zero
                JOptionPane.showMessageDialog(null, " Base or perpendicular height is less than zero: cannot compute triangle area ");//output error message
            }
            else{
                area  = base/2 * height;                                                                     // area of a triangle is half the base length * the perpendicular height
                JOptionPane.showMessageDialog(null, " A triangle of base " + base + "and perpendicular height " + height +  " has an area of " + area );// use JOptionPane to output value of triangle area
            }
        }
        else{ //else i.e. if its not a circle or a rectangle or a triangle
            JOptionPane.showMessageDialog(null, " I don't recognise the shape " + shape + ": cannot work out the area" );//output error message
        }
        System.exit(0);
	}
}		
		
		
		