/*Q3. Create local variables for two integers, num1 and num2.
Assign them values and perform addition, subtraction, multiplication,
division, and modulus operations. Print the results.*/
class Programme3 {
	public static void main(String args[]){
		int num1, num2, result;
		num1 = 20;
		num2 = 10;
		
		System.out.println("Addition of Values");
		System.out.println("-------------------");
		System.out.println("The value of num1 is " + num1);
		System.out.println("The value of num2 is " + num2);
		System.out.println("The value of num1 and num2 is " + (num1+num2)); // Output - 30
		System.out.println("-------------------");
		
		System.out.println("subtraction of Values");
		System.out.println("-------------------");
		System.out.println("The value of num1 is " + num1);
		System.out.println("The value of num2 is " + num2);
		System.out.println("The value of num1 and num2 is " + (num1-num2)); // Output - 10
		System.out.println("-------------------");
		
		System.out.println("multiplication of Values");
		System.out.println("-------------------");
		System.out.println("The value of num1 is " + num1);
		System.out.println("The value of num2 is " + num2);
		System.out.println("The value of num1 and num2 is " + (num1*num2)); // Output - 200
		System.out.println("-------------------");
		
		System.out.println("division of Values");
		System.out.println("-------------------");
		System.out.println("The value of num1 is " + num1);
		System.out.println("The value of num2 is " + num2);
		System.out.println("The value of num1 and num2 is " + (num1/num2)); // Output - 2
		System.out.println("-------------------");
		
		System.out.println("modulus of Values");
		System.out.println("-------------------");
		System.out.println("The value of num1 is " + num1);
		System.out.println("The value of num2 is " + num2);
		System.out.println("The value of num1 and num2 is " + (num1%num2)); // Output - 0
		System.out.println("-------------------");
	}
}