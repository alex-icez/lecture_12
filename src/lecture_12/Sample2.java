package lecture_12;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JTextField;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

class Gnome extends JFrame {
	private JLabel label1;
	private JButton button1;
	private JTextField textField1;
	private JCheckBox b1;
	private JList<Integer> list;
	
	
	
	
	public Gnome() {
		setTitle("Gnome");
		setSize(640, 480);
		setLayout(new FlowLayout());
		label1 = new JLabel("Hello World", 
				new ImageIcon("/home/sasha/Картинки/1--69/5.jpg"), 
				JLabel.HORIZONTAL);
		add(label1);
		button1 = new JButton("Start");
		button1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				label1.setText("Diaaaa!!!");
				label1.setIcon(new ImageIcon("/home/sasha/Картинки/1--69/49.jpg"));
			}
		});
		
		textField1 = new JTextField(50);
		textField1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				label1.setText(textField1.getText());
				textField1.setText("");
			}
		});
		add(textField1);
		
		b1 = new JCheckBox("Insert!!");
		b1.addActionListener(new ActionListener() {
			boolean f = false;
			public void actionPerformed(ActionEvent e) {
				f = !f;
				label1.setText(label1.getText() + " " + f);
			}
		});
		add(b1);
		Integer arr[] = {1,2,3,4,5,6,7};
		list = new JList<>(arr);
		
		list.addListSelectionListener(new ListSelectionListener() {
			@Override
			public void valueChanged(ListSelectionEvent e) {
				label1.setText("select" + list.getSelectedValue());
			}
		});;
		
		add(list);
		
		
		add(button1);
		setVisible(true);
	}
}

public class Sample2 {
	public static void main(String[] args) {
		new Gnome();
	}
}
