package ch10;
import java.applet.*;import java.awt.*;
import java.awt.event.*;import javax.swing.*;
class MyPanel2 extends JPanel{
    int x;JLabel label1;
    MyPanel2(int a){
        x=a;getSize();
        label1=new JLabel("我是第"+x+"个标签");add(label1);
    }
    public Dimension getPreferredSize(){
        return new Dimension(200,50);
    }
}
public class Example10_07 extends Applet implements ActionListener{
    CardLayout mycard;MyPanel2 myPanel[];JPanel p;
    private void addButton(JPanel pan,String butName,ActionListener listener){
        JButton aButton=new JButton(butName);
        aButton.addActionListener(listener);
        pan.add(aButton);
    }
    public void init(){
        setLayout(new BorderLayout());//小程序的布局是边界布局
        mycard=new CardLayout();
        this.setSize(400,150);
        p=new JPanel();p.setLayout(mycard);//p的布局设置为卡片式布局
        myPanel=new MyPanel2[10];
        for(int i=0;i<10;i++){
            myPanel[i]=new MyPanel2(i+1);
            p.add("A"+i,myPanel[i]);
        }
        JPanel p2=new JPanel();
        addButton(p2,"第一个",this);
        addButton(p2,"最后一个",this);
        addButton(p2,"前一个",this);
        addButton(p2,"后一个",this);
        add(p,"Center"); add(p2,"South");
    }
    public void actionPerformed(ActionEvent e){
        if (e.getActionCommand().equals("第一个"))mycard.first(p);
        else if(e.getActionCommand().equals("最后一个"))mycard.last(p);
        else if(e.getActionCommand().equals("前一个"))mycard.previous(p);
        else if(e.getActionCommand().equals("后一个"))mycard.next(p);
    }
}