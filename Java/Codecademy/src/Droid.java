public class Droid{ // Class declaration
  int batteryLevel;
  
  public Droid(){
    batteryLevel = 100;
  } // end of droid constructor
  
  public void activate(){ // turn on droid method
    System.out.println("Activated. How can I help you?");
    batteryLevel -= 5;
    System.out.println("Battery level is: " + batteryLevel+"%");
  } // end of activate method
  
  public void chargeBattery(int hours){ // charge battery method
    System.out.println("Droid charging....");
    batteryLevel += hours;
    if(batteryLevel > 100){
      batteryLevel = 100;
      System.out.println("Battery level is: " + batteryLevel+"%");
    }// end of if
    else{
      System.out.println("Battery level is: " + batteryLevel+"%");
    } // end of else
  }// end of chargeBattery
  
  public int checkBatteryLevel(){ // check battery level method
    System.out.println("Battery level is: " + batteryLevel+"%");
    return batteryLevel;
  }// end of check battery
  
  public void hover(int feet){ // hover above the ground method
    if(feet>2){
      System.out.println("I cannot go above 2 feet!");
    }// end of if
    else{
      System.out.println("Hovering...");
      batteryLevel -= 20;
      System.out.println("Battery level is: " + batteryLevel+"%");
    } // end of else
  }// end of hover
  
  public static void main(String [ ] args) // main method
	{
    Droid myDroid = new Droid(); // creates a new Droid
    myDroid.activate(); // turns on the Droid
    myDroid.chargeBattery(5); // Charges the droid
    myDroid.hover(1); // Causes droid to hover
	}// end main method
}