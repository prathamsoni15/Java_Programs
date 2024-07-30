package assignment.gymmembership;

public class PremiumMembership implements membership {
	private double fee = 10000;
	
	public void displayMembershipDetails() {
		System.out.println("Access to all Gym Facilities, including Cardio, Weightlifting, and Group Classes..");
	}
	
	public double calculateMembershipFee() {
		return fee;
	}
	

}
