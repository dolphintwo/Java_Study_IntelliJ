package ch05;

public class Genericity4 {
	public static void main(String[] args) {
		Point4 p = new Point4(); // 类型擦除
		p.setX(10);
		p.setY(20.8);
		int x = (Integer) p.getX(); // 向下转型
		double y = (Double) p.getY();
		System.out.println("This point is：" + x + ", " + y);
	}
}

class Point4<T1, T2> {
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
