package test;
import java.util.Scanner;
public class HeightExaminator {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.println("Enter the number of students in the room: ");
		int size = key.nextInt();
		
		double heightArr[] = new double[size]; //declaring double array of size size
		for(int i = 0; i < heightArr.length; i++) { //legnth of the array   //inserts values into the array
			System.out.println("Enter the height of student " + i + "(in feet):");
			heightArr[i] = key.nextDouble();
		}
		//print the array
		System.out.println("Printing the array values");
		for(int i = 0; i< heightArr.length; i++) {
			System.out.println(heightArr[i]);
		}
		
		
	}

}
