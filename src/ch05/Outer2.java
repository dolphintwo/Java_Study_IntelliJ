package ch05;

public class Outer2 {

	private int size;

	public class Inner2 {
		private int size;

		public void dostuff2(int size) {
			size++;
			this.size++;
			Outer2.this.size++;
		}
	}
}
