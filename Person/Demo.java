package Person;

public class Demo {

	public static void main(String[] args) {
		Undergrad ug = new Undergrad("Jack", 18, 1234, "Computer Science", 4.0, "Chinese");
		ug.writeOutput();
		Undergrad ug2 = new Undergrad("Jack", 18, 1234, "Computer Science", 4.0, "Japanese");
		ug.writeOutput();
	}

}
