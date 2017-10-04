import javax.swing.JOptionPane;

/*
 * Author: Patrick L�we
 */
class Person{ // Start of Person Class
	public String name; // variable for persons name
	public int age; //variable for persons age
	
	public Person(String n, int a) { // Initializing each individual person
		name = n; // store the user input of their name (n) in the public string 'name'
		age = a; // store the user input of their age (a) in the public int 'age'
	}
	
	public String getDetails() { //returns the specified users name and age in a single string
		return name + " ("+age+").";
	}
}// End of Person Class

public class StorePeople2 { // Start of StorePeople Class

	public static void main(String[] args) { // Main Method
		Person[] personList = new Person[5]; //create a list of 5 new people
		
		String input_Name; // store input for users name
		String input_Age; // store input for users name in string
		int int_Age; // variable for converted string age into integer age
		
		for(int i=0; i < personList.length;i++) { // loop for all people (5)
			input_Name = JOptionPane.showInputDialog("Enter Name: "); // capture user input for name
			input_Age = JOptionPane.showInputDialog("Enter Age: "); // capture user input for age
			int_Age = Integer.parseInt(input_Age); //convert string age into integer age
			personList[i] = new Person(input_Name, int_Age); // store captured data into personList, using the Person blueprint
		}// loop
		
		String input_Age_Number = JOptionPane.showInputDialog(null,"Enter age requirement"); // get age limit from user
		int age_Number = Integer.parseInt(input_Age_Number); // convert to Integer
		
		for(int i = 0; i < personList.length; i++) { // display each person details loop
			if(personList[i].age <= age_Number) { // if the current person age is <= the requirement then display message
			JOptionPane.showMessageDialog(null, personList[i].getDetails()); // message box for person meeting criteria
			} // end of if
		}// end of for loop
		// exit system gracefully
		System.exit(0);
	}// end of Main Method

} // End of StorePeople Class