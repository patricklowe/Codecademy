import javax.swing.JOptionPane;

/*
 * Author: Patrick Löwe
 */
public class OptionalStartingBalanceBankAccount { //class declaration

	public static void main(String[] args) { // main method of OptionalStartingBalanceBankAccount
		// Capture starting balance as String
		String stringBalance = JOptionPane.showInputDialog(null, "Enter Initial Balance: ");
		double testBalance = Double.parseDouble(stringBalance); // Convert string to Double

		// Create new object of class BankAccount called myTestAccount with the converted string as balance
		BankAccount myTestAccount = new BankAccount(testBalance); 
		
		// Capture withdrawal amount as string
		String stringWithdrawal = JOptionPane.showInputDialog(null, "Enter Withdrawal Amount: ");
		// Convert withdrawal from string to Double
		double testWithdrawal = Double.parseDouble(stringWithdrawal);
		
		// Withdraw that amount from myTestAccount
		myTestAccount.withdraw(testWithdrawal);
		
		// Display message with new account balance
		JOptionPane.showMessageDialog(null, "myTestAccount now contains: " + myTestAccount.getBalance());
		
		// Exit system gracefully
		System.exit(0);
	}

}
