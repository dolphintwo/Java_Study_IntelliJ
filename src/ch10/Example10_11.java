package ch10;

import java.applet.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Panel3 extends JPanel {
	JRadioButton box1, box2, box3;
	ButtonGroup g;

	Panel3(){
        setLayout(new GridLayout(1,3));
        g = new ButtonGroup();
        box1 = new JRadioButton(MyWindow1.fName[0]+"�����",false);
        box2 = new JRadioButton(MyWindow1.fName[1]+"�����",false);
        box3 = new JRadioButton(MyWindow1.fName[2]+"�����",false);
        g.add(box1);g.add(box2);g.add(box3);
        add(box1);add(box2);add(box3);
        add(new JLabel("�����3ѡ1") );
    }
}

class Panel4 extends JPanel {
	JCheckBox box1, box2, box3;
	ButtonGroup g;

	Panel4() {
		setLayout(new GridLayout(1, 3));
		g = new ButtonGroup();
		box1 = new JCheckBox("����1̨ ");
		box2 = new JCheckBox("����2̨ ");
		box3 = new JCheckBox("����3̨ ");
		g.add(box1);
		g.add(box2);
		g.add(box3);
		add(box1);
		add(box2);
		add(box3);
		add(new JLabel(" ѡ��1��2��3"));
	}
}

class MyWindow1 extends JFrame implements ItemListener {
	Panel3 panel3;
	Panel4 panel4;
	JLabel label1, label2;
	JTextArea text1, text2;
	static String fName[] = { "HP", "IBM", "DELL" };
	static double priTbl[][] = { { 1.20, 1.15, 1.10 }, { 1.70, 1.65, 1.60 }, { 1.65, 1.60, 1.58 } };
	static int production = -1;

	MyWindow1(String s) {
		super(s);
		Container con = this.getContentPane();
		con.setLayout(new GridLayout(3, 2));
		this.setLocation(100, 100);
		this.setSize(400, 100);
		panel3 = new Panel3();
		panel4 = new Panel4();
		label1 = new JLabel("��Ʒ����", JLabel.CENTER);
		label2 = new JLabel("��Ʒ�۸�", JLabel.CENTER);
		text1 = new JTextArea();
		text2 = new JTextArea();
		con.add(label1);
		con.add(label2);
		con.add(panel3);
		con.add(panel4);
		con.add(text1);
		con.add(text2);
		panel3.box1.addItemListener(this);
		panel3.box2.addItemListener(this);
		panel3.box3.addItemListener(this);
		panel4.box1.addItemListener(this);
		panel4.box2.addItemListener(this);
		panel4.box3.addItemListener(this);
		this.setVisible(true);
		this.pack();
	}

	public void itemStateChanged(ItemEvent e) { // ѡ��״̬�Ѹı�
		if (e.getItemSelectable() == panel3.box1) { // ��ȡ��ѡ��
			production = 0;
			text1.setText(fName[0] + "��˾����");
			text2.setText("");
		} else if (e.getItemSelectable() == panel3.box2) {
			production = 1;
			text1.setText(fName[1] + "��˾����");
			text2.setText("");
		} else if (e.getItemSelectable() == panel3.box3) {
			production = 2;
			text1.setText(fName[2] + "��˾����");
			text2.setText("");
		} else {
			if (production == -1)
				return;
			if (e.getItemSelectable() == panel4.box1) {
				text2.setText("" + priTbl[production][0] + "��Ԫ/̨");
			} else if (e.getItemSelectable() == panel4.box2) {
				text2.setText("" + priTbl[production][1] + "��Ԫ/̨");
			} else if (e.getItemSelectable() == panel4.box3) {
				text2.setText("" + priTbl[production][2] + "��Ԫ/̨");
			}
		}
	}
}

public class Example10_11 extends Applet {
	MyWindow1 myWin = new MyWindow1("ѡ����Ŀ����ʾ������");
}