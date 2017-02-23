package ch03;

public class DemoThis {
	public int x = 10;
	public int y = 15;
	
	public void sum(){
		int z = this.x + this.y;
		System.out.println("x + y = " + z);
	}
	
	public static void main(String[] args){
		DemoThis obj = new DemoThis();
		obj.sum();
	}
}
