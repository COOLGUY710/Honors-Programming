import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class ColorFrameTest {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setTitle("Color Frame Test");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 200);
		frame.setVisible(true);
		JPanel colorPanel = new JPanel();
		frame.add(colorPanel,BorderLayout.CENTER);
		ColorFrame newpath = new ColorFrame(frame,colorPanel);
		newpath.createButtonPanel(frame,colorPanel);
		newpath.createMenues(frame,colorPanel);
	}

}
