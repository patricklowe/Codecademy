/**
 * Author: Fintan Costello & Alex Cronin
 * Description: The name of the user is requested, if the name matches the name stored in
 * memory then a welcome message is issued. If it does not then a secret is requested from
 * the user and an appropriate message issued depending on the length of the secret.
 */

import javax.swing.JOptionPane; //import JOptionPane class for use in this program

public class MySecret{

    public static void main(String[] args){
        String programmerName = "Fintan";   //a String variable is declared and assigned a value
        String userName;                    //a String variable is declared to store the users name
        //the users name is requested using a JOptionPane and is stored in userName
        userName = JOptionPane.showInputDialog(null,"What's your name?");
        if ( !userName.equalsIgnoreCase(programmerName) ){ // if the entered name is not equal to the programmers name
	        JOptionPane.showMessageDialog(null,"Hello "+userName+", nice to meet you.");//output a greeting message
	    }
        else{
	        String secret; //a variable of class String is declared to store the secret
            //a JOptionPane is used to address the user and request a secret. The secret is stored in the String variable "secret".
	        secret = JOptionPane.showInputDialog(null,"Hi "+userName+"!  Tell me a secret.");
	        if ( secret.length() < 20){//if the length of the secret is less than 20 characters
   	        JOptionPane.showMessageDialog(null,"That's not much of a secret!"); //output a message using a JOptionPane
	        }
	        else{ // else (i.e. if the length of the message is euqual or greater than 20 character in length
	            JOptionPane.showMessageDialog(null,"That's a good secret! I'll never tell."); // output a message using a JOptionPane
	        }
	    }
        System.exit(0);
    }
}