package ch10;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Example10_13 {
	public static void main(String args[]) {
		ComboBoxDemo mycomboBoxGUI = new ComboBoxDemo();
	}
}

class ComboBoxDemo extends JFrame implements ActionListener, ItemListener {
	public static final int Width = 350;
	public static final int Height = 150;
	String proList[] = { "������", "������", "������" };
	JTextField text;
	JComboBox comboBox;

	public ComboBoxDemo() {
		setSize(Width, Height);
		setTitle("��Ͽ�ʹ��ʾ�����");
		Container conPane = getContentPane();
		conPane.setBackground(Color.BLUE);
		conPane.setLayout(new FlowLayout());
		comboBox = new JComboBox(proList);
		comboBox.addActionListener(this);
		comboBox.addItemListener(this);
		comboBox.setEditable(true);// ��Ӧ��������
		conPane.add(comboBox);
		text = new JTextField(10);
		conPane.add(text);
		this.setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == comboBox)
			text.setText(comboBox.getSelectedItem().toString());
	}

	public void itemStateChanged(ItemEvent e) {
		if (e.getSource() == comboBox) {
			text.setText(comboBox.getSelectedItem().toString());
		}
	}
}