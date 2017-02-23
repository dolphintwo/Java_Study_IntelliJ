package ch09;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatDemo {
	public static void main(String[] args){
		Date da = new Date();
		System.out.println(da);
		SimpleDateFormat ma1 = new SimpleDateFormat("yyyy 年 MM 月 dd 日 E 北京时间");
		System.out.println(ma1.format(da));
		SimpleDateFormat ma2=new SimpleDateFormat("北京时间：yyyy 年 MM 月 dd 日 HH 时 mm 分 ss 秒");
		System.out.println(ma2.format(-1000));
	}
}
