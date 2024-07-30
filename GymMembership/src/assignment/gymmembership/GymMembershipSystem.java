package assignment.gymmembership;

public class GymMembershipSystem {

	public static void main(String[] args) {

		BasicMembership b = new BasicMembership();
		StandardMembership s = new StandardMembership();
		PremiumMembership p = new PremiumMembership();
		
		b.displayMembershipDetails();
		System.out.println("Fees : " + b.calculateMembershipFee());
    
		s.displayMembershipDetails();
        System.out.println(s.calculateMembershipFee());
		
		p.displayMembershipDetails();
        System.out.println(p.calculateMembershipFee());
	}

}
