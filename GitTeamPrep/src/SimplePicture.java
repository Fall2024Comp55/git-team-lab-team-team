import acm.graphics.GImage;
import acm.graphics.GLabel;
import acm.program.GraphicsProgram;
// hello everbody i edited the file 
public class SimplePicture extends GraphicsProgram {
	private static final String PNG_FILE = "robot.png";
	public static int SIZE = 700;
	
	public void init() {
		setSize(SIZE, SIZE);
	}
	
	public void run() {
		GImage robot = new GImage(PNG_FILE, 200, 100);
		add(robot);
		GLabel label = new GLabel("How I feel when using github hackslash! BAD!!!", 200, 400);
		add(label);
	}
	
	public static void main(String[] args) {
		new SimplePicture().start();
	}
}