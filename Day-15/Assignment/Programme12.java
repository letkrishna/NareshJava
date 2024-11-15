//Q12. What will be the result of the following code?
//int x = 5;
//int y = ++x * 10;
class Programme12{
	public static void main(String args[]){
		int x = 5;
		int y = ++x * 10;
		int result = y;
		System.out.println("Result " + result); // Output - 60
	}
}