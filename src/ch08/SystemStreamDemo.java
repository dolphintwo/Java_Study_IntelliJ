package ch08;

import java.io.*;

public class SystemStreamDemo {
	public static void main(String args[]) {
		try {
			byte a[] = new byte[128]; // 设置输入缓冲区
			System.out.print("请输入字符串：");
			int count = System.in.read(a); // 读取标准输入输出流
			System.out.println("输入的是：");
			for (int i = 0; i < count; i++)
				System.out.print(a[i] + ""); // 输出数组元素的 ASCII 值
			System.out.println();
			for (int i = 0; i < count - 2; i++) // 不显示回车和换行符
				System.out.print((char) a[i] + ""); // 按字符方式输出元素
			System.out.println();
			// 输出的结果显示为 5 个字符。这是由于 Java 中回车被当作两个字符，一个是 ASCⅡ为 13 的回车符，一个是值为 10
			// 的换行符
			System.out.println("输入的字符个数为：" + count);
			Class InClass = System.in.getClass();
			Class OutClass = System.out.getClass();
			System.out.println("in 所在的类为：" + InClass.toString());
			System.out.println("out 所在的类为：" + OutClass.toString());
		} catch (IOException e) {
		}
	}
}
