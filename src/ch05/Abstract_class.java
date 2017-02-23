package ch05;
import static java.lang.System.*;

public class Abstract_class {
	public static void main(String[] args){
		Teacher t = new Teacher();
		t.setName("Andy");
		t.work();
		
		Driver d = new Driver();
		d.setName("Jeffery");
		d.work();
		
		//Cannot instantiate the type People
		//People p = new People();
	}
}

abstract class People{
	private String name;
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return this.name;
	}
	public abstract void work();
	
}
class Teacher extends People{
	public void work(){
		out.println("My name is "+this.getName()+", I'm teaching, Do not do sth else!");
	}
}
class Driver extends People{
	public void work(){
		out.println("My name is "+this.getName()+", I'm driving");
	}
}