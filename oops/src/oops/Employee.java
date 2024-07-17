package oops;

public class Employee {
	
	private String Name;
	private String Email;
	private String Address;
	private String Designation;
	private int Salary;
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getDesignation() {
		return Designation;
	}
	public void setDesignation(String designation) {
		Designation = designation;
	}
	public int getSalary() {
		return Salary;
	}
	public void setSalary(int salary) {
		Salary = salary;
	}
	
	
	@Override
	public String toString() {
		return "Employee [Name=" + Name + ", Email=" + Email + ", Address=" + Address + ", Designation=" + Designation
				+ ", Salary=" + Salary + "]";
	}

	
	
	
}
