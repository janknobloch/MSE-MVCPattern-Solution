package de.tum.jk.creational.mvc.view;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

import de.tum.jk.creational.mvc.model.Model;

public class View {

	public JFrame frame;
	public JButton button;
	public JTextField textField;
	public Model m;

	public View(Model m) {
		this.m = m;
		initializeView();
	}

	private void initializeView() {
		frame = new JFrame();
		button = new JButton("CLICK ME");
		textField = new JTextField();
		textField.setHorizontalAlignment(JTextField.CENTER);
		frame.setLayout(new BorderLayout());
		frame.add(button, BorderLayout.SOUTH);
		frame.add(textField, BorderLayout.CENTER);
		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		// screen centered pop up.
		frame.setLocation(dim.width / 2 - frame.getSize().width / 2, dim.height / 2 - frame.getSize().height / 2);

	}
}
