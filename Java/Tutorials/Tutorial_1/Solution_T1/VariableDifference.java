/*
 * Author: Alex Cronin
 * Description: This program calculates the sum of 3 double values, 
 * then the product of these valuables and then the difference between
 * the sum and the product
 */

public class  VariableDifference{
   public static void main(String[] args){

     double a = 3.1;     // declare a double variable 'a' and assign it the value value 3.1 
     double b = 6.2;
     double c = 7.0;
     
     // declare a double variable 'sum' and assign it the value of the sum of the three 
     // variables a, b and c
     double sum = a + b + c;
     // declare a double variable 'product' and assign it the value of the product of the  
     // three variables a, b and c
     double product = a * b *c ;
     // declare a double variable 'difference' and assign it the value of product - sum
     double difference = product - sum;

     //output the a message and the value of the sum variable  
     System.out.print("The variable sum contains the value ");
     System.out.println(sum);
     //output the a message and the value of the difference variable
     System.out.print("The variable difference contains the value ");
     System.out.println(difference);
   }
}
