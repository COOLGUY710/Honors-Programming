import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class CustomFrame extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CustomFrame(JPanel pan) {
		JPanel panel1 = pan;
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(4, 3));
		panel.setVisible(true);
		JFrame controlframe = new JFrame();
		controlframe.add(panel, BorderLayout.CENTER);
		JLabel red = new JLabel("Amount Red:");
		JLabel green = new JLabel("Amount Green:");
		JLabel blue = new JLabel("Amount Blue:");
		JTextField redtext = new JTextField();
		JTextField greentext = new JTextField();
		JTextField bluetext = new JTextField();
		panel.add(red, SwingConstants.RIGHT);
		panel.add(redtext);
		panel.add(green, SwingConstants.RIGHT);
		panel.add(greentext);
		panel.add(blue, SwingConstants.RIGHT);
		panel.add(bluetext);

		JPanel checkerpanel = new JPanel();
		checkerpanel.setLayout(new GridLayout(2, 1));
		controlframe.add(checkerpanel, BorderLayout.SOUTH);
		JLabel values = new JLabel("Values Must Be In Range: 0 to 1");
		checkerpanel.add(values);
		JButton ok = new JButton();
		checkerpanel.add(ok);
		/*
		 * public void paintComponent(Graphics g, Color custom) {
		 * super.paintComponent(g); Graphics2D g2 = (Graphics2D)g;
		 * g2.setBackground(custom); }
		 */
		class OKButtonListener implements ActionListener {
			public void actionPerformed(ActionEvent event) {
				float gggg = (float) Double.parseDouble(redtext.getText());
				float gg = (float) Double.parseDouble(greentext.getText());
				float ggg = (float) Double.parseDouble(bluetext.getText());
				if ((gggg < 1) && (gg < 1) && (ggg < 1)) {
					Color custom = new Color(gggg, gg, ggg);
					panel1.setBackground(custom);
				} else
					JOptionPane.showMessageDialog(null, "Listen bub, dont mess with me....");
			}
		}
		ActionListener listener = new OKButtonListener();
		ok.addActionListener(listener);
	}

}
