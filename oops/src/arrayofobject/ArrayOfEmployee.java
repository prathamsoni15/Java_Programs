package arrayofobject;
import java.util.*;
import oops.Employee;

public class ArrayOfEmployee {
	
	public void CreateArrayOfEmp() {
		Scanner sc = new Scanner(System.in);
		
		int[] no = new int[12];
		Employee[] emp = new Employee[10];
		
		
		for(int i=0; i<3; i++) {
			emp[i] = new Employee();
		}
		
		for(int k=0; k<3; k++) {
			
				System.out.println("Enter Name: ");
				emp[k].setName(sc.nextLine());
				System.out.println("Enter Designation: ");
				emp[k].setDesignation(sc.nextLine());
		}	
			
		for(int j=0; j<3; j++) {
			System.out.println(emp[j]);
			
		}
		
	}

}
