package test;

//Author: Tyson Medlin
//9.11.18
//Algorithmic Design 1, 145 018

import java.util.Scanner;
public class fr {
	
	public static void main(String[] args) {
		//ChooseYourOwnAdventureGame, needs 9 endings, each ending requires at least 2 decisions
		//3 endings must have 3 decisions to get to
		//must have at least one: numeric comparison, string comparison, boolean expression
		Scanner input = new Scanner(System.in);
		int UserInputNumber;  //declaring the variables that will be used for choices
		String UserInputString;
		boolean UserInputBoolean;
		System.out.println("Welcome to Morning Decisions Game"); //program starts outputting to user
		System.out.println("");
		System.out.println("- - - START - - -");
		System.out.println("");
		System.out.println("You wake up by the sound of an alarm, in a tiny bed in Bates West");
		System.out.println("You have classes to go to, villages to raid and people to see.");
		System.out.println("What do you do? (enter your choice then press enter key)");
		System.out.println("");
		System.out.println("1 - I get out of bed");
		System.out.println("2 - I stay in bed for 30 minutes");
		System.out.println("3 - I stay in bed for 2 hour");
		UserInputNumber = input.nextInt();
		System.out.println(""); //first user option tree starts
		if(UserInputNumber == 1) {  //if user choose 1
			
			
			System.out.println("Because you have some sense of meaning in your life, you get out of bed right as your alarm goes off");
			System.out.println("You grab your bookbag, and are ready to consume");
			System.out.println("Slowly and delicately opening the fridge, you see three scrumptious choices");
			System.out.println("");
			System.out.println("Cereal - A sugary bowl of Special K with whole milk.");
			System.out.println("Oats - Combine sugary oats and milk to make oatmeal. Microwaved for 89 seconds.");
			System.out.println("Toothpicks - theres a plastic container of toothpicks in the fridge for some reason.");
			UserInputString = input.next();
			System.out.println(""); //2nd choice tree starts
			if(UserInputString.equalsIgnoreCase("cereal")) {
				System.out.println("You enjoy some Special K and notice your phone is buzzing"); //true or false
				System.out.println("Will you check it? (true or false)");
				UserInputBoolean = input.nextBoolean();
				System.out.println("");
				if(UserInputBoolean = true) {
					System.out.println("Your phone recieved a text that says school has been canceled today due to incoming triple-direction hurricanes");
					System.out.println("You spend the rest of the day studying");
				}
				else {
					System.out.println("You get to class and wonder why no one is there");
					System.out.println("You spend the rest of the day wondering around campus");
				}
			}
			else if(UserInputString.equalsIgnoreCase("oats")) {
				System.out.println("You atttempt to make oats but the oatmeal bag breaks upon having milk poured in it for measuring.");
				System.out.println("You clean the whole mess up and go to class hungry");
				System.out.println("Once arriving back at your dorm you spend the rest of the day studying in the Bates study room");
			}
			else if(UserInputString.equalsIgnoreCase("toothpicks")) {
				System.out.println("You eat toothpicks and your mouth hurts for the rest of the day, causing immeasurable suffering.");
				System.out.println("What were you expecting (end)");
			}
			else {
				System.out.println( UserInputString + " IS NOT A REAL OPTION PLEASE RESTART PROGRAM");
			}
			input.close();
		}
		else if(UserInputNumber == 2) { //if user choose 2
			System.out.println("You are going to be late to class, and you don't feel much better than you did 30 minutes ago");
			System.out.println("Heck, you're already late, is going to class even worth the effort now? ");
			System.out.println("What do you do while your education fund slowly fades into nothingness");
			System.out.println("");
			System.out.println("Bates - You could not go to class and eat at the best diner at USC, Bates Diner.");
			System.out.println("Class - You could rush to class in hopes of getting there in time");
			System.out.println("Game - You could spend this time playing a sick game of CS:GO on your computer. Rush B");
			UserInputString = input.next();
			System.out.println(""); //3rd choice tree starts
			if(UserInputString.equalsIgnoreCase("bates")) {
				System.out.println("You arrive at Bates Diner but unexpectedly none of the food is ready but salad");
				System.out.println("You eat a salad with banana peppers, and spend the rest of your day in your dorm.");
			}
			else if(UserInputString.equalsIgnoreCase("class")) {
				System.out.println("You arrive at class and nothing really happens because you are late");
				System.out.println("Although you have a hard time understanding the new material");
				System.out.println("You spend the rest of the day studying");
			}
			else if(UserInputString.equalsIgnoreCase("game")) {
				System.out.println("So you crank up your custom built desktop and run good 'ol Counter-Strike");
				System.out.println("A map opening for Dust_2 appears, do you accept? (true or false)");//true or false
				UserInputBoolean = input.nextBoolean();
				System.out.println("");
				if(UserInputBoolean = true) {
					System.out.println("You play a game of Dust_2 and wind 16-14.");
					System.out.println("You spend the rest of the day making art.");
					
				}
				else {
					System.out.println("You dont choose Dust_2 and get stuck on de_Office");
					System.out.println("In which you lose 16-0, and spend the rest of the day trying to learn what happened at class");
				}
			}
			else {
				System.out.println( UserInputString + " IS NOT A REAL OPTION PLEASE RESTART PROGRAM");
			}
			input.close();
		}
		else if(UserInputNumber ==3) { //if user choose 3
			System.out.println("Setting a new personal low, you got 2 more hours of sleep in, at the cost of todays classes");
			System.out.println("You're classes go on without you just fine, now you need to distract yourself from your decisions");
			System.out.println("What tasteful choice of distraction do you want today, sleepyhead?");
			System.out.println("");
			System.out.println("TwistMe - You could go to the best (and only) mexican-type restaurant on campus, Twisted Taco, where you order two avacado tacos");
			System.out.println("Gym - You could go to the gym across campus and ride the bike with the screen on it because it feels like a videogame and you love that");
			System.out.println("Game - CS:GO's such a great option we're putting it here too. How brave");
			UserInputString = input.next();
			System.out.println(""); //4th choice tree starts
			if(UserInputString.equalsIgnoreCase("twistme")) {
				System.out.println("Arriving at Twisted Taco you notice the line is longer than any other restaurant at Russel House, but stay determined");
				System.out.println("Your food is great, but they went light on your chips, giving you a sad 10 chips");
				System.out.println("You spend the rest of your day exploring Columbia");
			}
			else if(UserInputString.equalsIgnoreCase("gym")) {
				System.out.println("You have a great time on the bike excercise machine");
				System.out.println("Upon leaving the gym you notice the train is preventing you from getting to your dorm");
				System.out.println("Do you jump over the train? (true or false)"); //true or false
				UserInputBoolean = input.nextBoolean();
				System.out.println("");
				if(UserInputBoolean = true) {
					System.out.println("You attempt to jump over the train but it starts moving");
					System.out.println("Now you must ride the train until its next stop and find a way to get back to columbia");
					System.out.println("On the way you meet homeless people who live on the train. One is named Eli and he sells things he finds on the ground (end of day)");
				}
				else {
					System.out.println("Like a EDUCATED COLLEGE STUDENT you don't jump over the train because of the potential risk");
					System.out.println("(Think more often about the potential risk of your actions) You take the long way to your dorm and spend the rest of your day studying");
					
				}
			}
			else if(UserInputString.equalsIgnoreCase("game")) {
				System.out.println("You play some CS:GO and end up on the map de_mirage");
				System.out.println("In which you lose 16-0 and get deranked back to silver");
				System.out.println("You spend the rest of your day reading");
			}
			else {
				System.out.println( UserInputString + " IS NOT A REAL OPTION PLEASE RESTART PROGRAM");
			}
			input.close();
		}
		else { //if user choose anything else
			System.out.println("You entered a incorrect answer, and have found the secret choices for secret cool people of secretcy!");
			System.out.println("You do realize " + UserInputNumber + " is not a real option, right?");
			System.out.println("");
			System.out.println("Nates - You leave your dorm and spend the day at nates house");
			System.out.println("Swans - You listen to swans all day and start to feel like living flesh");
			UserInputString = input.next();
			System.out.println(""); //5th choice tree starts
			if(UserInputString.equalsIgnoreCase("nates")) {
				System.out.println("Out of no where you drive all the way to nates house and have a great time");
				System.out.println("You play around with the giant weapons you made last summer, and walk in the woods all night");
				System.out.println("In the morning you return to USC (end)");
			}
			else {
				System.out.println("You either picked swans or a invalid answer, but either way you listen to swans");
				System.out.println("After listening to some sick music, you spend the rest of the day at a study room in the library.");
			}
			
		}
		
		input.close();
	}
	
}