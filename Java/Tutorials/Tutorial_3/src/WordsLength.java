import javax.swing.JOptionPane;

/*
 * Author: Patrick Löwe
 * Program with loop through a message box to gather words from user
 * Then display a message box with the total number of characters of all words
 */
public class WordsLength { // class declaration

	public static void main(String[] args) { // main method in class
		String inputWord; // variable for each word input
		int wordLength; // length of word input
		int total = 0; // total length of all words entered
		
		do{ // do loop will execute until nothing is entered
			// Capture user word
			inputWord = JOptionPane.showInputDialog(null, "Enter a Word: "); 
			// Get length of word entered
			wordLength = inputWord.length();
			// add length of word to total words
			total += wordLength;
		} while (wordLength != 0); // terminate once string length is 0
		
		// Display message with total number of characters
		JOptionPane.showMessageDialog(null, "Total length of words entered: " + total);
		
		// exit system gracefully
		System.exit(0);
	}

}
