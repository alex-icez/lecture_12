package lecture_12;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Stroke;
import java.util.Arrays;
import java.util.Comparator;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

class MyPanel extends JPanel {
	public void paintComponent(Graphics g) {
		super.paintComponents(g);
		Graphics2D g2 = (Graphics2D)g;
		g2.setStroke(new BasicStroke(4));
		g.setColor(new Color(getWidth() % 256, getWidth() % 256, getHeight() % 256));
		g.fillRect(10, 10, getWidth() / 4, getHeight() / 4);
		g.drawString("Hello World", getWidth() / 4, getHeight() / 4);	
		
		
	}
}

class MyFrame extends JFrame {
	MyPanel panel;
	
	public MyFrame() {
		setTitle("Окно в мир!!!");
		setSize(640, 480);
		panel = new MyPanel();
		setBackground(new Color(0,0,255,100));
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
