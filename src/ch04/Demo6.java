package ch04;

public class Demo6 {
	public static void main(String[] args) {
		People6 obj = new People6();
		if (obj instanceof Object) {
			System.out.println("����һ������");
		}
		if (obj instanceof People6) {
			System.out.println("��������");
		}
		if (obj instanceof Teacher6) {
			System.out.println("����һ����ʦ");
		}
		if (obj instanceof President6) {
			System.out.println("����У��");
		}
		
		System.out.println("������������������������������������");
		obj = new Teacher6();
		if(obj instanceof Object){
            System.out.println("����һ������");
        }
        if(obj instanceof People6){
            System.out.println("��������");
        }
        if(obj instanceof Teacher6){
            System.out.println("����һ����ʦ");
        }
        if(obj instanceof President6){
            System.out.println("����У��");
        }
	}
}
class People6{ }
class Teacher6 extends People6{ }
class President6 extends Teacher6{ }