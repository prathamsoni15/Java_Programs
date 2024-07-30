package exam;

public class Q2_A {

	private String line;
	
	 public Q2_A(String line) {
	     this.line = line;
	 }
	 
	    public int getLength() {
	        return line.length();
	    }
	    
	    public String toUpperCase() {
	        return line.toUpperCase();
	    }
	    
	    public String toLowerCase() {
	        return line.toLowerCase();
	    }
	    
	    public String replaceString(String target, String replacement) {
	        return line.replace(target, replacement);
	    }
	    
	    public int findIndex(String substring) {
	        return line.indexOf(substring);
	    }
	
}
