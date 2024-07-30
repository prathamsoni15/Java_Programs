package interfaceexamples;

public interface Vehicle {
	// Variable -- Static and final
	int speed = 100; //Final and static
	 void getName(); //Public and abstract

	 default void display() {
		 System.out.println("Default Interface");
	 }
	 
	 public static int getType() {
		 return 0;
	 }

}
