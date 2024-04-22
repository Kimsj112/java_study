package tvTest;

public class Tv {
	int ch,vol,price;
	String color;
	boolean power;
	
	//기본 생성자 -> 안만들어도 만들어져 있는 것
	public Tv(int ch, int vol, String color) {
		System.out.println("기본 생성자 실행!!!");
		this.ch = ch;
		this.vol = vol;
		this.color = color;
	}

}
