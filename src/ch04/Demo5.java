package ch04;

public class Demo5 {
	public static void main(String args[]) {
		Master ma = new Master();
		ma.feed(new Animal4(), new Food());
		ma.feed(new Cat4(), new Fish());
		ma.feed(new Dog4(), new Bone());
	}
}

class Animal4 {
	public void eat(Food f) {
		System.out.println("我是一个小动物，正在吃" + f.getFood());
	}
}

class Cat4 extends Animal4 {
	public void eat(Food f) {
		System.out.println("我是一个小猫咪，正在吃" + f.getFood());
	}
}

class Dog4 extends Animal4 {
	public void eat(Food f) {
		System.out.println("我是一个小狗狗，正在吃" + f.getFood());
	}
}

class Food {
	public String getFood() {
		return "sth";
	}
}

class Fish extends Food {
	public String getFood() {
		return "Fish";
	}
}

class Bone extends Food {
	public String getFood() {
		return "Bone";
	}
}

class Master {
	public void feed(Animal4 an, Food f) {
		an.eat(f);
	}
}