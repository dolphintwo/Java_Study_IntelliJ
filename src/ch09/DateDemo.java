package ch09;

import java.util.Date;

public class DateDemo {
	public static void main(String[] args){
		Date da = new Date();
		System.out.println(da);
		long msec = da.getTime();
		System.out.println("从1970年1月1日0时到现在共有：" + msec + "毫秒");
	}
}
