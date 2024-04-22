package inter3;

public interface InterA {
	void method1();
	
	//public 없어도 붙어있음.
	public default void method2() {
		System.out.println("method2!!");
		method4();
	}
	
	static void method3() {
		System.out.println("method3!!!");
	}
	
	private void method4() {
		System.out.println("method4!!!!");
	}
}
