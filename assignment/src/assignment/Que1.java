package assignment;

public class Que1 {

		   private static int count = 0;
		   private int x;

		   public Que1(int i)
		   {
		      x = i;
		   }
		   public static void incrementCount()
		   {
		      count++;      
		   }

		   public void printX()
		   {
		      System.out.println("Value of x : "  + x);
		   }

		   public static void printCount()
		   {
		      System.out.println("Value of count : "  + count);
		   }
		    public void setX(int newX) {
		        x = newX;
		    }
		}



