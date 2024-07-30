package airfare;

public class Main {

	public static void main(String[] args) {

	       	AirIndia a = new AirIndia(8, 250.0);
	        KingFisher k = new KingFisher(4, 400.0);
	        Indigo i = new Indigo(5, 200.0);

	        System.out.println("AirIndia Amount: " + a.calculateAmount());
	        System.out.println("KingFisher Amount: " + k.calculateAmount());
	        System.out.println("Indigo Amount: " +  i.calculateAmount());
		
	}

}
