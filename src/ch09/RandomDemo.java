package ch09;
/*
 * ����10��10~100֮����������
 * ��Ҫ����[a,b]֮����������ͨʽΪ��    ��b-a+1��*Math.random()+a
 */
public class RandomDemo {
	public static void main(String args[]) {
		int a;
		System.out.print("�����Ϊ��");
		for (int i = 1; i <= 10; i++) {
			a = (int) ((100 - 10 + 1) * Math.random() + 10);
			System.out.print(" " + a);
		}
		System.out.println();
	}
}