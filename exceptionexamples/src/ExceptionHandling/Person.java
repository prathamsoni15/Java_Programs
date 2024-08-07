package ExceptionHandling;

public class Person {
	
	private String name;
	private int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		try {
			if(age < 15)
			{
				throw new AgeValidatorException();
			}
			else {
				this.age = age;
			}
		}
		catch(AgeValidatorException ave)
		{
			System.out.println(ave);
		}
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
}