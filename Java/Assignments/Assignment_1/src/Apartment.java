public class Apartment extends Property{ // class that contains the variables from Property combined with below
		int floorNum; // variable for floor number apartment is on
		int bedNum; // number of beds
	
	public Apartment(int FloorNumber, int Beds, int RentalCostDaily, int TotalRentDays, String Owner, String Address) {
		super(RentalCostDaily,TotalRentDays,Owner,Address);
		this.floorNum = FloorNumber; // stores the supplied Floor number from user entry into Apartments floorNum
        this.bedNum = Beds; // Stores supplied number of beds into this bedNum
    }
	
	public int getStoreyNumber(){ // method for getting the number of floors
		return floorNum;
	}
	public int getBedsNumber(){ // method for getting the number of beds
		return bedNum;
	}

}
