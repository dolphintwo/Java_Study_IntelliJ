package ch02;

import java.util.*;

public class DemoArray {

	public static void main(String[] args) {
		int intArray[] = new int[5];
		long total = 0;
		int len = intArray.length;

		System.out.println("������" + len + "���������Կո�Ϊ�ָ���");
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < len; i++) {
			intArray[i] = sc.nextInt();
		}

		for (int i = 0; i < len; i++) {
			total += intArray[i];
		}

		System.out.println("��������Ԫ�صĺ�Ϊ��" + total);

	}

}
