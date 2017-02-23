package ch04;

public class Demo4 {
	public static void main(String args[]) {
		Dog2 myDog = new Dog2("Andy");
		myDog.say();
		
		Animal2  myAnimal = new Animal2("Bobo");
		myAnimal.say();
	}
}

class Animal2 {
	String name;

	public Animal2(String name) {
		this.name = name;
	}

	public void say() {
		System.out.println("我是一只小动物，我的名字叫" + name + "，我会发出叫声");
	}
}

class Dog2 extends Animal2 {
	public Dog2(String name) {
		super(name);
	}

	public void say() {
		System.out.println("我是一只小狗，我的名字叫" + name + "，我会发出汪汪的叫声");
	}
}