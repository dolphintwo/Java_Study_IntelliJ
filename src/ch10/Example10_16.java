package ch10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MyScrollBar extends JScrollBar {

	public MyScrollBar(int init, int len, int low, int high) {
		super(JScrollBar.HORIZONTAL, init, len, low, high);
	}

	public Dimension getPerferredSize() {
		return new Dimension(125, 20);
	}
}

class MyWindow5 extends JFrame implements ActionListener, AdjustmentListener {
	private JButton button;
	private JTextField text;
	private boolean barOpened;

	MyWindow5(String s) {
		super(s);
		MyScrollBar tempBar = new MyScrollBar(10, 10, 0, 255);
		Container con = this.getContentPane();
		con.setLayout(new GridLayout(2, 1));
		this.setSize(200, 100);
		this.setLocation(100, 100);
		button = new JButton("开/闭滚动条");
		button.addActionListener(this);
		barOpened = false;
		tempBar.addAdjustmentListener(this);
		text = new JTextField("滚动条关闭", 20);
		con.add(button);
		con.add(text);
		con.add(tempBar);
		this.setVisible(true);
		this.pack();
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == button) {
			if (barOpened)
				text.setText("滚动条关闭");
			else
				text.setText("滚动条打开");
			barOpened = !barOpened;
		}
	}

	public void adjustmentValueChanged(AdjustmentEvent e) {
		if (barOpened) {
			MyScrollBar myBar = (MyScrollBar) e.getAdjustable();
			text.setText("选择的值是:" + myBar.getValue());
		}
	}
}

public class Example10_16 {
	public static void main(String[] args) {
		MyWindow5 myWindow = new MyWindow5("滚动条实例");
	}
}