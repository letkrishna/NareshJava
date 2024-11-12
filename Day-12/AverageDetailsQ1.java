// Day-12
// Chapter Operators
// Set -1
//Q1. WAP to store any five integers and calculate and display their average.
/*
class Average {
public static void main(String args[]){
	int a = 5;
	int b = 10;
	int c = 15;
	int d = 20;
	int e = 25;
	total = a+b+c+d+e;
	double totalavg = total/2.0;
	System.out.println("Average of total is " + (totalavg));
	
}
}
*/
class Average{
	public static void main(String args[]){
		int a,b,c,d,e,sum;
		double avg;
		a = 30;
		b = 90;
		c = 90;
		d = 20;
		e = 50;
		sum = a + b + c + d + e;
		avg = sum/5.0;
		System.out.println("The number are: ");
		System.out.println(a+","+b+", "+c+", "+d+", "+e);
		System.out.println("Sum is " +sum);
		System.out.println("Average is " +avg);
		
		
		
	}
}