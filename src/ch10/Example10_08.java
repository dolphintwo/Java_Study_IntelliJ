package ch10;

import java.applet.*;
import javax.swing.*;
import java.awt.event.*;

public class Example10_08 extends Applet {
	static JTextField text1, text2;
	Sqr s = new Sqr();// ����������

	public void init() {
		text1 = new JTextField(10);
		text2 = new JTextField(10);
		add(text1);
		add(text2);
		text1.addActionListener(s);// ��Sqr��ʵ��s��Ϊtext1�ļ�����
	}
}

class Sqr implements ActionListener {
	public void actionPerformed(ActionEvent e) {// ʵ�ֽӿ�ActionListener
		if (e.getSource() == Example10_08.text1) {
			long n = Long.parseLong(Example10_08.text1.getText());
			// ��text1���ı�ת����long������
			Example10_08.text2.setText(String.valueOf(n * n));
			// ��n*nת��Ϊ�ַ���
		} else {
		}
	}
}