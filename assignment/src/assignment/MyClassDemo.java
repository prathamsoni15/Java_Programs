package assignment;

public class MyClassDemo {
	
	
	   public static void main(String[] args)
	   {
	        Que1 myObject1 = new Que1(5);
	        Que1 myObject2 = new Que1(7);  
	        
	        myObject1.printX();
	        myObject1.incrementCount();
	        Que1.incrementCount();
	        myObject1.printCount();
	        myObject2.printCount();
	        myObject2.printX();
	        myObject1.setX(14);
	        myObject1.incrementCount();
	        myObject1.printX();
	        myObject1.printCount();
	        myObject2.printCount();	   }
	   
	   
	

}
