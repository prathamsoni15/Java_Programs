package exceptionexamples;

import java.util.Scanner;

public class ExxceptionExample1 {

	public static void main(String[] args) {
	
		Scanner	sc = new Scanner(System.in); 
		
		try {
			System.out.println("Enter the First Number : ");
			int a = sc.nextInt();
			
			System.out.println("Enter the Second Number : ");
			int b = sc.nextInt();
			
			int c = a/b;
		}
			
		catch(ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
	}
	}


