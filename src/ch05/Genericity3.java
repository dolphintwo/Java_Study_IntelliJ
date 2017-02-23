package ch05;

public class Genericity3 {
	public static void main(String[] args) {
		Info<String> obj = new InfoImp<String>("www.baidu.com");
		System.out.println("Length Of String: " + obj.getVar().length());
	}
}

// ���巺�ͽӿ�
interface Info<T> {
	public T getVar();
}

// ʵ�ֽӿ�
class InfoImp<T> implements Info<T> {
	private T var;

	// ���巺�͹��췽��
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