package ch09;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatDemo {
	public static void main(String[] args){
		Date da = new Date();
		System.out.println(da);
		SimpleDateFormat ma1 = new SimpleDateFormat("yyyy �� MM �� dd �� E ����ʱ��");
		System.out.println(ma1.format(da));
		SimpleDateFormat ma2=new SimpleDateFormat("����ʱ�䣺yyyy �� MM �� dd �� HH ʱ mm �� ss ��");
		System.out.println(ma2.format(-1000));
	}
}
