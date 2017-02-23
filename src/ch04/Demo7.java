package ch04;

public class Demo7 {
	public static void main(String args[]) {
		SuperClass superObj = new SuperClass();
		SonClass sonObj = new SonClass();
	
		/*
		// 下面的代码运行时会抛出异常，不能将父类对象直接转换为子类类
		// SonClass sonObj2 = (SonClass)superObj;
		
		// 先向上转型，再向下转型
		superObj = sonObj;
		SonClass sonObj1 = (SonClass) superObj;
		*/
		
		if (superObj instanceof SonClass){
			SonClass sonObj1 = (SonClass)superObj;
		}else{
			System.out.println("①不能转换");
		}
		superObj = sonObj;
		if (superObj instanceof SonClass){
			SonClass sonObj2 = (SonClass)superObj;
		}else{
			System.out.println("②不能转化");
		}
		
	}
}

class SuperClass {
}

class SonClass extends SuperClass {
}
