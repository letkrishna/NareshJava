//Q.2 WAP to enter any two number and display the result of arthmetic operations on numbers
// User must Enter the symbol of operation
// If user enters + then display the sum on numbers
// If user enters - then display the difference between numbers

import java.util.Scanner;
class TwoNumber{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Symbol + :");
		char ch = sc.next().charAt(0);
		System.out.println("Enter value :");
		int a = sc.nextInt();
		System.out.println("Enter value :");
		int b = sc.nextInt();
		System.out.println("Result " + (a+b));
	 
		
		
	}
	
}