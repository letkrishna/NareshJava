/*byte
short
int
long
float
double
char
boolean
*/
//Byte to short Example
class Task1{
	public static void main(String [] args){
		byte x;
		x = 120;
		//x = 128;
		short sh = x;
		
		//System.out.println("Value of x " + x); // Value of x 127
		//System.out.println("Value of x " + x); //  error: incompatible types: possible lossy conversion from int to byte
		System.out.println("Value of sh " + sh); // Value of sh 120
	}

}