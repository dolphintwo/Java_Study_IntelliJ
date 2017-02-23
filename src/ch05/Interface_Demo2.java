package ch05;

public class Interface_Demo2 {
	public void test1(A a){
		a.doSth();
	}
	public static void main(String[] args){
		Interface_Demo2 d = new Interface_Demo2();
		A a = new B();
		d.test1(a);
	}
}

interface A{
	public int doSth();
}
class B implements A{
	public int doSth(){
		System.out.println("Now is B");
		return 123;
	}
}