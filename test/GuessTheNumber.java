package test;
import java.util.Scanner;
import java.util.Random;

public class GuessTheNumber {

	public static final int VALUE = 100;
	public static void main(String[] args) {
		
		Scanner key = new Scanner(System.in);
		Random r = new Random();
		//was 0 to 99, now is 1 to 100
		int secretNumber = r.nextInt(VALUE) + 1;
		System.out.println("I will pick a number between 1 and 100");
		System.out.println("Can you guess that number");
		
		int guess = key.nextInt();
		boolean correctValue = false;
		while(correctValue == false) {
			if(guess > secretNumber) {
				System.out.println("Your value is too high! Try again. " + "pick lower than " + guess);
			}
			else if(guess < secretNumber) {
				System.out.println("Your value is too low! Try again." + "pick higher than " + guess);
			}
			else {
				System.out.println("Your guess is correct!");
				correctValue = true;
			}
			
			guess = key.nextInt();
		}
		
		
	}

}
