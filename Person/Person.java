package Person;

public class Person {
	private String name;
	private int age;
	
	public Person() {
		this.name= "unknown";
		this.age = 0;
	}
	public Person(String xName, int xAge) {
		this.setName(xName);
		this.setAge(xAge);
	}
	public String getName() {
		return this.name;
	}
	public int getAge() {
		return this.age;
	}
	public void setName(String xName) {
		this.name = xName;
	}
	public void setAge(int xAge) {
		if(xAge > 0) {
			this.age = xAge;
		}
	}
	public void writeOutput() {
		System.out.println("Name: " + this.name + "\nAge: " + this.age);
	}
	
}


