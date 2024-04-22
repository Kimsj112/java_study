package list;

import java.util.Random;

public class RandomTest {
	public static void main(String[] args) {
		Random r = new Random();
		
		System.out.println(r.nextInt()); //범위가 큼
		System.out.println(r.nextInt(20)); //0~19까지의 랜덤 숫자
		System.out.println(r.nextInt(20)+1); //1~ 20
		
	}
}
