package lecture_12;

import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;


class Panel extends JPanel {
	int x, y;
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawString("(" + x + ", " + y + ")", x, y);
	}
}

class Frame extends JFrame {
	public Frame() {
		setSize(640, 480);
		setVisible(true);
	}
}

public class Sample1 {
	public static void main(String[] args) {
		new Frame();
	}
}
