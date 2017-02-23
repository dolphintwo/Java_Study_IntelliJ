package ch03;

public class Demo {
	public static String name = "aaabbbccc";
	public int i;
	
	{
		int j=2;
	}
	public void test1(){
		int j=3;
		if(j==3){
			int k=5;
		}
		System.out.println("name="+name+", i="+i+", j="+j);
	}
	public static void main(String[] args){
		System.out.println(Demo.name);
		
		Demo t = new Demo();
		t.test1();
	}
	
}
