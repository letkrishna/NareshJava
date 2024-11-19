/*2. WAP for the below requirement:
   a. VandeBharat Express departs at 7 pm and takes
      6hrs to reach the destination.
   b. ShatabdiExpress departs at 7:25pm and takes 8hrs
      to reach destination.
   c. NagavalliExpress departs at 5:10pm and takes 6.5 hrs to
   reach destination.
   All the train's starting point is Secunderabad.

   Create proper no of objects of trains and initialize and display the
   details of each train.*/

class Train{
	String name;
	double journeyDurtation;
	String departureTime;
	static String startingPoint = "Secunderabad";
	public static void main(String [] args){
		Train t1 = new Train();
		Train t2 = new Train();
		Train t3 = new Train();
		// Setting value of t1
		t1.name = "VandeBharat Express";
		t1.journeyDurtation = 6.0;
		t1.departureTime = "7.00 pm";
		
		// Setting value of t2
		t2.name = "ShatabdiExpress";
		t2.journeyDurtation = 8.0;
		t2.departureTime = "7.25 pm";
		
		// Setting value of t3
		t3.name = "NagavalliExpress";
		t3.journeyDurtation = 6.5;
		t3.departureTime = "5.10 pm";
		
		System.out.println("Details of t1");
		System.out.println("Name " + t1.name);
		System.out.println("Departure Time " + t1.name);
		
	}
}