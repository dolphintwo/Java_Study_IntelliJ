package ch08;

import java.io.*;

public class SystemStreamDemo {
	public static void main(String args[]) {
		try {
			byte a[] = new byte[128]; // �������뻺����
			System.out.print("�������ַ�����");
			int count = System.in.read(a); // ��ȡ��׼���������
			System.out.println("������ǣ�");
			for (int i = 0; i < count; i++)
				System.out.print(a[i] + ""); // �������Ԫ�ص� ASCII ֵ
			System.out.println();
			for (int i = 0; i < count - 2; i++) // ����ʾ�س��ͻ��з�
				System.out.print((char) a[i] + ""); // ���ַ���ʽ���Ԫ��
			System.out.println();
			// ����Ľ����ʾΪ 5 ���ַ����������� Java �лس������������ַ���һ���� ASC��Ϊ 13 �Ļس�����һ����ֵΪ 10
			// �Ļ��з�
			System.out.println("������ַ�����Ϊ��" + count);
			Class InClass = System.in.getClass();
			Class OutClass = System.out.getClass();
			System.out.println("in ���ڵ���Ϊ��" + InClass.toString());
			System.out.println("out ���ڵ���Ϊ��" + OutClass.toString());
		} catch (IOException e) {
		}
	}
}
