package com.bensites.java.QuickMath.core.GUI

import javax.swing.*

class MainGui extends JFrame {
	public MainGui() {
		JLabel jlbHelloWorld = new JLabel("Hello World");
		add(jlbHelloWorld);
		this.setSize(100, 100);
		// pack();
		setVisible(true);
	}

}
