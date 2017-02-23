package ch04;
import static java.lang.System.*;
import static java.lang.Math.random;

public class Demo8 {
	static int i;
	int j;
	
	public static void main(String[] args){
		Demo8 obj1 = new Demo8();
		obj1.i = 10;
		obj1.j = 20;
		
		Demo8 obj2 = new Demo8();
		
		System.out.println("obj1.i="+obj1.i+"  obj1.j="+obj1.j);
		System.out.println("obj2.i="+obj2.i+"  obj2.j="+obj2.j);
		out.println(random());
	}
}
