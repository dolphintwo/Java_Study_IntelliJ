package ch04;

public class Demo1 {
	public static void main(String args[]) {
		Teacher t = new Teacher();
		t.name = "Andy";
		t.age = 70;
		t.school = "ShangHai University";
		t.subject = "Java";
		t.seniority = 22;
		t.say();
		t.lecturing();
	}
}

class People {
	String name;
	int age;
	int height;

	void say() {
		System.out.println("My name is " + name + ", age is " + age + ", and height is " + height);
	}
}

class Teacher extends People {
	String school;
	String subject;
	int seniority;

	void say() {
		System.out.println("�ҽ�" + name + "����" + school + "��" + subject + "����" + seniority + "�����");
	}

	void lecturing() {
		System.out.println("���Ѿ�" + age + "���ˣ���Ȼվ�ڽ�̨�Ͻ���");
	}
}
