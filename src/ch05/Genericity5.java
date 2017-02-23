package ch05;

public class Genericity5 {
	public static void main(String[] args) {
		Point5<Integer, Integer> p1 = new Point5<Integer, Integer>();
		p1.setX(10);
		p1.setY(20);
		printPoint(p1);

		Point5<Double, String> p2 = new Point5<Double, String>();
		p2.setX(56.28);
		p2.setY("东经260度");
		printPoint(p2);

	}

	public static void printPoint(Point5<?, ?> p) {// 使用通配符
		System.out.println("This point is :" + p.getX() + ", " + p.getY());
	}
}

class Point5<T1, T2> {
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
