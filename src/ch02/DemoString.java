package ch02;

import java.util.*;

public class DemoString {
	public static void main(String[] args){
		
		String stuName = "小明";
		int stuAge=17;
		float stuScore = 92.5f;
		
		String info = stuName+"的年龄是"+stuAge+"，他的成绩是"+stuScore;
		System.out.println(info);
		
		String str = "1234567890";
		System.out.println(str.charAt(4)+"  "+str.charAt(1)+"  "+str.charAt(9));
		
		String str2 = "AAAAABBBBBB";
		System.out.println(str2.contains("AB"));
		
		String stra = "Hello World!";
		String strb = stra.replace("Hello", "你好");
		System.out.println(stra);
		System.out.println(strb);
		
		String strc = "aa bbb cccc dd 77";
		String strArr[] = strc.split(" ");
		System.out.println(Arrays.toString(strArr));
		
	}
}
