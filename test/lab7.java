//Tyson Medlin, Rebekah Soard
package test;
import java.util.Scanner;
import java.util.Random;
public class lab7 {

	public static void main(String[] args) {
		int rollAmount = 0;
		Random rand = new Random();
		int rollValue = 0;
		int amountOne = 0;
		int amountTwo = 0;
		int amountThree = 0;
		int amountFour = 0;
		int amountFive = 0;
		int amountSix = 0;
		
		
		System.out.println("Enter the number of times a 6 sided die should be rolled!");
		Scanner input= new Scanner(System.in); //Preparing the scanner
	    rollAmount = input.nextInt();   //taking user input
	    input.close();
	    for( int i = 1; i <= rollAmount; i++) { //repeat as many times as user specified
	    	rollValue = rand.nextInt(6)+1;   //come up with random roll value
	    	System.out.println(rollValue + " was rolled");
	    	  
	    	switch(rollValue) {  //saves for statistical purposes
	    	case 1: 
	    		amountOne++;
	    		break;
	    	case 2: 
	    		amountTwo++;
	    		break;
	    	case 3: 
	    		amountThree++;
	    		break;
	    	case 4: 
	    		amountFour++;
	    		break;
	    	case 5: 
	    		amountFive++;
	    		break;
	    	case 6: 
	    		amountSix++;
	    		break;
	    	}
	    }
	    	System.out.println("One: " + amountOne);
	    	System.out.println("Two: " + amountTwo);
	    	System.out.println("Three: " + amountThree);
	    	System.out.println("Four: " + amountFour);
	    	System.out.println("Five: " + amountFive);
	    	System.out.println("Six: " + amountSix);
	    	
	   
	    
		

	}

}
