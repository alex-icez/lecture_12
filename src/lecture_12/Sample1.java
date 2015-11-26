package lecture_12;

import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;


class Panel extends JPanel {
	int x, y;
	public Panel() {
		MyListener l = new MyListener(this);
		this.addMouseMotionListener(l);
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

class MyListener implements MouseMotionListener {
	Panel panel;
	public MyListener(Panel panel) {
		this.panel = panel;
	}
	
	public void mouseDragged(MouseEvent e) {
	}
	

	public void mouseMoved(MouseEvent e) {
		panel.x = e.getX();
		panel.y = e.getY();
		panel.repaint();
	}	
}

public class Sample1 {
	public static void main(String[] args) {
		new Frame();
	}
}
