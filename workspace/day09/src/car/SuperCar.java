package car;

public class SuperCar extends Car{
	
//	public SuperCar() {
//		super("", "", 0); //1번째 방법
//	}
	
	boolean booster;
	
	public SuperCar(String brand, String color, int price, boolean booster) {
		super(brand, color, price);
		this.booster = booster;
	}
	
	@Override
		void enginStart() {
			System.out.println("부아아아아앙!!");
		}
}
