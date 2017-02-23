package ch03;

public class DemoThis2 {
	public String name;
	public int age;
	public DemoThis2(String name , int age){
		this.name = name;
		this.age = age;
	}
	
	public void say(){
		System.out.println("Name is "+name + ", and age is "+age);
	}
	
	public static void main(String[] args) {
		DemoThis2 obj = new DemoThis2("Happy_Java",3);
		obj.say();
	}

}
