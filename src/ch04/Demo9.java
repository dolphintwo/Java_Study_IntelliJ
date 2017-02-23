package ch04;

public final class Demo9 {
	public static final int TOTAL_NUMBER = 5;
	public int id;

	// public Demo9(){
	// id = ++TOTAL_NUMBER;
	// }
	public static void main(String[] args) {
		final Demo9 t = new Demo9();
		final int i = 10;
		final int j;
		// final 修饰的变量（成员变量或局部变量）即成为常量，只能赋值一次。
		// i = 20;
		j = 30;
	}
}
