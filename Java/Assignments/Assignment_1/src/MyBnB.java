import java.util.ArrayList;
import javax.swing.JOptionPane;
/* Author Patrick L�we
 * Create a program to calculate the total income from a BnB Service*/

public class MyBnB { // main class declaration

	public static void main(String[] args) { // main method
    	CalculateTotalIncome CTI  = new CalculateTotalIncome(); // calculates the total income
    	PrintAllProperties pProperties = new PrintAllProperties(); // prints all properties to user
    	
    	ArrayList<Apartment> apartments = new ArrayList<Apartment>(); // array of apartments using Apartment Class structure
    	ArrayList<House> houses = new ArrayList<House>(); // array of houses using the House Class structure
    	ArrayList<Villa> villas = new ArrayList<Villa>(); // array of villas using Villa Class structure
    	
    	String strOption;
    	int pOption = 1; // allows the do loop to iterate at least once
    	
    	do { // will run until user enters 0 to exit
    	strOption = JOptionPane.showInputDialog("1. Fill in Property\n2. Print Property \n3. Total Income\n0. Exit\nOption: ");
    	pOption = Integer.parseInt(strOption); // converts input to Integer
    	
    	switch(pOption) {
    		case 1: FillInProperties(apartments, houses, villas); // Passes arrays to fillInProperties to be filled with data below
    				JOptionPane.showMessageDialog(null, "All properties have been automatically filled in from Hard Coded Data!");
    				break; // breaks out of Switch case, basically reloads main menu
    		case 2: pProperties.PrintProperties(apartments, houses, villas);
    				break;// breaks out of Switch case, basically reloads main menu
    		case 3: CTI.CalculateTotallIncome(apartments, houses,villas);
    				break;// breaks out of Switch case, basically reloads main menu
    		default:break; // breaks out of Switch case, basically reloads main menu
    	} // end of switch
    	} while(pOption != 0 ); // end of while
	}

	public static void FillInProperties(ArrayList<Apartment> apartments, ArrayList<House> houses, ArrayList<Villa> villas){
		RentProperty rProperties = new RentProperty(); // Rents each property 3 times over, to total 27
		
		// Data is automatically entered to speed up application use
		apartments.add(new Apartment(1,2,150,2,"Michael Cool","Parasail Island 3")); //First apartment Data
		apartments.add(new Apartment(2,3,85,8,"Johnny Cash","Somewhere 4")); // Second apartment Data
		apartments.add(new Apartment(2,4,115,3,"Jane Doe","Devil's place 3")); // third apartment data
		
		//data for houses
		houses.add(new House(1,50,50,2,"Michelle NotSoCool","Marsh 17")); 
		houses.add(new House(4,65,85,8,"Johnny Broke","Anywhere 164"));
		houses.add(new House(2,90,115,3,"John Doe","Angel Falls 3"));
		
		// data for villas
		villas.add(new Villa(1,15,50,65,3,"Luke Warm","Kitchen Sink 4"));
		villas.add(new Villa(4,25,115,180,4,"Dolly PardonMe","Nope Mansland"));
		villas.add(new Villa(3,20,65,130,5,"Susie Grante","Unknown 74"));
		
		// loads method for tripling renting period. totaling 27, instead of 9
		rProperties.Rent(apartments, houses, villas);
	} // end of fill in properties

}// end of Main Class