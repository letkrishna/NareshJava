/*Q9. Write a program that swaps the values of two integer variables without using a third variable.*/
class Programme9{
	public static void main(String args[]){
		int a = 10;
		int b = 20;
		a = a + b; // a becomes 30
        b = a - b; // b becomes 10
        a = a - b; // a becomes 20

        System.out.println("After swapping: ");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
	}
}