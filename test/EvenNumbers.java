package test;
import java.util.Scanner;
public class EvenNumbers {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		
		int number = 0;
		int sum = 0;
		System.out.println("Enter five values");
		for(int i=0; i < 5; i++) 
		{
			number = key.nextInt();
			sum += number;
		}
		System.out.print(sum);
	}
}
