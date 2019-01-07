package Person;

public class Undergrad extends Student{
	private String minor;
	public Undergrad() {
		super();
		this.minor = "no minor selected";
	}
	public Undergrad(String xName, int xAge, int xStudentId, String xMajor, double xGpa, String xMinor) {
		super(xName, xAge, xStudentId, xMajor, xGpa);
		
	}
	public String getMinor() {
		return this.minor;
	}
	public void setMinor(String xMinor) {
		if(xMinor.equalsIgnoreCase("Chinese") || xMinor.equalsIgnoreCase("Education")) {
			this.minor = xMinor;
		}
	}
	public void writeOutput() {
		super.writeOutput();
		System.out.println("\nMinor: " + this.minor);
	}
}
