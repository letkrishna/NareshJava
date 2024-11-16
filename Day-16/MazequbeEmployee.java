class MazequbeEmployee{
	String empName;
	int age; // instance varible
	String dept; // instance variable
	String empid; // instance variable
	static String company = "Mazeqube Software";
	public static void main(String [] args){
		MazequbeEmployee e1 = new MazequbeEmployee(); // Here name, age, dept, empId loaded for e1
		MazequbeEmployee e2 = new MazequbeEmployee(); // Here name, age, dept, empId loaded for e2
		MazequbeEmployee e3 = new MazequbeEmployee(); // Here name, age, dept, empId loaded for e3
		
		// Accessing Instance variable before initializing
		System.out.println("Accessing Instance variable before initializing");
		System.out.println("Details of Employee");
		System.out.println("Name of the Employee - " +e1.empName); // Default value Null
		System.out.println("Age of the Employee - " +e1.age); // Default value 0
		System.out.println("Age of the Employee - " +e1.dept); // Default value Null
		System.out.println("Age of the Employee - " +e1.empid); // Default value Null
		
		// Accessing Instance variable after initializing
		e1.empName = "Shoeb";
		e1.age = 38;
		e1.dept = "Application Architecture";
		e1.empid = "M001";
		
		System.out.println("Name of the Employee - " +e1.empName); // Shoeb
		System.out.println("Age of the Employee - " +e1.age); // 38
		System.out.println("Age of the Employee - " +e1.dept); // Application Architecture
		System.out.println("Age of the Employee - " +e1.empid); // M001
		
		
		
		
	}
}