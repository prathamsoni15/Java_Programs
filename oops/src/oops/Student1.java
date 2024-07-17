package oops;

public class Student1 {
	
	private int rollno;
	private String name;
	
	public void setRollno(int rollno) {
		this.rollno  = rollno;
	}
	
	public int getRollno() {
		return this.rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	Student1 s11 = new Student1();{
	s11.setRollno(12);
	s11.setName("Pratham");
	System.out.println(s11);
	}
	
	
}
