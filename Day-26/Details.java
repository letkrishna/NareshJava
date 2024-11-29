// Q1. WAP to enter details such as name,age,mobile number and year of pass out.Display all the details using readable message
import java.util.Scanner;
class Details{
	public static void main(String []args){
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter your name :" );
		String name = s1.nextLine();
		System.out.println("Enter your age " );
		int age = s1.nextInt();
		System.out.println("Enter your Mobile number");
		long mobileNumber = s1.nextLong();
		System.out.println("Enter Year of passing");
		int yop = s1.nextInt();
		System.out.println("Details");
		System.out.println("Name " + name);
		System.out.println("Age " + age);
		System.out.println("Mobile Number " + mobileNumber);
		System.out.println("Year of Passout " + yop);
		
	}
}