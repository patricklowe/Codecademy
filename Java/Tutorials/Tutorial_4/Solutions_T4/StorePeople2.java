/**
 * Author: Alex Cronin & Fintan Costello
 * Description: The user is asked to enter the name and age of five people. This information is stored in Person
 * objects which are intern stored in a Person array. This information is then output to the user.
 */

import javax.swing.JOptionPane;//import the JOptionPane class

/**
 * The Person class
 */
class Person { //beginning of class

    public String name; //String variable named name to hold the persons name
    public int age;     //int variable named age to hold the persons age

    /**
     * Constructor of the Person class accepting 2 parameters
     * @param n name of the Person
     * @param a age of the Person
     */
    public Person(String n, int a) {
        name = n;
        age = a;
    }

    /**
     * Accessor method to return the name and age of a Person object as a String
     * @return the name and age as a String
     */
    public String getDetails() {
        return name + " (" + age + ")";
    }

} // end of person class


/**
 * The StorePeople2 Class
 */
public class StorePeople2 {//begin StorePeopleClass

    public static void main(String[] args) {//begin main method

        Person[] personList = new Person[5];//Declare a Person array called "personList" of length 5
        String currentName;    //Declare a String variable called "currentName" to store the name entered by the user
        String currentAgeAsString;   //Declare a String variable called "currentAgeAsString" to store the name entered by the user
        int currentAge;// //Declare an int variable called "currentAge" to store the age as an int

        //for loop to request the name and ages of 5 people
        for (int i = 0; i < personList.length; i++) {
            // the name of the Person is requested using a JOptionPane dialogue box and stored in the String variable
            //"currentName"
            currentName = JOptionPane.showInputDialog(null, "Please enter name:");
            // the age of the Person is requested using a JOptionPane dialogue box and stored in the String variable
            //"currentAgeAsString"
            currentAgeAsString = JOptionPane.showInputDialog(null, "Please enter age:");
            //the age of the Person is parsed from a String to an int and stored in "currentAge"
            currentAge = Integer.parseInt(currentAgeAsString);
            //using the constructor and new Person object is generated and stored in position i in the "personList" array
            personList[i] = new Person(currentName, currentAge);
        }//end for loop

        //Declare a String variable ageSearchAsString and request a value from the user
        String ageSearchAsString = JOptionPane.showInputDialog(null, "Please enter an age. All people whose ages is less than or equal entered age will be returned:");
        //Declare an int variable ageSearch and parse the value entered by the user to an int and store it in the variable
        int ageSearch = Integer.parseInt(ageSearchAsString);
        //for loop which repeats for every element of the list.
        for (int i= 0; i < personList.length; i++) {
            //if the age of the Person in position i in the "personList" array is less than the age entered by the user
            if (personList[i].age <= ageSearch) {
                //Return the name and the age of the Person as a String and display it to the user using a JOptionPane
                //message dialogue box.
                JOptionPane.showMessageDialog(null, personList[i].getDetails());
            }//end if
        }//end for loop
        System.exit(0);//the Java Virtual Machine is terminated with cod '0' indicating success
    }//end main method
}//end StorePeople2 class
