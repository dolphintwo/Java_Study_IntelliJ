package ch10;
import java.applet.*;
import javax.swing.*;
class MyPanel extends JPanel{
    JButton button1,button2;
    JLabel Label;
    MyPanel(String s1,String s2,String s3){
        //Panel���󱻳�ʼ��Ϊ��������ť��һ���ı���
        button1=new JButton(s1);button2=new JButton(s2);
        Label=new JLabel(s3);
        add(button1);add(button2);add(Label);
    }
}
public class Example10_04 extends Applet{
    MyPanel panel1,panel2;
    JButton Button;
    public void init(){
        panel1=new MyPanel("ȷ��","ȡ��","��ǩ�����������1��");
        panel2=new MyPanel("ȷ��","ȡ��","��ǩ�����������2��");
        Button=new JButton("���ǲ�������еİ�ť");
        add(panel1);add(panel2);add(Button);
        setSize(300,200);
    }
}