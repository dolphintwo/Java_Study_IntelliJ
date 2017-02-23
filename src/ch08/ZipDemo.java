package ch08;

import java.io.*;
import java.util.*;
import java.util.zip.*;
/*
 * ���������ļ������������ļ�ѹ��
 */
public class ZipDemo {
	public static void main(String args[]) throws IOException {
		FileOutputStream a = new FileOutputStream("E:/ws/ecws/Java_Study/src/ch8/DemoFile7.zip");
		// ����ѹ���ļ�
		ZipOutputStream out = new ZipOutputStream(new BufferedOutputStream(a));
		for (int i = 0; i < args.length; i++) { // �������������ÿ���ļ����д���
			System.out.println("Writing file" + args[i]);
			BufferedInputStream in = new BufferedInputStream(new FileInputStream(args[i]));
			out.putNextEntry(new ZipEntry(args[i])); // ���� ZipEntry ����
			int b;
			while ((b = in.read()) != -1)
				out.write(b); // ��Դ�ļ���������ѹ���ļ���д��
			in.close();
		}
		out.close();
		// ��ѹ���ļ�����ʾ
		System.out.println("Reading file");
		FileInputStream d = new FileInputStream("E:/ws/ecws/Java_Study/src/ch8/DemoFile7.zip");
		ZipInputStream inout = new ZipInputStream(new BufferedInputStream(d));
		ZipEntry z;

		while ((z = inout.getNextEntry()) != null) { // ������
			System.out.println("Reading file" + z.getName()); // ��ʾ�ļ���ʼ��
			int x;
			while ((x = inout.read()) != -1)
				System.out.write(x);
			System.out.println();
		}
		inout.close();
	}
}