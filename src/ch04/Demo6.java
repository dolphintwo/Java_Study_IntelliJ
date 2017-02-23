package ch04;

public class Demo6 {
	public static void main(String[] args) {
		People6 obj = new People6();
		if (obj instanceof Object) {
			System.out.println("我是一个对象");
		}
		if (obj instanceof People6) {
			System.out.println("我是人类");
		}
		if (obj instanceof Teacher6) {
			System.out.println("我是一名教师");
		}
		if (obj instanceof President6) {
			System.out.println("我是校长");
		}
		
		System.out.println("——————————————————");
		obj = new Teacher6();
		if(obj instanceof Object){
            System.out.println("我是一个对象");
        }
        if(obj instanceof People6){
            System.out.println("我是人类");
        }
        if(obj instanceof Teacher6){
            System.out.println("我是一名教师");
        }
        if(obj instanceof President6){
            System.out.println("我是校长");
        }
	}
}
class People6{ }
class Teacher6 extends People6{ }
class President6 extends Teacher6{ }