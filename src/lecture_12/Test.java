package lecture_12;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Arrays;
import java.util.Comparator;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

class MyPanel extends JPanel {
	public void paintComponents(Graphics g) {
		super.paintComponents(g);
		g.setColor(Color.BLACK);
		g.drawRect(10, 10, 100, 100);
	}
	
}

class MyFrame extends JFrame {
	MyPanel panel;
	
	public MyFrame() {
		setTitle("Окно в мир!!!");
		setSize(640, 480);
		panel = new MyPanel();
		add(panel);
		setVisible(true);
		repaint();
	}
}

public class Test {
	public static void main(String[] args) {
		//SwingUtilities.invokeLater(() -> new MyFrame());
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new MyFrame();
			}
		});
	//	Integer arr[] = {1,2,3,4,5};
	//	Arrays.sort(arr, (a, b) -> b - a);
		
	}
}
