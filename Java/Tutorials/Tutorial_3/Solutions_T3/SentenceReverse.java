/**
 * Author: Fintan Costello & Alex Cronin
 * Description: The user is repeatedly invited to enter a word into a JOptionPane InputDialog until they enter a word of
 * length 0. A JOptionPane MessageDialog outputs a sentence containing the words in the entered order and another MessageDialog
 * outputs a sentence containing the words in reverse order.
 */

import javax.swing.JOptionPane;     //import JOptionPane

public class SentenceReverse {      //class declaration

    public static void main(String[] args){
        //initialize a String variable 'sentence' to an empty String. This will hold the sentence in the correct order.
        String sentence = "";
        //initialize a String variable 'reverseSentence' to an empty String. This will hold the sentence in the reverse order.
        String reverseSentence = "";
       	String word;    //Declare a String variable 'word' to store each 'word' entered by the user in the JOptionPane
        do {            //start do loop
            word=JOptionPane.showInputDialog(null, "enter a word"); //request user input and store it in the String variable 'word'
            //build a sentence in the correct order by concatenating the user entered 'word' to the end of a sentence stored in memory
            sentence = sentence + " "+word;
            //build a sentence in reverse correct order by concatenating the user entered 'word' to the beginning of a sentence stored in memory
            reverseSentence = word + " "+reverseSentence;
		} while (word.length()>0);                              //exit the while loop if the entered 'word' is of length 0
		JOptionPane.showMessageDialog(null, sentence);          //output the sentence in the correct order to the user using a JOptionPane MessageDialog box
		JOptionPane.showMessageDialog(null, reverseSentence);   //output the sentence in the reverse order to the user using a JOptionPane MessageDialog box
 	    System.exit (0) ;                                       //exit the programing successfully
    }
}
