package Exceptions;

public class DivisionByZeroException extends Exception {

	public DivisionByZeroException() {
		super("Division by zero is not possible");
	}
	public DivisionByZeroException(String msg) {
		super(msg);
	}
}
