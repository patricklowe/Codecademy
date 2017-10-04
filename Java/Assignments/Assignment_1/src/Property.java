public class Property {
	// default or standard class for all properties
	static int reg_Counter; // total number of properties
	int regNum; // property register number
	String propOwner; // owner of property
	String propAddress; // property address
	int rentCostDaily; // cost per day of property
	int totalRentalDays; // days the property is being rented
	
    public Property( int RentalCostPerDay, int TotalRentalDays, String Owner, String PostalAddress) { // adds supplied data to Class
        this.regNum = reg_Counter++; // increment register for each property
		this.rentCostDaily = RentalCostPerDay;  //cost to rent daily
        this.totalRentalDays = TotalRentalDays; // total days rented
        this.propOwner = Owner; // owner of property
        this.propAddress = PostalAddress; // address of property
    }
	
    public int getRegisterNumber(){ // method to get register number of current property
		return regNum;
	}
	
    public int getTotalRentalDays(){ // Method to get total renting period for current property
		return totalRentalDays;
	}
	
    public int getRentalCostPerDay(){ // Method for current Cost per day
		return rentCostDaily;
	}
	
    public String getOwner(){ // method to get Owner of current property
		return propOwner;
	}
	
    public String getPostalAddress(){ // returns address of property
		return propAddress;
	}
}