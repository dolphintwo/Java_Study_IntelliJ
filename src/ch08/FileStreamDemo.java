package ch08;

import java.io.*;

public class FileStreamDemo {
	public static void main(String args[]) {
		char ch;
		int data;
		try {
			// 创建文件输入流对象
			FileInputStream a = new FileInputStream(FileDescriptor.in);
			// 创建文件输出流对象
			FileOutputStream b = new FileOutputStream("E:/ws/ecws/Java_Study/src/ch8/DemoFile4.txt");
			System.out.println("请输入字符，以#号结束：");
			while ((ch = (char) a.read()) != '#') {
				b.write(ch);
			}
			a.close();
			b.close();
			System.out.println();
			FileInputStream c = new FileInputStream("E:/ws/ecws/Java_Study/src/ch8/DemoFile4.txt");
			FileOutputStream d = new FileOutputStream(FileDescriptor.out);
			while (c.available() > 0) {
				data = c.read();
				d.write(data);
			}
			c.close();
			d.close();
		} catch (FileNotFoundException e) {
			System.out.println("找不到该文件！");
		} catch (IOException e) {
		}
	}
}
