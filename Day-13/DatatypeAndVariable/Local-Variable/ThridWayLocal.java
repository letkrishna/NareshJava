//3. Third way to Create Local Variable under constructior
class ThridWayLocal{
ThridWayLocal(){
	String name = "Krishna";
	int age = 30;
	System.out.println("Name is " + name);
	System.out.println("Age is " + age);
}
	public static void main(String args[]){
		new ThridWayLocal();
}
}