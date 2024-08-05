package customeexception;

public class CustomException {

	public static void main(String[] args) {

		int no = 6;
		
	try {	
		if(no%2 == 0) {
			throw new ArithmeticException();
		}
		else {
			System.out.println(no);
		}
	}
	catch(ArithmeticException ar) {
		System.out.println("Enter odd numbers only");
	}
		
	}

}
