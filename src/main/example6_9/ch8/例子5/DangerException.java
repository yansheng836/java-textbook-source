package ch8.例子5;

public class DangerException extends Exception {
	final String message = "超重";

	public String warnMess() {
		return message;
	}
}
