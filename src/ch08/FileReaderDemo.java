package ch08;

import java.io.*;

public class FileReaderDemo {
	public static void main(String args[]) throws IOException {
		char a[] = new char[1000]; // 创建可容纳 1000 个字符的数组
		FileReader b = new FileReader("E:/ws/ecws/Java_Study/src/ch8/DemoFile.txt");
		int num = b.read(a); // 将数据读入到数组 a 中，并返回字符数
		String str = new String(a, 0, num); // 将字符串数组转换成字符串
		System.out.println("读取的字符个数为：" + num + ",内容为：\n");
		System.out.println(str);
	}
}
