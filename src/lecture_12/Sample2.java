package lecture_12;

import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;



class Gnome extends JFrame {
	private JLabel label1;
	
	public Gnome() {
		setTitle("Gnome");
		setSize(640, 480);
		setLayout(new FlowLayout());
		label1 = new JLabel("Hello World", 
				new ImageIcon("/home/sasha/Картинки/1--69/59.jpg"), 
				JLabel.HORIZONTAL);
		add(label1);
		setVisible(true);
	}
}

public class Sample2 {
	public static void main(String[] args) {
		new Gnome();
	}
}
