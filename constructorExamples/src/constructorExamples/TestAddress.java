package constructorExamples;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestAddress {

	public static void main(String[] args) {
	
		Student s = new Student();
		
//		s.setName("Pratham");
		System.out.println(s);

		Student s1 = new Student("Pratham");
		System.out.println(s1);
		
//		Address ad = new Address();
//		
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		System.out.println("Enter Society Name: ");
//		String sname; 
//		try {
//			sname = br.readLine();
//			ad.setSocietyName(sname);
//			
//			System.out.println("Enter Pincode: ");
//			int pin = Integer.parseInt(br.readLine());
//			ad.setPincode(pin);
//			System.out.println(ad);
//		}
//		
//		catch(IOException e) {
//			e.printStackTrace();
//		}
	
		
//		ad.setSocietyName("abc");
//		ad.setPincode(123);
//		ad.setArea("Satellite");
//		System.out.println(ad);
		
//		Address ad1 = new Address("ahm", "xyz", 123);
//		System.out.println(ad1);

	
	}
}
