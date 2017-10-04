public class Villa extends Property{ // Villa Property that contains Property structure as well as the below
	int Rooms; // rooms in the villa
	int RoomServiceCostDaily; // Daily cost of Room Service
	int TaxDaily; // daily tax
	
    public Villa(int NumRooms, int RoomServiceCost, int DailyTax, int RentalCostDaily, int TotalRentDays, String Owner, String PostalAddress) {
		super(RentalCostDaily,TotalRentDays,Owner,PostalAddress);
		this.Rooms = NumRooms; // supplied number of rooms to be stored in Villa's version
        this.RoomServiceCostDaily = RoomServiceCost;// supplied cost of Room Service to be stored
        this.TaxDaily = DailyTax; // supplied daily tax to be stored
    }

	public int getNumberOfRooms(){ // method to return number of rooms in current villa
		return Rooms;
	}
	
	public int getRoomServiceCostPerDay(){ // method to return cost of Room Service per day
		return RoomServiceCostDaily;
	}
	
	public int getTaxPerDay(){ // method to return Daily tax
		return TaxDaily;
	}
}