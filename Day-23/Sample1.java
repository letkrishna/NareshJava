class Sample1{
	static String firstName,lastName;
	int age;
	String address;
	
	public static void main(String[] args){
	
		Sample1 s1 = new Sample1();
		Sample1 s2 = new Sample1();
		
		s1.firstName = "Krishna";
		s1.lastName = "Singh";
		s1.age = 30;
		s1.address = "Jamshedpur";
		
		s2.firstName = "Ram";
		s2.lastName = "Singh";
		s2.age = 35;
		s2.address = "Pune";
		
		
		
		System.out.println("Static Variable\t" + s1.firstName);
		System.out.println("Static Variable\t" + s1.lastName);
		System.out.println("Non Static Variable\t" + s1.age);
		System.out.println("Non Static Variable\t" + s1.address);
				
		System.out.println("Static Variable\t" + s2.firstName);
		System.out.println("Static Variable\t" + s2.lastName);
		System.out.println("Non Static Variable\t" + s2.age);
		System.out.println("Non Static Variable\t" + s2.address);
	}
}