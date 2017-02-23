package ch05;

public class Genericity6 {
	public static void main(String[] args) {
		Point6<Integer, Integer> p1 = new Point6<Integer, Integer>();
		p1.setX(10);
		p1.setY(20);
		printNumPoint(p1);

		Point6<String, String> p2 = new Point6<String, String>();
		p2.setX("东经30.6度");
		p2.setY("北纬53.95度");
		printStrPoint(p2);

	}

	// 借助通配符限制泛型的范围
	// ? extends Number 表示泛型的类型参数只能是 Number 及其子类
	// 限制下限使用 super 关键字，例如 <? super Number> 表示只能接受 Number 及其父类。
	public static void printNumPoint(Point6<? extends Number, ? extends Number> p) {
		System.out.println("x: " + p.getX() + ", y: " + p.getY());
	}

	public static void printStrPoint(Point6<? extends String, ? extends String> p) {
		System.out.println("GPS: " + p.getX() + ",  " + p.getY());
	}
}

class Point6<T1, T2> {
	T1 x;
	T2 y;

	public T1 getX() {
		return x;
	}

	public void setX(T1 x) {
		this.x = x;
	}

	public T2 getY() {
		return y;
	}

	public void setY(T2 y) {
		this.y = y;
	}

}