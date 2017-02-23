package ch05;

public class Genericity6 {
	public static void main(String[] args) {
		Point6<Integer, Integer> p1 = new Point6<Integer, Integer>();
		p1.setX(10);
		p1.setY(20);
		printNumPoint(p1);

		Point6<String, String> p2 = new Point6<String, String>();
		p2.setX("����30.6��");
		p2.setY("��γ53.95��");
		printStrPoint(p2);

	}

	// ����ͨ������Ʒ��͵ķ�Χ
	// ? extends Number ��ʾ���͵����Ͳ���ֻ���� Number ��������
	// ��������ʹ�� super �ؼ��֣����� <? super Number> ��ʾֻ�ܽ��� Number ���丸�ࡣ
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