package salaryexcepion;

public class employee {
    
    private String name;
    private int salary;
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public int getSalary() {
        return salary;
    }
    
    public void setSalary(int salary) {
        try {
            if (salary >= 10000 && salary <= 15000) {
            	this.salary = salary;
            }
            else {
            	throw new SalaryException();
            }
            
        } catch (SalaryException e) {
            System.out.println(e.getMessage());
        }
    }
    
    @Override
    public String toString() {
        return "Employee [Name=" + this.name + ", Salary=" + salary + "]";
    }
}
