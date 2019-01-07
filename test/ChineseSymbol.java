package test;
import java.util.Scanner;
public class ChineseSymbol {

		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			int birthYear;
			int birthValue;
			String animal;
			String element;
			
			System.out.println("This program will determine your chinese zodiac animal and element");
			System.out.println("Please enter your birth year");
			
			birthYear = input.nextInt();
			while(birthYear <= 1924) {
				System.out.println("Your birth year can not be less than 1925 for this program");
				System.out.println("Please enter a valid value");
				birthYear = input.nextInt();
			}
			birthValue = ((birthYear - 1924) % 12);
			
			switch(birthValue) {
				case 0:
					animal = "Rat";
					element = "Water";
					break;
				case 1:
					animal = "Ox";
					element = "Earth";
					break;
				case 2:
					animal = "Tiger";
					element = "Wood";
					break;
				case 3:
					animal = "Rabbit";
					element = "Wood";
					break;
				case 4:
					animal = "Dragon";
					element = "Earth";
					break;
				case 5:
					animal = "Snake";
					element = "Fire";
					break;
				case 6:
					animal = "Horse";
					element = "Fire";
					break;
				case 7:
					animal = "Goat";
					element = "Earth";
					break;	
				case 8:
					animal = "Monkey";
					element = "Metal";
					break;
				case 9:
					animal = "Rooster";
					element = "Metal";
					break;
				case 10:
					animal = "Dog";
					element = "Earth";
					break;
				case 11:
					animal = "pig";
					element = "water";
					break;
				default:
					animal = "error";
					element = "error";
			}
			System.out.println("You are a " + element + " " + animal + "!");
			
			
			input.close();
			
			
			
		}
	
}