package ch03;

public class DemoOrder {
	private String name;//step 4
	private int age;//step 5
	
	public DemoOrder(){//step 3
		name = "Happy";//step 6
		age = 3;//step 7
	}
	
	public static void main(String args[]){//step 1
		DemoOrder obj = new DemoOrder();//step 2
		System.out.println(obj.name + "µÄÄêÁäÊÇ" + obj.age);//step 8
	}
	
}
