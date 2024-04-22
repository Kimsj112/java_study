package task01;

class Car {
	String brand;
	String color;
	int price;
	
	public Car(String brand, String color, int price) {
		this.brand=brand;
		this.color=color;
		this.price=price;
	}
	void engineStart() {
		System.out.println("시동 켜짐!");
	}
	
	void printCarinfo() {
		System.out.println("brand >>" +this.brand);
		System.out.println("color >>" +this.color);
		System.out.println("price >>" +this.price);
	}
	
}
/*
 * 자동차 클래스를 만든다.(별도의 파일로 생성)
 * 
 * 브랜드, 색상, 가격 정보를 저장해야함.
 * engineStart()라는 기능을 만들고 실행하면 "시동 켜짐"을 출력함
 */
public class Task01 {
	public static void main(String[] args) {
		Car c1 = new Car("samsung","White",3000000);
//		System.out.println(c1.brand);
//		System.out.println(c1.color);
//		System.out.println(c1.price);
		
		c1.printCarinfo();
		c1.engineStart();
		
		Car c2 = new Car("samsung","Black",1000000);
//		System.out.println(c2.brand);
//		System.out.println(c2.color);
//		System.out.println(c2.price);
		
		c2.printCarinfo();
		c2.engineStart();
		
		
	}

}
