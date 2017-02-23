package ch05;

public class Genericity1 {
	public static void main(String[] args) {
		// ʵ����������
		Point2<Integer, Integer> p1 = new Point2<Integer, Integer>();
		p1.setX(10);
		p1.setY(20);
		int x = p1.getX();
		int y = p1.getY();
		p1.printPoint(x, y);

		Point2<Double, String> p2 = new Point2<Double, String>();
		p2.setX(28.54);
		p2.setY("����230��");
		double m = p2.getX();
		String n = p2.getY();
		p2.printPoint(m, n);
	}
}

// ���巺����
// T1 ֻ���� Number �������࣬�����������͵����ݻᱨ��
class Point1<T1 extends Number, T2> {
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