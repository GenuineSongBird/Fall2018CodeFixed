//Reverse-a-string
import java.util.Scanner;
public class ReverseAString {
  public static void main(String[] args) {
    boolean repeat = true;
    
      System.out.println("This program will reverse what ever you enter");
      while(repeat == true) {
        System.out.println("Please enter something, then press Enter");
        Scanner key = new Scanner(System.in);
        String input = key.nextLine();
        
        if(input.equalsIgnoreCase("1")) { System.exit(0); } 
        String reversed = "";
        //now reverse
        for(int i = input.length()-1; i >= 0; i--) {
          reversed += String.valueOf(input.charAt(i));
          
        }
        System.out.println(reversed + "\nEnter 1 to end program");
      }
  }
}