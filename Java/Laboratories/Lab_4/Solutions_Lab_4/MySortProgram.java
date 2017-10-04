/**
 * Author: Alex Cronin & Fintan Costello
 * Description: The user runs the java program from the commandline giving a list
 * of Strings to be sorted into alphabetical order as arguments.
 * The Strings are i) output to the user then ii) sorted into alphabetical order
 * then iii) the ordered list is output to the user.
 */
public class MySortProgram{

    /**
     * Output an array of Strings to the user
     * @param list holds the array of Strings
     */
    public static void printList(String[] list) {
        //for each element in the array "list"
        for (int i = 0; i < list.length; i++) {
            //print out the ith element of the array
            System.out.print(list[i] + " ");
        }
        System.out.println();
    }


    /**
     * Sorts a string array into ascending order
     * @param list  String array to be sorted
     */
    public static void sortList(String[] list) {
        int maxLocation;    //declare int variable to store the location of the max String
        String temp;        //declare String variable to store the current String value while values are being swapped
        //for each element in the array
        for (int i = list.length - 1; i >= 0; i--) {
            //find the location of the max String value in the subArray 0 to i
            maxLocation = 0; //initialize maxLocation to 0
            for (int j=1; j<=i; j++) { //iterate between the start and end index of the subArray to be sorted
                //if the value of String in position i (current position in the search) is greater than the value of the
                // String in position maxLoc(the location of the max value so far)
                if (list[j].compareTo(list[maxLocation]) > 0) {
                    maxLocation = j;//update the max position to the current position
                }
            }
            // swap the max String to the end of the subArray
            temp = list[i];                 //make a copy of the current String
            list[i] = list[maxLocation];    //move the old max value to the current position
            //move the current value (which was stored in temp) into the position which previously held the max value
            list[maxLocation] = temp;
        }
    }

    /**
     * Main method
     * @param args array of Strings to be sorted
     */
    public static void main(String[] args) {
        printList(args);    //output the array entered in the commandline to the user
        sortList(args);     //sort the array
        printList(args);    //output the sorted array to the user
         //Terminate the currently running Java Virtual Machine
        System.exit(0);
    }

}

