/* Author: Alex Cronin
 * Description: This program initalizes 3 int variables, 
 * stores the output in a 4th variable and outputs the sum.
 */

public class SumThreeVariables
{
	public static void main(String[] args)
	{	
		int a, b, c, sum;       // initialize 4 int variables. 
		a=5;		        // assign a value to each variable
		b=11;
		c=23;
		sum= a+b+c;             // 3 of the variable and store the value in 'sum' 		
		//output a message containing the value of 'sum' 
    	System.out.println("The variable sum contains the value " + sum);
	}
}
