//Q1.

class Product {
	String productName;
	int price;
	double totalPrice;
	public void setDetails(String productName, int price){
		this.productName = productName;
		this.price = price;
		this.totalPrice = price - ((30/100.0) * price);
	}
	public void displayDetails(){
		System.out.println();
		System.out.println("Product Name " + this.productName);
		System.out.println("Product Price : Rs. " + this.price);
		System.out.println("Amount to pay after 30% discount " + this.totalPrice);
	}
}
class Mall{
	public static void main(String [] ars){
		Product p1 = new Product();
		Product p2 = new Product();
		Product p3 = new Product();
		p1.setDetails("Shirt", 4500);
		p2.setDetails("Jacket", 7000);
		p3.setDetails("Table Cloth", 650);
		p1.displayDetails();
		p2.displayDetails();
		p3.displayDetails();
		
		
	}
}