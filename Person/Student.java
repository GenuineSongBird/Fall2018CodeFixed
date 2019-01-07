package Person;

public class Student extends Person{
	private int studentId;
	private String major;
	private double gpa;
	
	public Student() {
		super();
		this.studentId = 0;
		this.major = "no major selected";
		this.gpa = 0;
	}
	
	public Student(String xName, int xAge,int xStudentId, String xMajor, double xgpa) {
		super(xName, xAge);
		this.setId(xStudentId);;
		this.setGpa(xgpa);
		this.setMajor(xMajor);;
	}
	
	public int getId() {
		return this.studentId;
	}
	public String getMajor() {
		return this.major;
	}
	public double getGpa() {
		return this.gpa;
	}
	public void setId(int xStudentId) {
		if(xStudentId > 0 ) {
			this.studentId = xStudentId;
		}
	}
public void setMajor(String xMajor) {
	if(xMajor.equalsIgnoreCase("Computer Science" ) || xMajor.equalsIgnoreCase("Computer Engineering" ) || xMajor.equalsIgnoreCase("Computer Information Systems" ) || xMajor.equalsIgnoreCase("Math") || xMajor.equalsIgnoreCase("Supply Chain Management")) {
		this.major = xMajor;
	}
}
public void setGpa(double xGpa) {
	if(xGpa > 0.0 && xGpa <= 4.0 ) {
		this.gpa = xGpa;
	}
}
//method overriding - when 2 or more methods have the same method signature but different method bodies
//method overriding ignores the method in the base class
public void writeOutput() {
	super.writeOutput();
	System.out.println("\nStudent ID" + this.studentId + "\nMajor: " + this.major + "\nGPA: " + this.gpa);
	
}
}
