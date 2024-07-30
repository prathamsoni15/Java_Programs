package loosecoupling;

public class DemoGame {

	public static void main(String[] args) {
		
		GameLauncher g;
		g = new SuperMan();
		
		// TODO Auto-generated method stub
		GameRunner gm = new GameRunner(g);
		gm.runGame();
	}

}
