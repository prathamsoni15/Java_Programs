package employees;

public class Developer extends Employee {

	private String Language;

    public Developer(String name, int employeeId, int salary, String Language) {
        super(name, employeeId, salary);
        this.Language = Language;
    }
	
	public String getLanguage() {
		return Language;
	}

	public void setLanguage(String language) {
		Language = language;
	}

	@Override
	public String toString() {
		return "Developer [Language=" + Language + "]";
	}
	
}
