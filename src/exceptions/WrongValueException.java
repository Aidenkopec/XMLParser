package exceptions;

/**
 * Class exception for invalid values
 * @author Aiden
 *
 */
public class WrongValueException extends Exception{
	public WrongValueException(String error) {
		super(error);
	}
}
