/**
 * Author: Alex Cronin & Fintan Costello
 * Description: The user runs the java program from the commandline giving a list
 * of Strings to be sorted into alphabetical order as arguments.
 * The Strings are i) output to the user then ii) sorted into alphabetical order
 * then iii) the ordered list is output to the user.
 */
public class MySortProgram_2 {

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
     * Finds the location of the max element (alphabetically) in the subArray
     * @param list String array to be searched for max String value
     * @param start starting index of the subArray to be sorted
     * @param end ending index of the subArray to be sorted
     * @return location of the max element (alphabetically) in the subArray
     */
    public static int findMaxLocation(String[] list, int start, int end) {
        int maxLoc = 0; //initialize the location of the max String value to 0
        for (int i = start; i <= end; i++) { //iterate between the start and end index of the subArray to be sorted
            //if the value of String in position i (current position in the search) is greater than the value of the
            // String in position maxLoc(the location of the max value so far)
            if (list[i].compareTo(list[maxLoc]) > 0) {
                maxLoc = i;//update the max position to the current position
            }
        }
        return maxLoc;//return the position of the max Sting in the subArray
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
            maxLocation = findMaxLocation(list, 1, i);
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

