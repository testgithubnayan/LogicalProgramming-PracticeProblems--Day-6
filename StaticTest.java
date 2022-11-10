package javaprogrames;

 public class StaticTest {

	int b = 20;
	static int z = 21;

	public int addition() {

		int a = 10;
		int c = a + b + z;
		return c;
	}

	public static void main(String[] args) {
		System.out.println("hiii");
	}
}

 class Test1 extends StaticTest {
	 final public static void main(String[] args) {
		
		StaticTest ref = new StaticTest();
		System.out.println(StaticTest.z);
		System.out.println(ref.z);
		System.out.println(ref.addition());
		ref.addition();
	}
}
