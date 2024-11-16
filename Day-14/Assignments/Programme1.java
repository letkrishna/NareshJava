/*Q1. Write a program that performs various arithmetic operations (addition, subtraction, multiplication, division, and modulus) on
int, float, and double types. Observe any differences in results
or precision between them.*/

class Programme1{
 public static void main(String [] args){
	 int a,b; float c, d; double e, f;
	 a = 10;
	 b = 5;
	 c = 20.10f;
	 d = 30.10f;
	 e = 200.10;
	 f = 400.10;
	 // Integer Example
	 System.out.println("Operation performed using int");
	 System.out.println("-----------------------------");
	 System.out.println("Addition of Values");
	 System.out.println("-------------------");
	 System.out.println("The value of a is " + a);
	 System.out.println("The value of b is " + b);
	 System.out.println("Addition of a and b is " + (a+b)); // Output -15
	 System.out.println("-------------------");
	 
	 System.out.println("Subtraction of Values");
	 System.out.println("The value of a is " + a);
	 System.out.println("The value of b is " + b);
	 System.out.println("Subtraction of a and b is " + (a-b)); // Output - 5
	 System.out.println("----------------------------------");
	 
	 System.out.println("Multiplication of Values");
	 System.out.println("The value of a is " + a);
	 System.out.println("The value of b is " + b);
	 System.out.println("Multiplication of a and b is " + (a*b)); // Output - 50
	 System.out.println("----------------------------------");
	 
	 System.out.println("Division of Values");
	 System.out.println("The value of a is " + a);
	 System.out.println("The value of b is " + b);
	 System.out.println("Division of a and b is " + (a/b)); // Output - 2
	 System.out.println("----------------------------------");
	 
	 System.out.println("Modulus of Values");
	 System.out.println("The value of a is " + a);
	 System.out.println("The value of b is " + b);
	 System.out.println("Modulus of a and b is " + (a%b)); // Output - 0
	 System.out.println("-----------------------------");
	 
	 // Float Example
	 System.out.println("Operation performed using float");
	 System.out.println("-----------------------------");
	 System.out.println("Addition of Floating Values");
	 System.out.println("-------------------");
	 System.out.println("The value of c is " + c);
	 System.out.println("The value of d is " + d);
	 System.out.println("Addition of c and d is " + (c+d));// Output - 50.02
	 System.out.println("-------------------");
	 
	 System.out.println("Subtraction of Floating Values");
	 System.out.println("The value of c is " + c);
	 System.out.println("The value of d is " + c);
	 System.out.println("Subtraction of c and d is " + (c-d));// Output - -10.0
	 System.out.println("----------------------------------");
	 
	 System.out.println("Multiplication of Floating Values");
	 System.out.println("The value of c is " + c);
	 System.out.println("The value of d is " + d);
	 System.out.println("Multiplication of c and d is " + (c*d)); // Output - 605.01
	 System.out.println("----------------------------------");
	 
	 System.out.println("Division of Floating Values");
	 System.out.println("The value of c is " + c);
	 System.out.println("The value of d is " + d);
	 System.out.println("Division of a and b is " + (c/d)); // Output 0.6677741
	 
	 // Double Example
	 System.out.println("Operation performed using Double");
	 System.out.println("-----------------------------");
	 System.out.println("Addition of Double Values");
	 System.out.println("-------------------");
	 System.out.println("The value of e is " + e);
	 System.out.println("The value of f is " + f);
	 System.out.println("Addition of e and f is " + (e+f));// Output - 600.02
	 System.out.println("-------------------");
	 
	 System.out.println("Subtraction of Double Values");
	 System.out.println("The value of e is " + e);
	 System.out.println("The value of f is " + f);
	 System.out.println("Subtraction of e and f is " + (e-f)); // Output - -200.00000000000003
	 System.out.println("----------------------------------");
	 
	 System.out.println("Multiplication of Double Values");
	 System.out.println("The value of e is " + e);
	 System.out.println("The value of f is " + f);
	 System.out.println("Multiplication of e and f is " + (e*f)); // Output - 80060.01000000001
	 System.out.println("----------------------------------");
	 
	 System.out.println("Division of Double Values");
	 System.out.println("The value of e is " + e);
	 System.out.println("The value of f is " + f);
	 System.out.println("Division of e and f is " + (e/f)); // Output -  0.5001249687578105
	 
	 
	 
	 
	 
	 
	 
 }
}