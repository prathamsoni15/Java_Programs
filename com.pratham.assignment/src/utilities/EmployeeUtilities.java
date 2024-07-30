package utilities;

import employees.Developer;
import employees.Employee;
import employees.Manager;

public class EmployeeUtilities {

	public static void EmployeeDetails(Employee emp) {
		System.out.println("Employee Name: " + emp.getName());
		System.out.println("Employee Id: " + emp.getEmployeeId());
		System.out.println("Employee Salary: " + emp.getSalary());
		
	       if (emp instanceof Manager) {
	            System.out.println("Department: " + ((Manager) emp).getDepartment());
	        } else if (emp instanceof Developer) {
	            System.out.println("Programming Language: " + ((Developer) emp).getLanguage());
	        }
	}
	
    public static void increaseSalary(Employee employee, double percentage) {
        int newSalary = (int) (employee.getSalary() + (employee.getSalary() * percentage / 100));
        employee.setSalary(newSalary);
    }
	
}
