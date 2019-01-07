package test;
import java.util.Scanner;
public class class10418 {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		double average = 0;
		int sum = 0, gradeCounter = 0;
		String input = "";
		
		do
		{
			System.out.println("Enter the grades whose average  you want to calculate");
			System.out.println("When you are done, enter a negative number value");
			int grade = key.nextInt();
			
			while(grade >= 0) {
				sum += grade;
				gradeCounter++;
				
				grade = key.nextInt();
			}
			
			average = sum/gradeCounter;
			System.out.println("Average = " + average);
			System.out.println("Do you want to calculate the average of another set of grades? Enter \" Yes \" or \" No \":");
			input = key.next();
			sum = 0;
			gradeCounter = 0;
			//sentinel value
		}while(input.equalsIgnoreCase("Yes"));
		
		System.out.println("Goodbye!~");
		

	}

}
