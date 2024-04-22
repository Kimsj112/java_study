package casting;

class A{
	
}

class B extends A{
	
}

public class Ex02 {
	public static void main(String[] args) {
		A a = new A();
		B b = new B();
		
		System.out.println(a instanceof A); //t
		System.out.println(a instanceof B); //f
		System.out.println(b instanceof B); //t
		System.out.println(b instanceof A); //t
		
		A var1 = new B();
		B var2 = new B();
	}
}
