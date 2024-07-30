package staticexample;

public class DemoClass {

	public static void main(String[] args) {

		staticex1 se = new staticex1();
		System.out.println(staticex1.cnt + " " +  se);
		
		staticex1 se1 = new staticex1();
		System.out.println(staticex1.cnt + " " +  se1);
		
		staticex1 se2 = new staticex1();
		System.out.println(staticex1.cnt + " " +  se2);
		
		staticex1 se3 = new staticex1();
		System.out.println(staticex1.cnt + " " +  se3);

		staticex1.getData();
		
	}

}
