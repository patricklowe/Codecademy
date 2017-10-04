/*
 * Author: Patrick Löwe
 * Creates a new object of BankAccount called myFirstAccount which is initialized with 5k
 * The program then withdraws 200 and will display a message box with the current account balance
 */
import javax.swing.JOptionPane; // import JOptionPane

public class FixedStartingBalanceBankAccount {// class declaration

	public static void main(String[] args) {// main method
	
		double initialBalance = 5000; // initial balance of account
		double withdrawal = 200; // withdrawal amount
		
		// create a new instance of BankAccount with an initial balance of 5k
		BankAccount myFirstAccount = new BankAccount(initialBalance);
		
		// Withdraw the set amount
		myFirstAccount.withdraw(withdrawal);
		
		//Display a message with account balance
		JOptionPane.showMessageDialog(null, "myFirstAccount contains: " + myFirstAccount.getBalance());
		
		//Exit the program gracefully
		System.exit(0);
		
	}

}
