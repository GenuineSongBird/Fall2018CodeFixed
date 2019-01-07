package test;
import java.util.Scanner;
public class class101618 { //selectionSort

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner key = new Scanner(System.in);
		System.out.println("How many numbers do you want to sort?");
		int size = key.nextInt();
		int[] myArray = new int[size]; //array is same size as user wants
		for(int i = 0; i < myArray.length; i++) {  //has user enter each array value
			System.out.println("Enter the array value " +i+ ":");
			myArray[i] = key.nextInt();
			
		}
		//sort
		for(int i = 0; i < myArray.length; i++) {  //runs through the entire array
			int smallest = myArray[i];   //variable used to save the smallest value of the run
			int minIndex = i; //keeps track of the location of the smallest value
			
			for(int j = i; j < myArray.length; j++) { //finds the smallest value
				if(myArray[j] < smallest) {
					smallest = myArray[j];
					minIndex = j;
					
				}
			}
			if(smallest < myArray[i]) { //moves the smallest value to the front of the array
				//swap
				int temp = myArray[i];
				myArray[i] = myArray[minIndex];
				myArray[minIndex] = temp;
				
			}
} //end of the outer loop	
	for(int i = 0; i < myArray.length; i ++ ) {//prints the final sorted array
		System.out.print(myArray[i] + " ");
	}System.out.println();

	}} //ends main program
