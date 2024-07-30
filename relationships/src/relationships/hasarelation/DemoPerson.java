package relationships.hasarelation;

public class DemoPerson {

	public static void main(String[] args) {
		
		Address addr = new Address();
		
		addr.setFlatno("C-10");
		addr.setSocietyname("ABC");
		addr.setArea("Paldi");
		addr.setPincode(123);
		
		Person p1 = new Person();
		
		p1.setPname("Pratham");
		p1.setPemail("abc@gmail.com");
		p1.setAddr(addr);
		
		System.out.println(p1);
		
		//Injecting object of address class to erson class
		//Dependency Injection
		
	}

}
