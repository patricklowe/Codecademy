/* Write a C++ Program which has a function template which takes two arguments/variables
and swaps them. The template should work for integers, doubles and chars. Also
demonstrate how to call the template in your program for the different argument types.
(Hint: function must use pass by reference).*/
#include <iostream>

template <typename T>

void swap(T &Value1, T &Value2){
    T temp = Value1;
    Value1 = Value2;
    Value2 = temp;
}

int main(){
	int i1, i2;
	double d1, d2;
	char c1, c2;	
	
	std::cout<<"Enter two Characters: ";
	std::cin>> c1 >> c2;
	std::cout << "Original Characters: "
	<< c1 << " and " << c2;
	std::cout << "Swapped: "
	<< swap(c1, c2);
	
	std::cout<<"Enter two Integers: ";
	std::cin>> i1 >> i2;
	std::cout << "Original Integers: "
	<< i1 << " and " << i2
	<<"Swapped: "
		<< std::swap(i1, i2);
		
	std::cout<<"Enter two Doubles: ";
	std::cin>> d1 >> d2;
	std::cout << "Original Doubles: "
	<< d1 << " and " << d2
	<<"Swapped: "
		<< std::swap(d1, d2);
 }
