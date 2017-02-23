package ch02;

public class Demo {
	public static void main(String[] args){
		int i,j;
		for (i = 1; i <= 9; i++) {
			for (j = 1; j <= 9; j++) {
				if (j < i) {
//					System.out.print("        ");
				} else {
					System.out.printf("%d*%d=%2d  ", i, j, i*j);
				}
			}
			System.out.print("\n");
		}
	}
}
