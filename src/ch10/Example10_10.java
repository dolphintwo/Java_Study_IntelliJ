package ch10;
import java.applet.*;import javax.swing.*;
import java.awt.*;import java.awt.event.*;
class Panel1 extends JPanel{
    JTextField text1,text2,text3;
    Panel1(){//���췽����������Panel����ʱ��Panel����ʼ��Ϊ��������ǩ
        //�����ı��򣬲���ΪGridLayout(1,6)
        text1=new JTextField(10);text2=new JTextField(10);
        text3=new JTextField(10);setLayout(new GridLayout(1,6));
        add(new JLabel("��ʼ��",JLabel.RIGHT));add(text1);
        add(new JLabel("��ֹ��",JLabel.RIGHT));add(text2);
        add(new JLabel("����",JLabel.RIGHT));add(text3);
    }
}
class Panel2 extends JPanel{//��չPanel��
    JTextArea text;JButton Button;
    Panel2(){//���췽����������Panel����ʱ��Panel����ʼ��Ϊ��һ����ǩ
        //һ���ı��򣬲���ΪGridLayout(1,4)
        text=new JTextArea(4,10);text.setLineWrap(true);
        JScrollPane jsp=new JScrollPane(text);
        Button=new JButton("��ʼ����");
        setLayout(new GridLayout(1,4));
        add(new JLabel("��������",JLabel.RIGHT));
        add(jsp);
        add(new Label());add(Button);
    }
}
public class Example10_10 extends Applet implements ActionListener{
    Panel1 panel1;Panel2 panel2;
    public void init(){
        setLayout(new GridLayout(3,1));
        setSize(400,200);panel1=new Panel1();panel2=new Panel2();
        add(new JLabel("�������ʼ������ֹ�������ӱ�������",JLabel.CENTER));
        add(panel1);add(panel2);
        (panel2.Button).addActionListener(this);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==(panel2.Button)){
            long n1,n2,f,count=0;
            n1=Long.parseLong(panel1.text1.getText());
            n2=Long.parseLong(panel1.text2.getText());
            f=Long.parseLong(panel1.text3.getText());
            for(long i=n1;i<=n2;i++){
                if(i%f==0)
                panel2.text.append(String.valueOf(i)+"");
           }
        }
    }
}