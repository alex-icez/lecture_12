package lecture_12;

import javax.swing.JFrame;



class Gnome extends JFrame {
	public Gnome() {
		setTitle("Gnome");
		setSize(640, 480);
		
		
		setVisible(true);
	}
}

public class Sample2 {
	public static void main(String[] args) {
		new Gnome();
	}
}
