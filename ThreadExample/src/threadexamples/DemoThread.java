package threadexamples;

public class DemoThread {

	public static void main(String[] args) throws InterruptedException {

		System.out.println("All thread are running");
		Thread1 thj = new Thread1();
		
		System.out.println(thj.getName()); 
		
		thj.start();
		thj.join();
		
		Thread2 th2 = new Thread2();
		Thread th = new Thread(th2);
		th.start();
		
	
	}
}