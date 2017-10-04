import javax.swing.JOptionPane;

/*
 * Author: Patrick L�we
 * Program to read in 5 strings from user
 * then display each name
*/
class Person{
	public String user_Name;
	
	public Person(String n){
		user_Name = n;
	}
	
	public String getDetails() {
		return user_Name;
	}
}

public class MyStringArray { // class declaration

	public static void main(String[] args) { // main method
		Person[] userList = new Person[5];
		
		String input_Name;
		for(int i = 0; i < userList.length; i++) {
			input_Name = JOptionPane.showInputDialog(null,"Enter Name: ");
			userList[i] = new Person(input_Name);
		}
		
		for(int i=0; i<userList.length;i++) {
			JOptionPane.showMessageDialog(null,"Box["+i+"] containts: " + userList[i].getDetails());
		}
	System.exit(0);
	}
}