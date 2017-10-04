/*
 * Author: Fintan Costello & Alex Cronin
 * Description: The program request two numbers from the user using JOptionPanes
 * and then determines if one number is a factor of the other and outputs the 
 * result to the user
 */

import javax.swing.JOptionPane;  // import JOptionPane class

public class Factors{
   public static void main(String[] args){

	// set up the variables to be used in input.  The String variables take input from the
	// JOptionPane InputDialogs, and these are then converted (parsed) into ints.
	int x;
	int y;
	String xString;
	String yString;
	int lower;
	int higher;

	// use JOptionPanes to get the input strings for the two entered numbers and 
	// the convert each into an int and put in a variable.
	// students can use whatever message they like here...
	xString = JOptionPane.showInputDialog(null, "Enter a number:");
	x= Integer.parseInt(xString);
	yString = JOptionPane.showInputDialog(null, "Enter another number:");
	y= Integer.parseInt(yString);

	// An if to compare the two numbers and put the lesser in a variable called lower 
	// and the greater in a variable called higher.  There are various ways of doing
	// this if: any one that works is ok...

	if (x < y) {
	    lower = x;
	    higher = y;
	}
 	else {
	    lower = y;
	    higher = x;
	}

	// this if checks if the lower number is a factor of the higher number, and 
	// responds accordingly.  Again, there are different ways of organising this "if"
	// and any one that works is ok.  Students can use an outputString variable if they
	// want, but they don't have to
	if (higher % lower == 0){	// it is a factor
	    int factor = higher / lower;
	    String outputString;
	    outputString = lower+" is a factor of "+higher+" ("+lower+" goes into "+higher+" exactly "+factor+" times)";
	    JOptionPane.showMessageDialog(null,outputString);
	} 
	else { //it is not a factor
	    int factor = higher / lower;
	    int remainder = higher % lower;
	    String outputString;
	    outputString = lower+" is not a factor of "+higher+" ("+lower+" goes into "+higher+" a total of "+factor+" times, with "+remainder+" over)";
	    JOptionPane.showMessageDialog(null,outputString);
	}

	System.exit(0);
   }
}