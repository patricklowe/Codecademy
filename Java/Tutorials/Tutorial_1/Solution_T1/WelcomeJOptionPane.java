/* Author: Alex Cronin
 * Description: In this program we prompt the user to enter their name using a JOptionPane InputDialog Box,
 * and then notify the user of their name using a JOptionPane ShowMessageDialog Box.
 */

import javax.swing.JOptionPane;  // this must be imported if we use the JOptionPane class

public class WelcomeJOptionPane
{
	public static void main(String[] args)
	{	
		String name;// String variable declare to hold the name.
        // prompt the user to enter their name. The "null" refers to the parent component, in this case
        // there isn't any, there is just the dialogue box itself 
		name= JOptionPane.showInputDialog(null, "What's your name?");			
        //output a greeting message which is concatenated  sing '+'
		JOptionPane.showMessageDialog(null, "Welcome " + name + " to the world of Java");
        //Terminates the currently running JVM. By convention, a nonzero status code indicates abnormal termination.
        System.exit(0);
	}
}
