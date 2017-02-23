package ch04;

public class DemoObject {
	public static void main(String[] args) {
		String i = "aaaa";
		String j = i.toString();
		System.out.println(i.hashCode());
		System.out.println(j);
		System.out.println(j.hashCode());
	}
}
