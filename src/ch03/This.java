package ch03;

public class This {
	public static void main(String[] args) {
		B b = new B(new A());// ���ﴴ��B��Ķ���bʱ����B��Ĺ��캯��������
		// A��Ķ�������ã�ָ�룩��
	}
}

class A {
	public A() {
		System.out.println("step 1 ");
		new B(this).print();// �����һ����ִ��A��Ĺ��췽��A()����Ϊ����B��
		// �Ķ���bʱ����B��Ĺ��캯��������A��Ķ�������ã�ָ�룩�����Գ�����ִ��
		// new A() ��ִ��new A()��ʱ���������A��Ĺ��췽����A��Ĺ��췽������
		// ������B����������󣬲���������B�����������print();������
	}

	public void print() {
		System.out.println("step 3");// ���ڵڶ���a.print();ִ����A���
		// print()���������Գ�������������е����
		System.out.println("hello from A");// Ȼ��ִ�е����
		// ���룬���Դ�ӡ�����hello from A
	}
}

class B {
	A a;// ����������һ��A��Ķ���a����ʱ��û�ж�aʵ������ֻ��������

	public B(A a) {// ִ��new A()��Ϻ󣬿�ʼִ��ִ��new B()�ˣ���ʱ��ִ��B���
		// ���캯��B()��
		this.a = a;// B b=new B(new A());//���ﴴ��B��Ķ���bʱ�������A�����
		// �����ã�ָ�룩��������֮ǰ������A��Ķ���a����ʱa�洢�Ŵ���B��Ķ���bʱ����
		// ���A���������ã�ָ�룩��
	}

	public void print() {
		System.out.println("step 2 ");// ����������B�����������print()������
		// ���Գ���ڶ�����ִ�е�����������档
		a.print();// ��Ϊa�洢�Ŵ���B��Ķ���bʱ�������A���������ã�ָ�룩��
		// ��������ִ��a����ķ���print()������ִ�е�A����������
		// print()���������Գ���ڶ��������е��������ִ����A���print()������
		//
		// ��ӡ���hello from A��Ϻ�a.print();ִ����ϣ�
		System.out.println("step 4 ");// ���Կ�ʼִ�����
		System.out.println("hello from B");// ��ִ�����
		// ����������������
	}
}
