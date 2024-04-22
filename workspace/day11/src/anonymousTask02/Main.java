package anonymousTask02;

public class Main {
	public static void main(String[] args) {
		InterA a = new InterA() {
			
			@Override
			public void method1() {
				System.out.println("1111111111111");
			}
			
			@Override
			public void method2() {
				System.out.println("222222222222222");	
			}
			
			@Override
			public void method3() {
				System.out.println("33333333333333");
			}
			
			
		};
			a.method1();
			a.method2();
			a.method3();
	}
}
