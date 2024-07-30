package exam;

public class exception {

	public static void main(String[] args) {

        try {
            int[] numbers = {1, 2, 3};
            System.out.println("Element at index 5: " + numbers[5]); 
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught Exception");
        } finally {
            System.out.println("Finally block executed");
        }
    }
		
	
}
