package ch08;

import java.io.*;

public class FileReaderDemo {
	public static void main(String args[]) throws IOException {
		char a[] = new char[1000]; // ���������� 1000 ���ַ�������
		FileReader b = new FileReader("E:/ws/ecws/Java_Study/src/ch8/DemoFile.txt");
		int num = b.read(a); // �����ݶ��뵽���� a �У��������ַ���
		String str = new String(a, 0, num); // ���ַ�������ת�����ַ���
		System.out.println("��ȡ���ַ�����Ϊ��" + num + ",����Ϊ��\n");
		System.out.println(str);
	}
}
