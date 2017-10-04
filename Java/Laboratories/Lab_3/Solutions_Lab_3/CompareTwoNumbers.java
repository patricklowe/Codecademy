/*
 * Author: Fintan Costello & Alex Cronin
 * Description: The program request two numbers from the user using JOptionPanes,
 * compares the numbers and output a message to the user indicating the numbers
 * are equal or that one number is less than the other number.
 */

import javax.swing.JOptionPane; //import JOptionPane

public class CompareTwoNumbers
{
	public static void main(String[] args)
	{	
		String first, second;   //Declare two String variables to store the value input to JOptionPanes
        int num1, num2;         //Declare two variable of type int to store the 2 numbers

        //request two number from the user using JOptionPanes and store then in String variables
		first= JOptionPane.showInputDialog(null, "Enter the first number:");
		second= JOptionPane.showInputDialog(null, "Enter the second number:");
		
		// parse String values to ints
		num1=Integer.parseInt(first);
		num2=Integer.parseInt(second);

		if(num1 < num2){ //if the first number is less than the second number
			JOptionPane.showMessageDialog(null, "The first number " + first + " is less than second number " + second);
		}	
		if(num2 < num1){ //if the first number is greater than the second number
			JOptionPane.showMessageDialog(null, "The second number " + second + " is less than first number " + first);
		}
		if(num1 == num2){ 	//if the first and second numbers are equal
			JOptionPane.showMessageDialog(null, "The two numbers you entered are equal");
		}			
		System.exit(0);	 //terminates the program
	}
}
	