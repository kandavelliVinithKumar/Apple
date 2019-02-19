package exceptionHandle;

public class MyCustomException extends Exception{

	public MyCustomException() {
		System.err.println("My custom exception called");
	}

}
