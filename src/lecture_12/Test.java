package lecture_12;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

class MyFrame extends JFrame {
	public MyFrame() {
		this.setTitle("Окно в мир!!!");
		this.setSize(640, 480);
		this.setVisible(true);
	}
}

public class Test {
	public static void main(String[] args) {
		//SwingUtilities.invokeLater(() -> new MyFrame());
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new MyFrame();
			}
		};
		
		
	}
}
