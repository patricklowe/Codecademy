/*
 * Author: Patrick Löwe
 * This class will print the result of adding 3 defined variables
 * and the result of multiplying the 3 variables subtracting the sum of the 3 variables
 */
public class VariableDifference {

	public static void main(String[] args) {
		double a, b, c, sum, difference;
		a = 3.1;
		b = 6.2;
		c = 7.0;
		sum = a + b + c;
		difference = (a * b * c) - sum;
		System.out.println("The sum of 3 variables is " + sum);
		System.out.println("The difference of sum minus product is " + difference);
	}

}
