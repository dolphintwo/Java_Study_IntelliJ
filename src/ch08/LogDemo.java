package ch08;

import java.io.*;
/*
 * ģ��ϵͳ��־��������д�뵽�ļ�β����
 */
public class LogDemo {
	public static void main(String args[]) throws IOException {
		try {
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			String s = in.readLine();
			RandomAccessFile myFile = new RandomAccessFile("E:/ws/ecws/Java_Study/src/ch8/DemoFile6.log", "rw");
			myFile.seek(myFile.length()); // �ƶ����ļ���β
			myFile.writeBytes(s + "\n"); // д������
			myFile.close();
		} catch (IOException e) {
		}
	}
}