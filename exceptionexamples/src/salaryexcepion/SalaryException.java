package salaryexcepion;

public class SalaryException extends Exception {

	public SalaryException() {
		System.out.println("Salary Should between 10000 to 15000");
	}
	
	public SalaryException(String name) {
		System.out.println(name);
	}
	
}
