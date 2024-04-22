package switchTest;

public class Ex01 {

	public static void main(String[] args) {
		int num1 = 10;
		
		switch(num1) {
		case 1:
			System.out.println("1이다!");
			break;
		case 2:
			System.out.println("2이다!");
			break;
		case 3:
			System.out.println("10이다!");
			break;
			default :
				System.out.println("일치 안한다!");
				//break;를 걸어도 되지만 어차피 마지막 문장이어서 안써도 됌.
		}

	}

}
