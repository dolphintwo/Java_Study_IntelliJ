package ch10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Example10_03 {
	public static void main(String[] args) {
		ButtonDemo myButtonGUI = new ButtonDemo();// ������������ť����
		myButtonGUI.setVisible(true);
	}
}

class ButtonDemo extends JFrame implements ActionListener {
	public static final int Width = 250;
	public static final int Height = 200;

	ButtonDemo() {
		setSize(Width, Height);
		setTitle("��ť�¼�����");
		Container conPane = getContentPane();
		conPane.setBackground(Color.BLUE);
		conPane.setLayout(new FlowLayout());// ����FlowLayout����
		JButton redBut = new JButton("Red");
		redBut.addActionListener(this);// ��Red��ťע�������
		conPane.add(redBut);// �ڴ������Red��ť
		JButton greenBut = new JButton("Green");
		greenBut.addActionListener(this);// ��Green��ťע�������
		conPane.add(greenBut);// �ڴ������Green��ť
	}

	public void actionPerformed(ActionEvent e) {// ʵ�ֽӿڴ����¼��ķ���
		Container conPane = getContentPane();
		if (e.getActionCommand().equals("Red"))// ��Red��ť�¼�
			conPane.setBackground(Color.RED);
		else if (e.getActionCommand().equals("Green"))// ��Green��ť�¼�
			conPane.setBackground(Color.GREEN);
		else {
		}
	}
}