package ch03;

public class DemoOverLoad {
	void test() {
		System.out.println("No Parameters");
	}

	void test(int a) {
		System.out.println("a : " + a);
	}

	void test(int a, int b) {
		System.out.println("a and b :" + a + " " + b);
	}
	
	double test(double a){
		System.out.println("double a: " + a);
		return a*a;
	}
	
	public static void main(String args[]){
		DemoOverLoad obj = new DemoOverLoad();
		obj.test();
		obj.test(2);
		obj.test(2,3);
		obj.test(2.0);
	}
	
}
