package assignment.gymmembership;

public class StandardMembership implements membership {
	private double fee = 5000; 
	
	public void displayMembershipDetails() {
		System.out.println("Access to Cardio & Weightlifting Equipments..");
	}
	
	public double calculateMembershipFee() {
		return fee;
	}

}
