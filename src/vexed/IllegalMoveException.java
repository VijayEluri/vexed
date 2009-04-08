package vexed;

public class IllegalMoveException extends RuntimeException {
	
	private static final long serialVersionUID = 1;
	
	public IllegalMoveException() {
		super();
	}
	
	public IllegalMoveException(String message) {
		super(message);
	}
	
	public IllegalMoveException(Throwable cause) {
		super(cause);
	}
	
	public IllegalMoveException(String message, Throwable cause) {
		super(message, cause);
	}
}