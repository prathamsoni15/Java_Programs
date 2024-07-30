package constructorExamples;

public class Address {
	
	String SocietyName, Area;
	int Pincode;
	
	public Address() {
		
		this.SocietyName = "test";
		this.Area = "Satellite";
		this.Pincode  = 123;
	}
	
	public Address(String societyName, String area, int pincode) {

		this.SocietyName = societyName;
		Area = area;
		Pincode = pincode;
	}

	public String getSocietyName() {
		return SocietyName;
	}

	public void setSocietyName(String societyName) {
		SocietyName = societyName;
	}

	public String getArea() {
		return Area;
	}

	public void setArea(String area) {
		Area = area;
	}

	public int getPincode() {
		return Pincode;
	}

	public void setPincode(int pincode) {
		Pincode = pincode;
	}

	@Override
	public String toString() {
		return "Address [SocietyName=" + SocietyName + ", Area=" + Area + ", Pincode=" + Pincode + "]";
	}

	
	
}
