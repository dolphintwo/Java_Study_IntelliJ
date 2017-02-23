package ch04;

public class Demo3 {
	public static void main(String args[]){
		Dog1 obj = new Dog1("Andy",3);
				obj.say();
	}
}

class Animal1{
	String name;
	public Animal1(String name){
		this.name= name;
	}
}

class Dog1 extends Animal1{
	int age;
	public Dog1(String name, int age){
		super(name);
		this.age=age;
	}
	public void say(){
		System.out.println("name is "+name+", and age is"+age);
	}
	
}