package Exceptions;
import java.util.Scanner;
public class Calculator {

	public static void main(String[] args) {
		Calculator c = new Calculator();
		c.calculate();

	}
	private double result;
	private double precision = 0.000001;
	
	public Calculator() {
		this.result = 0;
	}
	public Calculator(double xResult) {
		this.setResult(xResult)
	}
	public double getResult() {
		return this.result;
	}
	public void setResult(double xResult) {
		this.result = xResult;
	}
	public void calculate() {
		Scanner key = new Scanner(System.in);
		boolean done = false;
		while(done == false) {
			
			char op = key.next().charAt(0);
			if(op == 'e' || op == 'E') {
				System.out.println("Exiting program...");
				done = true;
			}
			double num2 = key.nextDouble();
			
			try{ evaluate(op, this.result, num2); }
			catch(UnknownOperatorException e) {
				System.out.println(e.getMessage());
				
			}
			catch(DivisionByZeroException e) {
				System.out.println(e.getMessage());
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
			finally {
				//code that always always excutes no matter the exception
				
			}
		}
		
		
		
		
		
	}
	
	public double evaluate(char op, double num1, double num2)  throws UnknownOperatorException, DivisionByZeroException 
	{
		double answer = 0;
		switch(op) {
		case '+': answer = num1 + num2;
		break;
		case '-': answer = num1 - num2;
		break;
		case'*': answer = num1 * num2;
		break;
		case '/': if(-precision < num2 && num2 < precision ) {
			throw new DivisionByZeroException();
		}
		else {
			answer = num1 / num2; }
			break; 
		default: throw new UnknownOperatorException();
		}
		
		
		
		return answer;
	}
	
	
	
	
}
