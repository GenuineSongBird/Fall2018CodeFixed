package Arithmetic;
public class ArithmeticTester {

	public static void main(String[] args) {
		ArithmeticOps ar = new ArithmeticOps();
		//objectName.methodName()
		int addition = ar.add(5,7);
		System.out.println("Addition:" + addition);
		
		double subtraction = ar.diff(7.5, 3.4);
		
		System.out.println("Difference:" + subtraction);
	}

}
