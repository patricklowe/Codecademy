import javax.swing.JOptionPane;

/*
 * Author: Patrick Löwe
 */
public class MySecret {// class declaration

	public static void main(String[] args) { //main method
		// capture users name
		String user_Name = JOptionPane.showInputDialog("What is Your Name: ");
		String programmer_Name = "Patrick";
		
		// see if user and programmer have same name
		if(user_Name.equalsIgnoreCase(programmer_Name)) {
			String user_Secret = JOptionPane.showInputDialog("Hi "+user_Name+"! Tell me a secret");
			if(user_Secret.length() < 20) {
				JOptionPane.showMessageDialog(null, "That is not much of a secret");
			}// small secret
			else {
				JOptionPane.showMessageDialog(null, "That is a great secret! I'll never tell");
			}// big secret
		}// Same Names
		else {
			JOptionPane.showMessageDialog(null, "Hello "+user_Name+", nice to meet you.");
		}// Different Names
		System.exit(0);
	}

}
