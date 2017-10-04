public class House extends Property{ // House class that contains all variables/structures from Property as well as the below
	int TotalNumberFloors; // Number of floors in the house
	int ClearingFees; // cost to clean house
	
    public House(int TotalNumberFloors, int ClearingFees, int RentalCostDaily, int TotalRentDays, String Owner, String PostalAddress) {
		super(RentalCostDaily,TotalRentDays, Owner,PostalAddress); // supplied values entered by user. Made automated to speed up testing
		this.TotalNumberFloors = TotalNumberFloors; // supplied number of floors is then stored in Houses' number of floors
        this.ClearingFees = ClearingFees; // supplied cleaning fee is stored here
    }
	
    public int getTotalNumberStoreys(){ // method to get the total number of Floors
		return TotalNumberFloors;
	}
	
    public int getClearingFees(){ // method to return the cost of clearing
		return ClearingFees;
	}
}