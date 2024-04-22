package toString;

class SuperClass{
	public void printA() {
		System.out.println("A");
	}
}

class SubClass extends SuperClass{
	@Override
	public void printA() {
		System.out.println("자식에서 재정의");
	}
}

public class Test {

	public static void main(String[] args) {
		method(new SubClass());
	}
	
	
	public static void method(SuperClass sc) {
		sc.printA();
	}
}















