import java.util.InputMismatchException;

public class CustomInputMismatchException extends Exception{
	public CustomInputMismatchException() {
		super("Sorry this is not a valid choice.");
	}
}