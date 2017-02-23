package ch08;

import java.io.*;

public class BufferWriterDemo {
	public static void main(String args[]) {
		String str = new String();
		try {
			BufferedReader in 
			= new BufferedReader(new FileReader("E:/ws/ecws/Java_Study/src/ch8/DemoFile.txt"));
			BufferedWriter out 
			= new BufferedWriter(new FileWriter("E:/ws/ecws/Java_Study/src/ch8/DemoFile3.txt"));
			while ((str = in.readLine()) != null) {
				System.out.println(str);
				out.write(str); // ����ȡ���� 1 ������д�������
				out.newLine(); // д�뻻�з�
			}
			out.flush();
			in.close();
			out.close();
		} catch (IOException e) {
			System.out.println("���ִ���" + e);
		}
	}
}
