package ch08;

import java.io.*;

public class FileStreamDemo {
	public static void main(String args[]) {
		char ch;
		int data;
		try {
			// �����ļ�����������
			FileInputStream a = new FileInputStream(FileDescriptor.in);
			// �����ļ����������
			FileOutputStream b = new FileOutputStream("E:/ws/ecws/Java_Study/src/ch8/DemoFile4.txt");
			System.out.println("�������ַ�����#�Ž�����");
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
			System.out.println("�Ҳ������ļ���");
		} catch (IOException e) {
		}
	}
}
