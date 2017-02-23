package ch10;

import javax.swing.*;

public class Example10_01 {
	public static void main(String[] args){
		JFrame nw = new JFrame("New Window");
		nw.setSize(250,200);
		JButton button = new JButton("MButtun");
		nw.getContentPane().add(button);
		nw.setVisible(true);
	}
}
