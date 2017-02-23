package ch08;

import java.io.*;

public class BufferedReaderDemo {

	public static void main(String[] args) {
        String OneLine;
        int count=0;
        try{
                FileReader a=new FileReader("E:/ws/ecws/Java_Study/src/ch8/DemoFile.txt");
                BufferedReader b=new BufferedReader(a);
                while((OneLine=b.readLine())!=null){  //每次读取 1 行
                     count++;  //计算读取的行数
                     System.out.println(OneLine);
                }
                System.out.println("\n 共读取了"+count+"行");
                b.close();
           }
           catch(IOException io){
                System.out.println("出错了!"+io);
           }
      }
}
