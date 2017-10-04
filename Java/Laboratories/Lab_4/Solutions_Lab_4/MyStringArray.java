/**
 * Author: Alex Cronin & Fintan Costello
 * Description: This program reads in 5 names from the user into an array using JOptionPanes 
 * and outputs those names in the order they were input.
 */

import javax.swing.JOptionPane;

public class MyStringArray {

    public static void main(String[] args) {

        //Declare the names array
        String[] names;
        names = new String[5];
        //for loop to populate the array with names entered by the user
        //iterate for the length of the array
        for (int i = 0; i < names.length; i++) {
            //request a name from the user with a JOptionPane and store the name as the ith element of the array
            names[i] = JOptionPane.showInputDialog(null, "Enter name " + i);
        }
        //for each element of the names array
        for (int i = 0; i < names.length; i++) {
            //output the name using a JOptionPane
            JOptionPane.showMessageDialog(null, "Box " + i + " of the names array contains: " + names[i]);
        }
        //Terminate the currently running Java Virtual Machine
        System.exit(0);
    }
}
