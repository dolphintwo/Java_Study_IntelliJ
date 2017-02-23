package ch08;

import java.io.*;

public class FileStreamDemo2 {
	public static void main(String args[]) throws IOException{
        FileInputStream a=new FileInputStream("E:/ws/ecws/Java_Study/src/ch8/testimg.jpg");
        FileOutputStream b=new FileOutputStream("E:/ws/ecws/Java_Study/src/ch8/testimg_bak.jpg");
        System.out.println("文件的大小为："+a.available());
        byte c[]=new byte[a.available()];
        a.read(c);  //将图形文件读入数组
        b.write(c);  //将数组中的数据写入到新文件中
        System.out.println("文件已经被更名复制！");
        a.close();
        b.close();
    }
}
