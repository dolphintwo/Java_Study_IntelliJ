package ch05;

public class Interface_Demo {
	public static void main(String[] args) {
		SataHdd sh1 = new SeagateHdd();
		SataHdd sh2 = new SamsungHdd();
		sh1.writeData("HH");
		sh2.readData();
		fixHdd sh3 = new SeagateHdd();
		boolean n =sh3.doFix();
		System.out.println(n);

	}
}

interface SataHdd {
	public static final int CONNECT_LINE = 4;

	public void writeData(String Data);

	public String readData();
}

interface fixHdd {
	String Address = "ShangHai";

	boolean doFix();
}

class SeagateHdd implements SataHdd, fixHdd {
	public String readData() {
		return "Data";
	}

	public void writeData(String data) {
		System.out.println("Write Complete!");
	}

	public boolean doFix() {
		return true;
	}
}

class SamsungHdd implements SataHdd {
	public String readData() {
		return "Data";
	}

	public void writeData(String data) {
		System.out.println("Write Complete!");
	}
}

abstract class XXhdd implements SataHdd {
	public String readData() {
		return "Data";
	}
}