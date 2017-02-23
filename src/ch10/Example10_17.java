package ch10;
import java.applet.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class MyPanel5 extends JPanel{
    public void print(int r){
        Graphics g = getGraphics();
        g.clearRect(0,0,this.getWidth(),this.getHeight());
        g.setColor(Color.red);
        g.fillOval(10,10,r,r);
    }
}
class MyWindow6 extends JFrame implements MouseListener{
    JTextArea text;
    MyPanel5 panel5;
    int x,y,r =10;
    int mouseFlg=0;
    static String mouseStates[]={"��������","����ɿ�","������","����߿�","���˫��"};
    MyWindow6(String s){
        super(s);
        Container con = this.getContentPane();
        con.setLayout(new GridLayout(2,1));
        this.setSize(200,300);
        this.setLocation(100,100);
        panel5 = new MyPanel5();
        con.add(panel5);
        text = new JTextArea(10,20);
        text.setBackground(Color.blue);
        con.add(text);
        addMouseListener(this);
        this.setVisible(true);
        this.pack();
    }
    public void paint(Graphics g){
        r = r+4;
        if(r>80){
            r=10;
        }
        text.append(mouseStates[mouseFlg]+"�ˣ�λ���ǣ�" +x+","+y+"\n");
        panel5.print(r);
    }
    public void mousePressed(MouseEvent e){
        x = e.getX();
        y = e.getY();
        mouseFlg = 0;
        repaint();
    }
    public void mouseReleased(MouseEvent e){
        x = e.getX();
        y = e.getY();
        mouseFlg = 1;
        repaint();
    }
    public void mouseEntered(MouseEvent e){
        x = e.getX();
        y = e.getY();
        mouseFlg = 2;
        repaint();
    }
    public void mouseExited(MouseEvent e){
        x = e.getX();
        y = e.getY();
        mouseFlg = 3;
        repaint();
    }
    public void mouseClicked(MouseEvent e){
        if(e.getClickCount()==2){
            x = e.getX();
            y = e.getY();
            mouseFlg = 4;
            repaint();
        }
        else{}
    }
}
public class Example10_17 extends Applet{
    public void init(){
        MyWindow6 myWnd = new MyWindow6("����¼�ʾ�����");
    }
}