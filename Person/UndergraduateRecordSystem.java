package Person;
import java.util.*; //all java util classes are now in //wild card entry *
import java.io.*; //java input output 
public class UndergraduateRecordSystem {
public static final String delimiter = "\t";
	public static void main(String[] args) {
			Scanner key = new Scanner(System.in);
			System.out.println("Welcome to the undergraduate Record System!");
			boolean quit = false;
			while(quit == false) {
				System.out.println("Enter 1 to create student records\n Enter 2 to read from a file\nEnter 0 to quit");
				int input = key.nextInt();
				
				switch(input) {
				case 0: //quit
					System.out.println("Exiting the program!");
					quit = true;
					break;
				case 1: //create student records
					System.out.println("Enter the file name:");
					String fileName = key.next();
					System.out.println("Enter number of undergraduates:");
					int numUgrads = key.nextInt();
					
					Undergrad[] ugrads = new Undergrad[numUgrads];
					for(int i = 0; i < ugrads.length; i++) {
						System.out.println("Enter student name:");
						String name = key.next();
						System.out.println("Enter student age:");
						int age = key.nextInt();
						System.out.println("Enter student ID:");
						int id = key.nextInt();
						System.out.println("Enter student major");
						key.nextLine();
						String major = key.nextLine();
						System.out.println("Enter student GPA:");
						double gpa = key.nextDouble();
						
						System.out.println("Enter student minor:");
						String minor = key.next();
						ugrads[i] = new Undergrad(name, age, id, major, gpa, minor);
						

					}
					recordToFile(ugrads, fileName, false);
					break;
					
				case 2: //read from the file
					System.out.println("Enter filename:");
					fileName = key.next();
					ugrads = readFromFile(fileName);
					
					for(int i = 0; i < ugrads.length; i++) {
						ugrads[i].writeOutput();
					}
					break;
					default:
						System.out.println("Invalid choice entered!");
				}
				
			}

	}
public static void recordToFile(Undergrad[] ugrads, String fileName, boolean append) {
	try {
		PrintWriter fileWriter = new PrintWriter(new FileOutputStream(fileName, append));
		
		fileWriter.println("Number of undergraduates:" + delimiter + ugrads.length);
		
		for(int i = 0; i < ugrads.length; i++) {
			fileWriter.println(ugrads[i].getName() + delimiter + ugrads[i].getAge() + delimiter + ugrads[i].getId() + delimiter + ugrads[i].getMajor() + delimiter +ugrads[i].getGpa() + delimiter + ugrads[i].getMinor());
			
		}
		fileWriter.close();
	}
	catch(IOException e) {
		System.out.print(e.getMessage());
	}
}
	public static Undergrad[] readFromFile(String fileName) {
		if(fileName == null) {
			System.out.println("File is not found");
			return null;
		}
		try {
			Scanner fileScanner = new Scanner(new File(fileName));
			
			String fileLine = fileScanner.nextLine();
			
			String[] splitLines = fileLine.split(delimiter);
			
			if(splitLines.length != 2) {
				System.out.println("File formatted incorrectly");
				return null;
			}
			
			Undergrad[] ugrads = new Undergrad[Integer.parseInt(splitLines[1])];
			int ugradCount = 0;
			//for(int i = 0; i < ugrads.length; i++) {
			while(fileScanner.hasNextLine()) {
				fileLine = fileScanner.nextLine();
				splitLines = fileLine.split(delimiter);
				if(splitLines.length == 6) {
					String name = splitLines[0];
					int age = Integer.parseInt(splitLines[1]);
					int id = Integer.parseInt(splitLines[2]);
					String major = splitLines[3];
					double gpa = Double.parseDouble(splitLines[4]);
					String minor = splitLines[5];
					
					ugrads[ugradCount] = new Undergrad(name, age, id, major, gpa, minor);
					ugradCount++;
				}
				else { 
					System.out.println("File line formatted incorrectly");
					continue;
			}
				
			
		}
			fileScanner.close();
			return ugrads;
		
	}
		catch(IOException e) {
			System.out.println(e.getMessage());
			return null;
		}
	
	
	
} }
