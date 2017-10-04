import java.util.ArrayList;

import javax.swing.JOptionPane;

public class CalculateTotalIncome{
	CalculateTotalIncome(){
	}
	
	public void CalculateTotallIncome(ArrayList<Apartment> apartments, ArrayList<House> houses, ArrayList<Villa> villas ){ // funciton to calculate the total income for array Apartment, House, and Villa
		int apartmentIncome = 0; // stores total income from all Apartments
		int totalIncome = 0;// stores total income from all properties
    	int houseIncome = 0;// stores total income from all houses
    	int villaIncome = 0;// stores total income from all villas
		
        for(int i = 0; i < apartments.size(); i++) { // calculates income for apartment(i) and adds it onto total for apartments
        	apartmentIncome += apartments.get(i).getTotalRentalDays() * apartments.get(i).getRentalCostPerDay();
        }
        
        for(int i = 0; i < houses.size(); i++) { // Calculates the total income for houses
        	houseIncome += houses.get(i).getTotalRentalDays() * houses.get(i).getRentalCostPerDay()+houses.get(i).getClearingFees();
        }
        
        for(int i = 0; i < villas.size(); i++){ // calculates the total income for villas, including the cost per day, tax, and num of days
        	villaIncome += (villas.get(i).getTotalRentalDays() + villas.get(i).getRoomServiceCostPerDay() + villas.get(i).getTaxPerDay()) * villas.get(i).getRentalCostPerDay();
        }
        
        totalIncome = apartmentIncome + houseIncome + villaIncome; // gets total income from all properties
        // shows a message with total income for each property type, then all properties
        JOptionPane.showMessageDialog(null, "Apartment Total: $"+ apartmentIncome +"\nHouse Total: $"+ houseIncome +"\nVilla Total: $"+ villaIncome +"\nOverall Total: $" + totalIncome);
     }
}