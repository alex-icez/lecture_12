package lecture_12;

import java.util.Arrays;
import java.util.Comparator;

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
			public void run() {
				new MyFrame();
			}
		});
	//	Integer arr[] = {1,2,3,4,5};
	//	Arrays.sort(arr, (a, b) -> b - a);
		
	}
}
