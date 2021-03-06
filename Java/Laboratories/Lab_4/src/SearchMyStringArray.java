import javax.swing.JOptionPane;

/*
 * Author: Patrick L�we
 * Program to get 5 names and store in array
 * Then search based on name requirement
 */
class Persons{
	public String user_Name;
	
	public Persons(String n) {
		user_Name = n;
	}
	
	public String getDetails() {
		return user_Name;
	}
}

public class SearchMyStringArray { // class declaration

	public static void main(String[] args) { // main method
		Persons[] listPeople = new Persons[5];
		
		String input_Name;
		for(int i=0;i<listPeople.length;i++) {
			input_Name = JOptionPane.showInputDialog(null,"Enter name: ");
			input_Name = input_Name.toLowerCase();
			listPeople[i] = new Persons(input_Name);
		}
		
		String searchName = JOptionPane.showInputDialog("Enter Search Name: ");
		searchName = searchName.toLowerCase();
		for(int i=0;i<listPeople.length;i++) {
			if(searchName.equals(listPeople[i].getDetails())) {
				JOptionPane.showMessageDialog(null,searchName + " was found in box: " + i);
			}// end of if
		}// end of for
		System.exit(0);
	}// end of main method

}//end of class
