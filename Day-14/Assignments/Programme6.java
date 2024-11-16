/*Q6. Define a variable for temperature in Celsius, convert it to Fahrenheit using
the formula fahrenheit = (celsius * 9/5) + 32, and print the result.*/
class Programme6{
	public static void main(String args[]){
		double celsius = 25.0;
		double fahrenheit = (celsius * 9.0 / 5.0) + 32.0;
		System.out.println("Temperature in Celsius: " + celsius); // Temperature in Celsius: 25.0
        System.out.println("Temperature in Fahrenheit: " + fahrenheit); // Temperature in Fahrenheit: 77.0
	}
}