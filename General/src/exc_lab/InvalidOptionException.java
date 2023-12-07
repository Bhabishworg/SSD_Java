package exc_lab;

public class InvalidOptionException extends Exception {
	private static final long serialVersionUID = 1L;

	InvalidOptionException(String msg) {
		super(msg);
	}
}
