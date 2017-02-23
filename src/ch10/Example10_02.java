package ch10;

import java.awt.*;
import javax.swing.*;

public class Example10_02 {
	public static MyWindowDemo mw1;
	public static MyWindowDemo mw2;

	public static void main(String[] args) {
		JButton butt1 = new JButton("Button1");
		String name1 = "First Window";
		String name2 = "Second Window";
		mw1 = new MyWindowDemo(name1, butt1, Color.blue, 200, 300);
		mw1.setVisible(true);
		JButton butt2 = new JButton("Button2");
		mw2 = new MyWindowDemo(name2, butt2, Color.red, 300, 200);
		mw2.setVisible(true);
	}
}

@SuppressWarnings("serial")
class MyWindowDemo extends JFrame {
	public MyWindowDemo(String name, JButton button, Color c, int w, int h) {
		super();
		setTitle(name);
		setSize(w, h);
		Container con = getContentPane();
		// con.add(button);
		con.setBackground(c);
	}
}