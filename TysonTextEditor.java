//Tysons Text Editor
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.io.File;
import java.util.Scanner;
public class TysonTextEditor {
public static void main(String[] args) {
  Scanner key = new Scanner(System.in);
  int choice = 0;
  String line = "";
  while(choice != 9) {
    
    System.out.println("-----------------------------------------");
    System.out.println("Welcome to the Tyson Text Editor (TTE)\n-----------------------------------------\n \nPlease make a choice.\n1: Create new note\n2: Write on already existing note\n3: Read from existing note\n4: Send a note\n9: End program");
    choice = key.nextInt();
    if(choice == 1) { //the user wants to write a new note
      System.out.println("Please enter the name of the note you wish to create");
      String fileName = key.nextLine();
      fileName = key.nextLine();
      System.out.println("Creating " + fileName + ".txt");
      boolean write = true;
      PrintWriter outputStream = null;
      line = "";
      try
      {
        outputStream = new PrintWriter(fileName + ".txt");
      }
      catch(FileNotFoundException e) 
      {
        System.out.println("Error opening file: " + fileName + ".txt" );
        System.exit(0);
      }
      System.out.println("Ok, you're good to start writing!\nWhen you are done, just type \"done\"");
      while(write == true) {
        line = key.nextLine();
        if(line.equalsIgnoreCase("done")) { write = false; }
        if(write == true) { outputStream.println(line); }
      }
      //the user is done creating a new note and writing to it
      outputStream.close();
      System.out.println("Your text has been saved to " + fileName + ".txt\nReturning to menu!");
    }
    //--------------------------------------------------------------------------------------------------
    if(choice == 2) { //user wants to add on to already exsisting note
      System.out.println("Please enter the name of the note you wish to write onto");
      String fileName = key.nextLine();
      fileName = key.nextLine();
      System.out.println("Finding " + fileName + ".txt...");
      boolean write = true;
      PrintWriter outputStream = null;
      line = "";
      try
      {
        outputStream = new PrintWriter(new FileOutputStream(fileName + ".txt", true));
      }
      catch(FileNotFoundException e) 
      {
        System.out.println("Error opening file: " + fileName + ".txt" );
        System.exit(0);
      }
      System.out.println("Ok, you're good to start writing!\nWhen you are done, just type \"done\"");
      while(write == true) {
        line = key.nextLine();
        if(line.equalsIgnoreCase("done")) { write = false; }
        if(write == true) { outputStream.println(line); }
      }
      //the user is done writing to the note
      outputStream.close();
      System.out.println("Your text has been saved to " + fileName + ".txt\nReturning to menu!");
    }
    //--------------------------------------------------------------------------------------------------
    if(choice == 3) {
      System.out.println("Please enter the name of the note you wish to read from.");
      String fileName = key.nextLine();
      fileName = key.nextLine();
      System.out.println("Finding " + fileName + ".txt...");
      boolean write = true;
      Scanner inputStream = null;
      line = "";
      try
      {
       inputStream = new Scanner(new File(fileName + ".txt")); 
      }
      catch(FileNotFoundException e)
      {
        System.out.println("Error opening the file " + fileName + ".txt");
        System.exit(0);
      }
      while(inputStream.hasNextLine())
      {
       line = inputStream.nextLine();
       System.out.println(line);
      }
      inputStream.close();
      System.out.println("-----------------------------------------\nEnd of " + fileName + ".txt! Press enter to continue! \n-----------------------------------------");
      String pressEnter = key.nextLine();
      //pressEnter = key.nextInt();
    }
    if(choice == 4) {
     //send a note
      System.out.println("Sorry, this feature is not ready yet");
      System.exit(0);
    }
    if(choice != 1 && choice != 2 && choice != 3 && choice != 4 && choice != 9) { System.out.println("Invalid choice! Please enter an acceptable choice!"); }
  }
  //end of program
  System.exit(0);
  key.close();
}  
}
