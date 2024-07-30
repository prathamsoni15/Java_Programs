package packageExample2;

import packageExample.Designation;
import packageExample.Employee;

public class DesgEmployee {

	public static void main(String[] args) {

		Designation dsg = new Designation();
		dsg.setDesg("Developer");
		
		Employee e1 = new Employee();
		e1.setEname("Pratham");
		e1.setDesg(dsg);
		
		System.out.println(e1);
		
		
	}

}
