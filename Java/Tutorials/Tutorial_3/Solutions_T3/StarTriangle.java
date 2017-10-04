/* Author: Fintan Costello & Alex Cronin
 * Description: This program requests the user specify the size of a triangle. A triangle of the following specifications is
 * generate using '*' symbols. The top line of the triangle has one star in it . Each consecutive line has an additional
 * '*' in it, the bottom line of the triangle is composed of the number of stars entered by the user.
 */
import javax.swing.JOptionPane;             //import JOptionPane class

public class  StarTriangle{                 //class declaration
    public static void main(String[] args){ //main method

        String stringSize;                  //declares string variable 'stringSize' to store user input regarding size of the triangle
        int size;                           //declares int variable 'size' to store the 'size' of the size of the triangle
        //prompts user for the size of the triangle and stores it in the String variable 'stringSize'
        stringSize=JOptionPane.showInputDialog(null,"Please Enter Triangle Size: ");
        size=Integer.parseInt(stringSize);  //parses the string variable 'stringSize to int and store it the int variable 'size'
        for (int i=0; i<size; i++){         //loops 'size' times: once for each value of i from 0 to strictly less than 'size'
		    for(int j=0; j<=i; j++){        //loops 'i'+1 times: once for each value of j from 0 to less than or equal to 'i'
		        System.out.print("*");      //prints a '*' to the screen
		    }
		    System.out.println();           //generates a new line
	    }
    }
}




