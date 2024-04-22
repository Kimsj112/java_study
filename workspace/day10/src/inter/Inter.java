package inter;

public interface Inter {
	int VAR1 = 20;
	public static final int VAR2 = 100; // 상수만 붙어서
		// public static final이 안보여도 무조건 붙어있음. 그래서 대문자
	
	void method1();
	public abstract void method2(); //위와 같은 이유로 ;로 끝남
	
}
