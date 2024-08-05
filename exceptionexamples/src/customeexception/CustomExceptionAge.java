package customeexception;

import java.util.Scanner;

public class CustomExceptionAge {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		
		int age;
		
		try {
			System.out.println("Enter Your Age: ");
			age = sc.nextInt();
			if(age < 18) {
				throw new ArithmeticException();
			}
			else {
				System.out.println(age);
			}
		}
		catch(ArithmeticException ar) {
			System.out.println("Wrong");
		}
		finally {
			sc.close();
		}
		
		
	}

}
