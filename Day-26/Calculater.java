//Q.2 WAP to enter any two number and display the result of arthmetic operations on numbers
// User must Enter the symbol of operation
// If user enters + then display the sum on numbers
// If user enters - then display the difference between numbers

import java.util.Scanner;
class Calculater{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number :");
		int a = sc.nextInt();
		System.out.println("Enter Second Number :");
		int b = sc.nextInt();
		System.out.println("Enter choise of operation");
		char ch = sc.next().charAt(0);
		if(ch == '+')
			System.out.println("Sum of a and b is "+ (a+b));
		else if(ch == '-')
			System.out.println("Difference of a and b is " + (a-b));
		else if(ch == '*')
			System.out.println("Product of a and b is " + (a*b));
		else if(ch == '/')
			System.out.println("Quatient of a and b is " + (a/b));
		else if(ch == '%')
			System.out.println("Remainder of a and b is " + (a%b));
		else
			System.out.println("Invalid arthmetic operator.. Try again" );
	}
}