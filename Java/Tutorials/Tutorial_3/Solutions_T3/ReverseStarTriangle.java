/* Author: Fintan Costello & Alex Cronin
 * Description: This program requests the user specify the size of a triangle. A triangle of the following specifications is
 * generate using '*' symbols. The top line of the triangle has the number of stars specified by the user in it . Each
 * consecutive line has one star lessin it, the bottom line of the triangle is composed of one star.
 */
import javax.swing.JOptionPane;             //import JOptionPane class

public class  ReverseStarTriangle{                 //class declaration
    public static void main(String[] args){ //main method

        String stringSize;                  //declares string variable 'stringSize' to store user input regarding size of the triangle
        int size;                           //declares int variable 'size' to store the 'size' of the size of the triangle
        //prompts user for the size of the triangle and stores it in the String variable 'stringSize'
        stringSize=JOptionPane.showInputDialog(null,"Please Enter Triangle Size: ");
        size=Integer.parseInt(stringSize);  //parses the string variable 'stringSize to int and store it the int variable 'size'
        for (int i=size; i>0; i--){         //loops 'size' times: once for each value of i from 'size' to strictly greater than 0
		    for(int j=i; j>0; j--){         //loops 'i'+1 times: once for each value of j from 'i' to greater than 0
		        System.out.print("*");      //prints a '*' to the screen
		    }
		    System.out.println();           //generates a new line
	    }
    }
}


