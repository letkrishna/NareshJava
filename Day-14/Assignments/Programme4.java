/*Q4. Declare local variables of different types (int, double, char, and boolean).
Assign compatible values and print each variable.*/
class Programme4{
public static void main(String args[]){
		int a; double b; char c; boolean d;
		// Deal with Integer
		//a = 10;// Allowed
		//a = 10.0; //  error: incompatible types: possible lossy conversion from double to int
		//a = 'a'; // //allowed because char type is lesser than int type -  a ---> ASCII value 97
		//a = true; //error: incompatible types: boolean cannot be converted to int
		//a = 100.00d; //  error: incompatible types: possible lossy conversion from double to int
		
		//b = 10;// Output - 10.0
	    //b = 10.00; // Output - 10.0
		//b = 'a'; //allowed because char type is lesser than int type -  a ---> ASCII value 97.0
		
		
		//System.out.println(a);
		System.out.println(b);
		
	}
}