package de.tum.jk.creational.mvc;

import de.tum.jk.creational.mvc.controller.Controller;
import de.tum.jk.creational.mvc.model.Model;
import de.tum.jk.creational.mvc.view.View;

public class Main {
	public static void main(String[] args) {

		Model m = new Model();
		View v = new View(m);
		Controller c = new Controller(m, v);
		//https://tinyurl.com/MVCInitView

	}
}
