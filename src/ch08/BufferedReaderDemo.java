package ch08;

import java.io.*;

public class BufferedReaderDemo {

	public static void main(String[] args) {
        String OneLine;
        int count=0;
        try{
                FileReader a=new FileReader("E:/ws/ecws/Java_Study/src/ch8/DemoFile.txt");
                BufferedReader b=new BufferedReader(a);
                while((OneLine=b.readLine())!=null){  //ÿ�ζ�ȡ 1 ��
                     count++;  //�����ȡ������
                     System.out.println(OneLine);
                }
                System.out.println("\n ����ȡ��"+count+"��");
                b.close();
           }
           catch(IOException io){
                System.out.println("������!"+io);
           }
      }
}
