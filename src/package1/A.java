package package1;

public class A {
	protected void msg() {
		System.out.println("A");
	}

	public static void main(String[] args) {
		new B().msg();
	}
}
