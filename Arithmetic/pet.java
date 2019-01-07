package Arithmetic;

public class pet {
	//instance variables are attributes
	//encapsulation or information hiding
	private String name;
	private double weight;
	private String type;
	//constructor- assigns initial values to instance variables
	
	public pet() {
		this.name = "no name yet";
		this.weight = 0;
		this.type = "unknown";
	}
	//parameterized constructor
	public pet(String xName, double xWeight, String xType) {
		this.setName(xName);
		this.setWeight(xWeight);
		this.setType(xType);
		
	}
	//accessors - getters
	
	//return the name of the pet
	public String getName() {
		return this.name;
	}
	public double getWeight() {
		return this.weight;
	}
	public String getType() {
		return this.type;
	}
	//mutators-modify the values of an instance variable if valid
	public void setName(String xName) {
		this.name = xName;
	}
	public void setWeight(double xWeight) {
		if(xWeight > 0) {
			this.weight = xWeight;
		}
		else {
			System.out.println("negative weight is invalid");
		}
	}
	public void setType(String xType) {
		if(xType.equalsIgnoreCase("dog") || xType.equalsIgnoreCase("cat") || xType.equalsIgnoreCase("elephant"))
		{
		this.type = xType;
		}
	}
	
	public String toString() {
		return "Name: " + this.name + "\nWeight" + this.weight + "\nType; " + this.type;
	}
	//create instance vars
	//default constructor
	//parameterized constructer
	//accessors for eac instance var
	//mutators for each instance var
	//tyString method
	
	
}




