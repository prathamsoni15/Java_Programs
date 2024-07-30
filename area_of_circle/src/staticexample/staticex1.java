package staticexample;

public class staticex1 {

	static String msg = "Pratham Soni";
	static int cnt=0;
	int i = 0;
	
	public staticex1 () {
		i++;
		cnt++;
	}
	
	static {
		System.out.println("Static block");
	}

	
	public static void getData() {
		
		System.out.println(cnt);
		//System.out.println(i);
		
	}
	
	@Override
	public String toString() {
		return "staticex1 [i=" + i + "]";
	}
	
	
	
}
