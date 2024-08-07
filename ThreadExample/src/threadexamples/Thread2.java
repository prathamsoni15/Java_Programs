package threadexamples;

public class Thread2 implements Runnable {
	
	public void run() {
		
		for(int i=100;i<200; i++) {
			System.out.println(i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}

}
