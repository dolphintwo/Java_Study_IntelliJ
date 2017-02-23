package ch10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MyWindow7 extends JFrame {
	public MyWindow7(String s) {
		super(s);
		Container con = this.getContentPane();
		con.setLayout(new BorderLayout());
		this.setLocation(100, 100);
		JScrollBar xAxis = new JScrollBar(JScrollBar.HORIZONTAL, 50, 1, 0, 100);
		JScrollBar yAxis = new JScrollBar(JScrollBar.VERTICAL, 50, 1, 0, 100);
		MyListener1 listener = new MyListener1(xAxis, yAxis, 238, 318);
		JPanel scrolledCanvas = new JPanel();
		scrolledCanvas.setLayout(new BorderLayout());
		scrolledCanvas.add(listener, BorderLayout.CENTER);
		scrolledCanvas.add(xAxis, BorderLayout.SOUTH);
		scrolledCanvas.add(yAxis, BorderLayout.EAST);
		con.add(scrolledCanvas, BorderLayout.NORTH);
		this.setVisible(true);
		this.pack();
	}

	public Dimension getPreferredSize() {
		return new Dimension(500, 300);
	}
}

class MyListener1 extends JComponent implements MouseListener, MouseMotionListener, AdjustmentListener {
	private int x, y;
	private JScrollBar xScrollBar;
	private JScrollBar yScrollBar;

	private void updateScrollBars(int x, int y) {
		int d;
		d = (int) (((float) x / (float) getSize().width) * 100.0);
		xScrollBar.setValue(d);
		d = (int) (((float) y / (float) getSize().height) * 100.0);
		yScrollBar.setValue(d);
	}

	public MyListener1(JScrollBar xaxis, JScrollBar yaxis, int x0, int y0) {
		xScrollBar = xaxis;
		yScrollBar = yaxis;
		x = x0;
		y = y0;
		xScrollBar.addAdjustmentListener(this);
		yScrollBar.addAdjustmentListener(this);
		this.addMouseListener(this);
		this.addMouseMotionListener(this);
	}

	public void paint(Graphics g) {
		g.setColor(getBackground());
		Dimension size = getSize();
		g.fillRect(0, 0, size.width, size.height);
		g.setColor(Color.blue);
		g.fillRect(x, y, 20, 20);
	}

	public void mouseEntered(MouseEvent e) {
	}

	public void mouseExited(MouseEvent e) {
	}

	public void mouseClicked(MouseEvent e) {
	}

	public void mouseReleased(MouseEvent e) {
	}

	public void mouseMoved(MouseEvent e) {
	}

	public void mousePressed(MouseEvent e) {
		x = e.getX();
		y = e.getY();
		updateScrollBars(x, y);
		repaint();
	}

	public void mouseDragged(MouseEvent e) {
		x = e.getX();
		y = e.getY();
		updateScrollBars(x, y);
		repaint();
	}

	public void adjustmentValueChanged(AdjustmentEvent e) {
		if (e.getSource() == xScrollBar)
			x = (int) ((float) (xScrollBar.getValue() / 100.0) * getSize().width);
		else if (e.getSource() == yScrollBar)
			y = (int) ((float) (yScrollBar.getValue() / 100.0) * getSize().height);
		repaint();
	}
}

public class Example10_18 {
	public static void main(String[] args) {
		MyWindow7 myWindow = new MyWindow7("滚动条示意程序");
	}
}