package ch08;

import java.io.*;

public class FileStreamDemo2 {
	public static void main(String args[]) throws IOException{
        FileInputStream a=new FileInputStream("E:/ws/ecws/Java_Study/src/ch8/testimg.jpg");
        FileOutputStream b=new FileOutputStream("E:/ws/ecws/Java_Study/src/ch8/testimg_bak.jpg");
        System.out.println("�ļ��Ĵ�СΪ��"+a.available());
        byte c[]=new byte[a.available()];
        a.read(c);  //��ͼ���ļ���������
        b.write(c);  //�������е�����д�뵽���ļ���
        System.out.println("�ļ��Ѿ����������ƣ�");
        a.close();
        b.close();
    }
}
