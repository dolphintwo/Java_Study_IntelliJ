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
		System.out.println("����һֻС����ҵ����ֽ�" + name + "���һᷢ������");
	}
}

class Dog2 extends Animal2 {
	public Dog2(String name) {
		super(name);
	}

	public void say() {
		System.out.println("����һֻС�����ҵ����ֽ�" + name + "���һᷢ�������Ľ���");
	}
}