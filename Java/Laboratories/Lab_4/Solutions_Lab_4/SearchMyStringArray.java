/**
 * Author: Alex Cronin & Fintan Costello
 * Description: This program reads in 5 names from the user into an array using JOptionPanes.
 * The user is then invited to search the array for a name. If the name is found the location of
 * the name in the array is output.
 */

import javax.swing.JOptionPane;

public class SearchMyStringArray {
    public static void main(String[] args) {

        //Declare the names array
        String[] names;
        names = new String[5];

        //for loop to populate the array with names entered by the user
        //iterate for the length of the array
        for (int i = 0; i < names.length; i++) {
            names[i] = JOptionPane.showInputDialog(null, "enter name " + i);
        }

        String searchname; // declare a String variable to hold the name we are looking for
        //request the name we are looking for from the user using a JOptionPane and store it in the variable
        searchname = JOptionPane.showInputDialog(null, "enter name to look for:");
        //for each element of the names array
        for (int i = 0; i < names.length; i++) {
            //see if the name we are looking for is equal to the name in location i
            if (searchname.equals(names[i])) {
                //if it is equal then output the location in the names array where it was found
                JOptionPane.showMessageDialog(null, searchname + " was found in box " + i + " in the array");
            }
        }
        //Terminate the currently running Java Virtual Machine
        System.exit(0);
    }
}

