/*
 * Author: Patrick Löwe
 * This class will request a word
 * Then calculate & print the length of the word
 */

// import library for jOption pane
import javax.swing.JOptionPane;

public class WordLength {

	public static void main(String[] args) {
		// variable for user input
		String MyWord;
		// capture the user input & store in variable
		MyWord = JOptionPane.showInputDialog(null, "What's your word?");
		// calculate and display the word length
		JOptionPane.showMessageDialog(null, "The word " + MyWord + " has " + MyWord.length() + " letters.");
		// exit the program with a 'normal' status
		System.exit(0);
	}

}
