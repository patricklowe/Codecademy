/* 
 * Author: Patrick Löwe
 * Program will capture words until entry is blank
 * Then display message box with sentence and reversed sentence
 */
import javax.swing.JOptionPane;

public class SentenceReverse { // class declaration

	public static void main(String[] args) { // main method
		String mySentence = ""; // variable for correct sentence
		String myReverseSentence = ""; // variable for reversed sentence
		String myWord; // variable for each word input
		
		do { // loop until word length entry is 0
			// Capture the word, add it to end of previous words
			myWord = JOptionPane.showInputDialog(null, "Enter a Word: ");
			mySentence = mySentence + " " + myWord;
			
			// add word to beginning of previous words, creating a reverse order
			myReverseSentence = myWord + " " + myReverseSentence;
			
		} while (myWord.length() != 0); // loop until entry is null
		
		// display message with correct and reverse sentence
		JOptionPane.showMessageDialog(null, mySentence);
		JOptionPane.showMessageDialog(null, myReverseSentence);
		
		// exit gracefully
		System.exit(0);
	}

}
