/*
Author: Tyson Imlay
Date: 10/5/18
*/
import java.util.Scanner;

 public class Ex_2_23 {
	public static void main(String[] args) {
		// declare variables
		Scanner input = new Scanner(System.in);
		double milesPerGallon = 0.0;
		double pricePerGallon = 0.0;
		double drivingDistance = 0.0;
		double cost = 0.0;
		double gallons = 0.0;
				
		//Prompt user
		System.out.println(" We are finding the cost to drive a certain distance! ");
		System.out.print(" Enter the amount of miles per gallon: ");
		milesPerGallon = input.nextDouble();
		System.out.print(" Enter the price per gallon: ");
		pricePerGallon = input.nextDouble();
		System.out.print(" Enter the driving distance: ");
		drivingDistance = input.nextDouble();
		
		// Solve for cost
		gallons = drivingDistance / milesPerGallon;
		cost = gallons * pricePerGallon;
		
		//Display results
		System.out.println("total cost is " + cost);
	}
}