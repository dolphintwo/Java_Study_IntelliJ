package ch02;

import java.util.*;

public class DemoArray {

	public static void main(String[] args) {
		int intArray[] = new int[5];
		long total = 0;
		int len = intArray.length;

		System.out.println("请输入" + len + "个整数，以空格为分隔：");
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < len; i++) {
			intArray[i] = sc.nextInt();
		}

		for (int i = 0; i < len; i++) {
			total += intArray[i];
		}

		System.out.println("所有数组元素的和为：" + total);

	}

}
