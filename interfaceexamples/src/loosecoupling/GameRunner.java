package loosecoupling;

public class GameRunner {
	
	//Mario m;
	GameLauncher gl;
	
	public GameRunner(GameLauncher gl) {
		this.gl = gl;
	}


	public void runGame() {
		gl.left();
		gl.right();
		gl.up();
		gl.down();
		
	}

}
