package ch02;

public class DemoStringBuffer {
	public static void main (String[] args){
		StringBuffer str = new StringBuffer("abcdef123456");
		str.append(true);
		System.out.println(str);
//		str.deleteCharAt(3);
//		System.out.println(str);
//		str.delete(0, 5);
//		System.out.println(str);
		str.insert(3, "xyz");
		System.out.println(str);
		str.setCharAt(2, 'w');
		System.out.println(str);
		
		
	}
}
