/**
 * Author: Fintan Costello & Alex Cronin
 * Description: The user is repeatedly invited to enter a word into a JOptionPane InputDialog box until they enter a word of
 * length 0. A JOptionPane MessageDialog outputs the total number of characters in the words they entered.
 */

import javax.swing.JOptionPane;//Import JOptionPane to make use of the dialog box that prompts or inform the user.

public class WordsLength {

    public static void main(String[] args){
        String word;    //Declare a String variable to store the word entered by the user
        int length;     //Declare an int variable to store the length of the word entered by the user
        int total=0;    //Declare and initialize to 0 an int variable to store the total length of all words entered
        do{
            word= JOptionPane.showInputDialog(null," Enter any word: ");    //Input Dialog box to prompt the user to enter a word
            length =word.length();                                          //calculate the length of the word entered and store it in 'length'
            //'total' holds the total value of the length of all words entered. Could have also used 'total=total+length;' but the former is a little shorter
            total+=length;
        }while (length!=0); //continue the loop while the length of the entered word is not 0
        //Output the total number of characters in the words
        JOptionPane.showMessageDialog(null,"The total number of characters in those words is "+ total+".",
        "WordsLength",JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);         //Exit the program successfully
    }
}


