package lecture_12;

import java.awt.FlowLayout;

import javax.swing.JFrame;



class Gnome extends JFrame {
	public JLabel label1;
	
	public Gnome() {
		setTitle("Gnome");
		setSize(640, 480);
		setLayout(new FlowLayout());
		
		
		
		
		
		setVisible(true);
	}
}

public class Sample2 {
	public static void main(String[] args) {
		new Gnome();
	}
}
