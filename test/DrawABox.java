package test;
import java.util.Scanner;
public class DrawABox {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.println("Enter the height of the box:");
		int height = key.nextInt();
		System.out.println("Enter the width of the box");
		int width = key.nextInt();
		width = width * 5;
		for(int i = 0; i < height; i++) { //vertical top to bottom
			for(int j = 0; j < width; j++) { //horizontal left to right
				System.out.print("|");
			}
			System.out.println();
		}
		

	}

}
