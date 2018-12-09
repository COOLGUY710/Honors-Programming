import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
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

	public ColorFrame(JFrame colorFrame) {
		JPanel colorPanel = new JPanel();
		colorFrame.add(colorPanel, BorderLayout.CENTER);

	}

	public void createButtonPanel(JFrame colorFrame) {
		JPanel buttons = new JPanel();
		colorFrame.add(buttons, BorderLayout.SOUTH);
		buttons.add(makeButton("Red", 1));
		buttons.add(makeButton("Blue", 2));
		buttons.add(makeButton("Green", 3));

	}

	public JButton makeButton(String label, int color) {
		JButton button = new JButton(label);
		class MenuButtonListener implements ActionListener {
			public void actionPerformed(ActionEvent event) {
				makeColorAction(color);
				System.out.println(color);
			}
		}
		ActionListener listener = new MenuButtonListener();
		button.addActionListener(listener);
		return button;
	}

	public JMenuItem makeMenuItem(String label, int color) {
		JMenuItem item = new JMenuItem(label);
		class MenuItemListener implements ActionListener {
			public void actionPerformed(ActionEvent event) {
				if (color == 6)
					makeCustomAction();
				else
					makeColorAction(color);
				System.out.println(color);
			}
		}
		ActionListener listener = new MenuItemListener();
		item.addActionListener(listener);
		return item;
	}

	public void createMenues(JFrame colorFrame) {
		JMenuBar menuBar = new JMenuBar();
		// colorFrame.add(menuBar);
		colorFrame.setJMenuBar(menuBar);
		JMenu menu = new JMenu("Background Color");
		menuBar.add(menu);
		menu.add(makeMenuItem("White", 4));
		menu.add(makeMenuItem("Black", 5));
		menu.add(makeMenuItem("Custom", 6));
	}

	public void paintComponent(Graphics g) {
		super.paintComponents(g);
		Graphics2D g2 = (Graphics2D) g;
		g2.setBackground(ggg);
		colorPanel.setBackground(ggg);
	}

	public void makeColorAction(int color) {
		if (color == 1) {
			ggg = Color.RED;
		} else if (color == 2) {
			ggg = Color.BLUE;
		} else if (color == 3) {
			ggg = Color.GREEN;
		} else if (color == 4) {
			ggg = Color.WHITE;
		} else if (color == 5) {
			ggg = Color.BLACK;
		}
		colorPanel.setBackground(ggg);
	}

	public void makeCustomAction() {
		CustomFrame pathway = new CustomFrame(colorPanel);

	}

	private JPanel colorPanel;
	private CustomFrame custom;

	private Color ggg;
}