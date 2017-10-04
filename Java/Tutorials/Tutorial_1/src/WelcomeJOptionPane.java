
/*
 * Author: Patrick Löwe
 * This class will request the users name 
 * then print a welcome message with the provided name
 */
import javax.swing.JOptionPane;

public class WelcomeJOptionPane {

	public static void main(String[] args) {
		String name;
		name = JOptionPane.showInputDialog(null, "What's your name?");
		JOptionPane.showMessageDialog(null, "Welcome, " + name + ", to the world of Java");
		System.exit(0);
	}

}
