package ch05;

public class Genericity3 {
	public static void main(String[] args) {
		Info<String> obj = new InfoImp<String>("www.baidu.com");
		System.out.println("Length Of String: " + obj.getVar().length());
	}
}

// 定义泛型接口
interface Info<T> {
	public T getVar();
}

// 实现接口
class InfoImp<T> implements Info<T> {
	private T var;

	// 定义泛型构造方法
	public InfoImp(T var) {
		this.setVar(var);
	}

	public void setVar(T var) {
		this.var = var;
	}

	public T getVar() {
		return this.var;
	}

}