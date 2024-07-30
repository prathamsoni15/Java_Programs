package assignment.gymmembership;

public class BasicMembership implements membership {
	
	private double fee = 2500;
	
	public void displayMembershipDetails() {
		System.out.println("Cardio Equipments only..");
	}

	public double calculateMembershipFee() {
		return fee;
	}
	
}
