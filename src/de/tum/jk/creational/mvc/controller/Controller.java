package de.tum.jk.creational.mvc.controller;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import de.tum.jk.creational.mvc.model.Model;
import de.tum.jk.creational.mvc.view.View;

public class Controller implements ActionListener {

	public Model m;
	public View v;

	public Controller(Model m, View v) {
		this.m = m;
		this.v = v;
		// Access the VIEW -> Button set Listener on Button to be
		// the controller (this) -> see actionPerformed below.
		v.button.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource().equals(v.button)) {
			// Count up in our model class M
			m.countUp();
			// Access Textfield in our view class V and set its Text to our
			// model counter
			v.textField.setText(Integer.toString(m.counter));

		}

	}

}
