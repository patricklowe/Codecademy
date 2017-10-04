import java.util.ArrayList;

public class RentProperty {
		RentProperty(){}
		
		public void Rent(ArrayList<Apartment> apartments, ArrayList<House> houses, ArrayList<Villa> villas){
			int rentDays; // gets supplied renting days from current property, to be * 3 then assigned back in
			
			for(int i = 0; i < apartments.size(); i++) { // triple each total renting days for each apartment
				rentDays = apartments.get(i).getTotalRentalDays();
				rentDays = rentDays * 2; // doubles it
				apartments.get(i).totalRentalDays += rentDays; // adds it to original to give 3 * original value
			}
			// does the same as above for houses
			for(int i = 0; i < houses.size(); i++) { 
				rentDays = houses.get(i).getTotalRentalDays();
				rentDays = rentDays * 2;
				houses.get(i).totalRentalDays += rentDays;
			}
			// same as above for villas
			for(int i = 0; i < villas.size(); i++) {
				rentDays = villas.get(i).getTotalRentalDays();
				rentDays = rentDays * 2;
				villas.get(i).totalRentalDays += rentDays;
			}
		}// end of Rent method
}// end of RentProperty class