package exam;

public class mainclass {

	public static void main(String[] args) {

		
		  Q2_A strOps = new Q2_A("Hello");
	        
	        int length = strOps.getLength();
	        System.out.println("Length of the string: " + length);
	        
	        String upperCaseStr = strOps.toUpperCase();
	        System.out.println("Uppercase : " + upperCaseStr);
	        
	        String lowerCaseStr = strOps.toLowerCase();
	        System.out.println("Lowercase : " + lowerCaseStr);
	        
	        String replacedStr = strOps.replaceString("Hello", "Hi");
	        System.out.println("Replace: " + replacedStr);
	        
	        int index = strOps.findIndex("Hello");
	        System.out.println("Index': " + index);
	}

}
