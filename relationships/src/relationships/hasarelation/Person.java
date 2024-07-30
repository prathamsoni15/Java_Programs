package relationships.hasarelation;

public class Person {
	
	private String pname,pemail;
	private Address addr;
	// Has A Relation -- person has address
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getPemail() {
		return pemail;
	}
	public void setPemail(String pemail) {
		this.pemail = pemail;
	}
	public Address getAddr() {
		return addr;
	}
	public void setAddr(Address addr) {
		this.addr = addr;
	}
	@Override
	public String toString() {
		return "Person [pname=" + pname + ", pemail=" + pemail + ", addr=" + addr + "]";
	}
	
	
	

}
