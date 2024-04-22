package superTest;

public class Child extends Parents{
	
	int data;
	
	public Child() {
		System.out.println("child생성자 호출!");
	}
	
	Child(int data) {
		super();
		this.data = data;
	}

}
