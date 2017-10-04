import java.util.ArrayList;

import javax.swing.JOptionPane;

public class PrintAllProperties {
	PrintAllProperties(){}

	// supplied printproperties method with arrays
	public  void PrintProperties(ArrayList<Apartment> apartments, ArrayList<House> houses, ArrayList<Villa> villas){
		for(int i = 0; i < apartments.size(); i++) // prints details of each apartment
			JOptionPane.showMessageDialog(null,"Register Number: "+apartments.get(i).getRegisterNumber()+"\nOwner: "+apartments.get(i).getOwner()+"\nAddress: "+apartments.get(i).getPostalAddress()+"\nTotal Renting Days: "+apartments.get(i).getTotalRentalDays()+"\nCost per Day: $"+apartments.get(i).getRentalCostPerDay()+"\nFloor Number: "+apartments.get(i).getStoreyNumber()+"\nBeds: "+apartments.get(i).getBedsNumber());
		
		for(int i = 0; i < houses.size(); i++)//prints details of each house
			JOptionPane.showMessageDialog(null,"Register Number: "+houses.get(i).getRegisterNumber()+"\nOwner: "+houses.get(i).getOwner()+"\nAddress: "+houses.get(i).getPostalAddress()+"\nTotal Renting Days: "+houses.get(i).getTotalRentalDays()+"\nCost per Day: $"+houses.get(i).getRentalCostPerDay()+"\nNum of Floors: "+houses.get(i).getTotalNumberStoreys()+"\nClearing Fee: "+houses.get(i).getClearingFees());

		for(int i = 0; i < villas.size(); i++)// prints details of each villa
			JOptionPane.showMessageDialog(null,"Register Number: "+villas.get(i).getRegisterNumber()+"\nOwner: "+villas.get(i).getOwner()+"\nAddress: "+villas.get(i).getPostalAddress()+"\nTotal Renting Days: "+villas.get(i).getTotalRentalDays()+"\nCost per Day: $"+villas.get(i).getRentalCostPerDay()+"\nNum of Rooms: "+villas.get(i).getNumberOfRooms()+"\nRoom Service Fee: "+villas.get(i).getRoomServiceCostPerDay()+"\nDaily Tax: "+villas.get(i).getTaxPerDay());
	}
}