package lecture_12;

import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
/*
class MyListener extends MouseAdapter {
	Panel panel;
	
	public MyListener(Panel panel) {
		this.panel = panel;
	}

	public void mouseMoved(MouseEvent e) {
		panel.x = e.getX();
		panel.y = e.getY();
		panel.repaint();
	}	
}*/

class Panel extends JPanel {
	int x, y;
	public Panel() {
		this.addMouseMotionListener(new MouseAdapter() {
			public void mouseMoved(MouseEvent e) {
				x = e.getX();
				y = e.getY();
				repaint();
			}
		});
	}
	
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawString("(" + x + ", " + y + ")", x, y);
	}
}

class Frame extends JFrame {
	Panel panel;
	
	public Frame() {
		setSize(640, 480);
		panel = new Panel();
		add(panel);	
		setVisible(true);
	}
}

public class Sample1 {
	public static void main(String[] args) {
		new Frame();
	}
}
