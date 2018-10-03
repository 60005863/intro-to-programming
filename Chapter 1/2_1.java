/*
Author: Tyson Imlay
Date: 10/3/18
*/
import java.util.Scanner;
class 2_1 {
	public static void main(String[] args) {
		// declare variables
		Scanner input = new Scanner(System.in);
		double celcius = 0.0;
		double fahrenheit = 0.0;
		
		// Prompt user
		System.out.println("We are going to convert celsius to fahrenheit!");
		System.out.print("Enter a degree in celcius: ");
		celcius = input.nextDouble();
		fahrenheit = (9.0/5) * celcius + 32;
		// Display results
		System.out.println(celcius +" Celcius is " + fahrenheit +" Fahrenheit ");
	}
}