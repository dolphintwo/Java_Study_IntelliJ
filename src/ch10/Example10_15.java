package ch10;
import java.applet.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class MyWindow4 extends JFrame implements ActionListener{
    private JButton button1,button2;
    private static int flg=0;
    private static JTextField text1,text2;
    MyWindow4(String s){
        super(s);
        Container con = this.getContentPane();
        con.setLayout(new GridLayout(2,2));
        this.setSize(200,100);
        this.setLocation(100,100);
        button1 = new JButton("选择水果");
        button2 = new JButton("选择食品");
        button1.addActionListener(this);
        button2.addActionListener(this);
        text1 = new JTextField(20);
        text2 = new JTextField(20);
        con.add(button1);
        con.add(button2);
        con.add(text1);
        con.add(text2);
        this.setVisible(true);
        this.pack();
    }
    public static void returnName(String s){
        if(flg ==1)
            text1.setText("选择的水果是："+s);
        else if(flg == 2)
            text2.setText("选择的食品是："+s);
    }
    public void actionPerformed(ActionEvent e){
        MyDialog dialog;
        if(e.getSource()==button1){
            dialog = new MyDialog(this,"水果");
            dialog.setVisible(true);
            flg =1;
        }
        else if(e.getSource()==button2){
            dialog =new MyDialog(this,"食品");
            dialog.setVisible(true);
            flg=2;
        }
    }
}
class MyDialog extends JDialog implements ActionListener{
    JLabel title;
    JTextField text;
    JButton done;
    MyDialog(JFrame F,String s){
        super(F,s,true);//模态
        Container con = this.getContentPane();
        title = new JLabel("输入"+s+"名称");
        text = new JTextField(10);
        text.setEditable(true);
        con.setLayout(new FlowLayout());
        con.setSize(200,100);
        setModal(false);
        done = new JButton("确定");
        done.addActionListener(this);
        con.setVisible(true);
        this.pack();
    }
    public void actionPerformed(ActionEvent e){
        MyWindow4.returnName(text.getText());
        setVisible(false);
        dispose();
    }
}
public class Example10_15 extends Applet{
    MyWindow4 window;
    MyDialog dialog;
    public void init(){
        window = new MyWindow4("带对话框窗口");
    }
}