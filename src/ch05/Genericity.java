package ch05;

public class Genericity {
	public static void main(String[] args) {
		Point p = new Point();
		p.setX(10);
		p.setY(20);
		int x = (Integer) p.getX();
		int y = (Integer) p.getY();
		System.out.println("This Point is (" + x + "," + y + ").");

		p.setX(25.6);
		p.setY(55.78);
		double m = (Double) p.getX();
		double n = (Double) p.getY();
		System.out.println("This Point is (" + m + "," + n + ").");
	}
}

class Point {
	Object x = 0;
	Object y = 0;

	public Object getX() {
		return x;
	}

	public void setX(Object x) {
		this.x = x;
	}

	public Object getY() {
		return y;
	}

	public void setY(Object y) {
		this.y = y;
	}
}
