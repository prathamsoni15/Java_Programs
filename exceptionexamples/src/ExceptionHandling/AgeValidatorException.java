package ExceptionHandling;

public class AgeValidatorException extends Exception{
	
	public AgeValidatorException() {
		System.out.println("Below 18 age is not eligible for voting");
	}
	
	public AgeValidatorException(String msg) {
		System.out.println(msg);
	}
}
