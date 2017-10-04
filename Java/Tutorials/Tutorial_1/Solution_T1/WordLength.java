/*
 * Author: Alex Cronin
 * Description: In this program we prompt the user to enter a word using a JOptionPane InputDialog Box,
 * calculate the length of the word  and then notify the user of the length of the word using a
 * JOptionPane ShowMessageDialog Box.
 */

import javax.swing.JOptionPane;    // this must be imported if we use the JOptionPane class

public class  WordLength{
   public static void main(String[] args){
        // declare a String variable called myWord which will store the entered word
        String myWord;
        // get word from the user using the showInputDialog box and store it in the variable myWord
        myWord = JOptionPane.showInputDialog(null,"Enter a word:");
        //declare the int variable wordLength and assign is value to be the length of the word
        int wordLength = myWord.length();
        //generate a message which includes the length of the word and store it in the String variable message
        String message = "There are "+wordLength+" letters in "+myWord;
        //output the message to the user via a showMessageDialogue Box
        JOptionPane.showMessageDialog(null, message);
        //Terminate the current Java Virtual Machine with status code 0 (meaning "normal" status)
        System.exit(0);
   }
}
