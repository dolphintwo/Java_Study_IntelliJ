package ch04;

public class Demo7 {
	public static void main(String args[]) {
		SuperClass superObj = new SuperClass();
		SonClass sonObj = new SonClass();
	
		/*
		// ����Ĵ�������ʱ���׳��쳣�����ܽ��������ֱ��ת��Ϊ������
		// SonClass sonObj2 = (SonClass)superObj;
		
		// ������ת�ͣ�������ת��
		superObj = sonObj;
		SonClass sonObj1 = (SonClass) superObj;
		*/
		
		if (superObj instanceof SonClass){
			SonClass sonObj1 = (SonClass)superObj;
		}else{
			System.out.println("�ٲ���ת��");
		}
		superObj = sonObj;
		if (superObj instanceof SonClass){
			SonClass sonObj2 = (SonClass)superObj;
		}else{
			System.out.println("�ڲ���ת��");
		}
		
	}
}

class SuperClass {
}

class SonClass extends SuperClass {
}
