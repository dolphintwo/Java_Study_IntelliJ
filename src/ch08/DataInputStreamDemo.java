package ch08;

import java.io.*;

public class DataInputStreamDemo {
	public static void main(String args[]){
        String fileName="E:/ws/ecws/Java_Study/src/ch8/DemoFile5.dat";
        int sum=0;
        try{
            DataInputStream a=new DataInputStream(new BufferedInputStream(new FileInputStream(fileName)));
			sum += a.readInt();
			sum += a.readInt();
			sum += a.readInt();
			System.out.println("三个数的和为：" + sum);
            a.close();
        }
        catch(IOException e){
            System.out.println("出现错误！"+fileName);
        }
    }
}
