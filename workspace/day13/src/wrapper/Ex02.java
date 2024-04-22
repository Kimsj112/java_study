package wrapper;

public class Ex02 {
	public static void main(String[] args) {
		
		method(3);
	}
	
//	자동으로 outoboxing이 되어서 Object임에도 들어갈 수 있음
	static void method(Object obj) {
		System.out.println(obj);
	}
}
