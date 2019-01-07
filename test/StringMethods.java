package test;
import java.util.Scanner;
public class StringMethods {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		
		System.out.println("Enter a sentence: ");
		
		String sentence = key.nextLine();
		
		int length = sentence.length();
		int count = 0;
		
		while(count <= length) {
			char ch = sentence.charAt(count);
			System.out.println(count.toUpperCase());
			
		}
		
		
		System.out.println("The length of the sentence is: " + length);
		
		int index = sentence.indexOf("!");
		
		System.out.println("Index of \"!\" is: " + index);
		
		char ch = sentence.charAt(5);
		
		System.out.println("The character at index 5 is: " + ch);
		
		String s1 = sentence.substring(10);
		
		System.out.println("Substring starting at index 10 is: " + s1);
		
		String s2 = sentence.substring(10,  17);
		
		System.out.println("Substring starting at index 10 and ending at index 17 is: " + s2);
		
		System.out.println("Upper case: " + sentence.toUpperCase());
		System.out.println("Lowercase: " + sentence.toLowerCase());
		key.close();
	}

}
