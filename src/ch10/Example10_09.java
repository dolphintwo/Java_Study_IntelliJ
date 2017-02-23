package ch10;

import java.util.*;
import java.applet.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Example10_09 extends Applet implements ActionListener {
	JTextArea textA;
	JTextField textF;
	JButton b1, b2;

	public void init() {
		setSize(250, 150);
		textA = new JTextArea("", 5, 10);
		textA.setBackground(Color.cyan);
		textF = new JTextField("", 10);
		textF.setBackground(Color.pink);
		b1 = new JButton("�� ��");
		b2 = new JButton("���¿�ʼ");
		textF.setEditable(false);
		b1.addActionListener(this);
		b2.addActionListener(this);
		add(textA);
		add(textF);
		add(b1);
		add(b2);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == b1) {
			String s = textA.getText();
			StringTokenizer tokens = new StringTokenizer(s);
			// ʹ��Ĭ�ϵķָ������ϣ��ո񡢻��С�Tab���ϻس����ָ���
			int n = tokens.countTokens(), sum = 0, i;
			for (i = 0; i <= n - 1; i++) {
				String temp = tokens.nextToken();// ���ı���ȡ��һ������
				sum += Integer.parseInt(temp);
			}
			textF.setText("" + sum);
		} else if (e.getSource() == b2) {
			textA.setText(null);
			textF.setText(null);
		}
	}
}