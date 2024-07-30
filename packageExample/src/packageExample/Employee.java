package packageExample;

public class Employee {

	private String ename;
	private Designation desg;
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public Designation getDesg() {
		return desg;
	}
	public void setDesg(Designation desg) {
		this.desg = desg;
	}
	@Override
	public String toString() {
		return "Employee [ename=" + ename + ", desg=" + desg + "]";
	}
	
	
	
}
