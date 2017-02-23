package ch03;

public class DemoThis3 {
	public String name;
	public int age;
	
	public DemoThis3(){
		this("happy",3);
	}
	
	public DemoThis3(String name,int age){
		this.name= name;
		this.age=age;
	}
	
	public void say(){
		System.out.println("名字是" + name + "，成立了" + age + "年");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DemoThis3 obj = new DemoThis3();
		obj.say();
	}

}
