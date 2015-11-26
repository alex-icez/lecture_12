package lecture_12;

import javax.swing.JFrame;
import javax.swing.JPanel;


class Panel extends JPanel {
	int x, y;
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
