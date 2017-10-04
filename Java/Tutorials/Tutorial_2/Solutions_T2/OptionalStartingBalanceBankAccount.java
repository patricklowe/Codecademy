/*
 * Author: Fintan Costello & Alex Cronin
 * Description: This program uses a double variable to store the balance of a bank
 * account. The user sets, update and reports the balance through JOptionPanes.
 */

import javax.swing.JOptionPane;

public class OptionalStartingBalanceBankAccount{    //class declaration
   public static void main(String[] args){          //main method

    // set up the variables to be used in input.  The string variables take input from the
    // JOptionPane InputDialogs, and these are then converted (parsed) into doubles.
	double initialBalance;
	String initialBalanceString;
	double withdrawal;
	String withdrawalString;

    // the convert each into a double and put in the correct variable.
	initialBalanceString = JOptionPane.showInputDialog(null, "Enter initial balance:");
	initialBalance = Double.parseDouble(initialBalanceString);
    BankAccount myTestAccount = new BankAccount(initialBalance);
	withdrawalString = JOptionPane.showInputDialog(null, "Enter amount to withdraw:");
	withdrawal = Double.parseDouble(withdrawalString);
 
    // call the withdraw method in the myTestAccount:
    myTestAccount.withdraw(withdrawal);

	JOptionPane.showMessageDialog(null,"After that withdrawal, myTestAccount contains :"+myTestAccount.getBalance() );

    // exit the program correctly.
	System.exit(0);
   }
}