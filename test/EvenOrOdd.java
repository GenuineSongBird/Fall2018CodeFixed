package test;
import java.util.Scanner;
public class EvenOrOdd {

	public static void main(String[] args) {  //this program will determine even or odd numbers when prompted
		Scanner key = new Scanner(System.in); //creates a object of type Scanner
		System.out.println("Enter a number, this program will determine even or odd"); //prompts for input
		System.out.println(""); //added for readability
		int number = key.nextInt();  //creates var to store number input
		//Check if the number is even or odd
		System.out.println("");
		if(number%2 == 0) //mod operator gives us remainder
		{
			System.out.print("The number " + number + " is even"); //declares the number is even
		}
		else
		{
			System.out.print("The number " + number + " is odd"); //declares the number is odd
		}
		System.out.println("");
		System.out.println("The program is over");
		key.close(); //closes the keyboard
		

	}

}
