import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class ColorFrame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ColorFrame(JFrame colorFrame,JPanel colorPanel) {
		
		colorPanel.setBackground(Color.YELLOW);
	}

	public void createButtonPanel(JFrame colorFrame,JPanel colorPanel) {
		JPanel buttons = new JPanel();
		colorFrame.add(buttons, BorderLayout.SOUTH);
		buttons.add(makeButton("Red", Color.RED,colorPanel));
		buttons.add(makeButton("Blue", Color.BLUE,colorPanel));
		buttons.add(makeButton("Green", Color.GREEN,colorPanel));

	}

	public JButton makeButton(String label,final Color color, final JPanel colorPanel) {
		JButton button = new JButton(label);
		class MenuButtonListener implements ActionListener {
			public void actionPerformed(ActionEvent event) {
				System.out.println(color);
				colorPanel.setBackground(color);
			}
		}
		ActionListener listener = new MenuButtonListener();
		button.addActionListener(listener);
		return button;
	}

	public JMenuItem makeMenuItem(String label, final Color color,final JPanel colorPanel) {
		JMenuItem item = new JMenuItem(label);
		class MenuItemListener implements ActionListener {
			public void actionPerformed(ActionEvent event) {
				if (color == Color.YELLOW)
					makeCustomAction();
				else
					colorPanel.setBackground(color);
				System.out.println(color);
			}
		}
		ActionListener listener = new MenuItemListener();
		item.addActionListener(listener);
		return item;
	}

	public void createMenues(JFrame colorFrame,JPanel colorPanel) {
		JMenuBar menuBar = new JMenuBar();
		// colorFrame.add(menuBar);
		colorFrame.setJMenuBar(menuBar);
		JMenu menu = new JMenu("Background Color");
		menuBar.add(menu);
		menu.add(makeMenuItem("White", Color.WHITE,colorPanel));
		menu.add(makeMenuItem("Black", Color.BLACK,colorPanel));
		menu.add(makeMenuItem("Custom", Color.YELLOW,colorPanel));
	}



	

	public void makeCustomAction() {
		CustomFrame pathway = new CustomFrame(colorPanel);

	}

	private CustomFrame custom;
}