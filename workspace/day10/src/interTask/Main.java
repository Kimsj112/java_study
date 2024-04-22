package interTask;

public class Main {
	public static void main(String[] args) {
		BasicFan f = new BasicFan();
		BasicFan2 f2 = new BasicFan2();
		SmartFan sf = new SmartFan();
		
		method(f);
		method(new BasicFan2());
		method(new SmartFan());
		method(f2);
		method(sf);
	}
	
	static void method(Fan fan) {
		fan.on();
		fan.off();
		fan.turbo();
	}
}
