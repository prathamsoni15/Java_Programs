package interfaceexamples;

public class DemoInterface {

	public static void main(String[] args) {

		Car c = new Car();
		c.getName();
		System.out.println(c.speed);
		c.display();
		
		Vehicle.getType();
	}

}
