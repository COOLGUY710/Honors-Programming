import javax.swing.JFrame;

public class ColorFrameTest {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setTitle("Color Frame Test");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 200);
		frame.setVisible(true);
		ColorFrame newpath = new ColorFrame(frame);
		newpath.createButtonPanel(frame);
		newpath.createMenues(frame);
	}

}
