import employees.Developer;
import employees.Manager;
import utilities.EmployeeUtilities;

public class AssignmentMain {

	public static void main(String[] args) {


		Manager Man = new Manager("Pratham", 001, 10000, "IT");
		Developer De = new Developer("ABC", 002, 50000, "Java");
		
        // Use EmployeeUtilities methods to perform operations
        EmployeeUtilities.EmployeeDetails(Man);
        EmployeeUtilities.EmployeeDetails(De);

        // Increase salary
        EmployeeUtilities.increaseSalary(Man, 10);
        EmployeeUtilities.increaseSalary(De, 15);
		

        System.out.println("\nAfter salary increase:");
        EmployeeUtilities.EmployeeDetails(Man);
        EmployeeUtilities.EmployeeDetails(De);
	}

}
