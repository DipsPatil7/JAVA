package custom_exception;

public class SpeedOutOfRangeException extends Exception {
	public SpeedOutOfRangeException(String mesg) {
		super(mesg);
	}
}
