package test;
import java.util.Scanner;
public class DecisionsGame {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		
		String contestant1Prize = "nothing";
		String contestant2Prize = "nothing";
		
		String notePrize = "Post-It Notes";
		String pocketPrize = "a piece of paper that says " + "\"Better luck next time!\"";

		String bagPrize = "KitKat!";
		
		System.out.println("Contestant1: I will give you this" 
							+ " post-it notes. Would you like to keep it or " 
							+ "Give it to contestant2 for what's in "
							+ "my pocket or my bag?");
		String response = key.next();
		if(response.equalsIgnoreCase("pocket"))
		{
			contestant1Prize = pocketPrize;
		
			System.out.println("Contestant2: Would you like to keep the"
					+ "Post-It notes or swap it with what's in my bag? Enter keep or bag or pocket");
			response = key.next();
			
			if(response.equalsIgnoreCase("keep"))
			{
				contestant2Prize = notePrize;
			}
			else if(response.equalsIgnoreCase("bag"))
			{
				contestant2Prize = bagPrize;
			}
			else
			{
				System.out.print("Invalid choice!");
			}
		}
		else if(response.equalsIgnoreCase("bag"))
		{
			contestant1Prize = bagPrize;
			
			System.out.println("Constesant2: will you keep"
					+ " the post it notes or swap it for whats in my pocket?");
			
			response = key.next();
			
			if (response.equalsIgnoreCase("keep"))
			{
				contestant2Prize = notePrize;
				
			}
			else if (response.equalsIgnoreCase("pocket"))
			{
				contestant2Prize = pocketPrize;
			}
		}
		
		System.out.println("Contestand1 won " +contestant1Prize+ "\nand contestand 2 won " +contestant2Prize);
		
		
	}

}
