package lecture_12;

import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;



class Gnome extends JFrame {
	private JLabel label1;
	private JButton button1;
	public Gnome() {
		setTitle("Gnome");
		setSize(640, 480);
		setLayout(new FlowLayout());
		label1 = new JLabel("Hello World", 
				new ImageIcon("/home/sasha/Картинки/1--69/5.jpg"), 
				JLabel.HORIZONTAL);
		add(label1);
		button1 = new JButton("Start");
		
		add(button1);
		setVisible(true);
	}
}

public class Sample2 {
	public static void main(String[] args) {
		new Gnome();
	}
}
