package custom_exceptions;

public class InvalidInputException extends Exception {
	public InvalidInputException(String errMesg) {
		super(errMesg);
	}
}
