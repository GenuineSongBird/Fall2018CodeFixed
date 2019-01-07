package test;
import java.util.Scanner;
public class OutdoorExercise {
	
	public static void main(String[] args) {
			
		Scanner key = new Scanner(System.in);
		System.out.println("This program determines if its the right temperature\n to work out outdoors");
		System.out.println("");
		int count = 1;
		while( count <= 2) {
			System.out.println("Enter the temperature(in \u00B0F):");
			int temperature = key.nextInt();
			
			System.out.println("Enter the % of humidity:");
			
			int humidity = key.nextInt();
			
			if(humidity < 0 || humidity > 100) //OR is ||
			{
				System.out.println("Invalid input. exiting program"); //Input validation
				System.exit(0);
			}
			if(temperature < -200 || temperature > 500)
			{
				System.out.println("Invalid input. Exiting program"); //input validation
				System.exit(0);
			}
			if(temperature <= 75 && humidity < 50) //AND is &&
			{
				System.out.println("it is the ideal weather"
						+ " to exercise outdoors!");
			}
			else if(temperature > 75 || temperature <= 80)
			{
				System.out.println("You may start sweating a lot quicker as its\n kind of hot outside!");
			}
			
		System.out.println("");
		}
				
		key.close();
	}
	
}
