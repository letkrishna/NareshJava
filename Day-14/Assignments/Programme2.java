/*Q2. Write a program that takes two integers and two double values.
Perform addition, subtraction, multiplication, division, and modulus
operations on both sets of values and print the results.
Objective: Practice arithmetic operations on int and double types
and observe how division differs between integer and floating-point numbers*/

class Programme2{
 public static void main(String [] args){
	 int a,b; double c,d;
	 a = 10;
	 b = 20;
	 c = 200.00;
	 d = 300.00;
	 // Integer Example
	 System.out.println("Operation performed using int");
	 System.out.println("-----------------------------");
	 System.out.println("Addition of Values");
	 System.out.println("-------------------");
	 System.out.println("The value of a is " + a);
	 System.out.println("The value of b is " + b);
	 System.out.println("Addition of a and b is " + (a+b)); // Output - 30
	 System.out.println("-------------------");
	 
	 System.out.println("Subtraction of Values");
	 System.out.println("The value of a is " + a);
	 System.out.println("The value of b is " + b);
	 System.out.println("Subtraction of a and b is " + (a-b)); // Output - -10
	 System.out.println("----------------------------------");

     System.out.println("Multiplication of Values");
	 System.out.println("The value of a is " + a);
	 System.out.println("The value of b is " + b);
	 System.out.println("Multiplication of a and b is " + (a*b)); // Output - 200
	 System.out.println("----------------------------------");	 
	 
	 System.out.println("Division of Values");
	 System.out.println("The value of a is " + a);
	 System.out.println("The value of b is " + b);
	 System.out.println("Division of a and b is " + (a/b)); // Output - 0
	 System.out.println("----------------------------------");
	 
	 System.out.println("Modulus of Values");
	 System.out.println("The value of a is " + a);
	 System.out.println("The value of b is " + b);
	 System.out.println("Modulus of a and b is " + (a%b)); // Output - 10
	 System.out.println("-----------------------------");
	 
	 // Double Example
	 System.out.println("Operation performed using Double");
	 System.out.println("-----------------------------");
	 System.out.println("Addition of Double Values");
	 System.out.println("-------------------");
	 System.out.println("The value of c is " + c);
	 System.out.println("The value of d is " + d);
	 System.out.println("Addition of c and d is " + (c+d));// Output - 500.02
	 System.out.println("-------------------");
	 
	 
	 
 }
}