package ch03;

public class Dog {
	String name;
	int age;

	Dog(String name1, int age1) {
		name = name1;
		age = age1;
		System.out.println("Thanks to all the people");
	}

	void bark() {
		System.out.println("wa wa wa");
	}

	void hungry() {
		System.out.println("I'm hungry");
	}

	public static void main(String[] args) {
		Dog myDog = new Dog("Andy", 5);
		myDog.bark();
		myDog.hungry();
		System.out.println("Name is " + myDog.name + ", Age is " + myDog.age);
	}
}
//class Teddy extends Dog{
//		void bark(){
//			System.out.println("wa wa wa hahaha");
//		}
//}