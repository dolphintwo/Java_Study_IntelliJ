package ch08;

import java.io.*;
/*
 * 模仿系统日志，将数据写入到文件尾部。
 */
public class LogDemo {
	public static void main(String args[]) throws IOException {
		try {
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			String s = in.readLine();
			RandomAccessFile myFile = new RandomAccessFile("E:/ws/ecws/Java_Study/src/ch8/DemoFile6.log", "rw");
			myFile.seek(myFile.length()); // 移动到文件结尾
			myFile.writeBytes(s + "\n"); // 写入数据
			myFile.close();
		} catch (IOException e) {
		}
	}
}