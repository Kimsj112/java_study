package switchTest;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int number = 0;
		String result = "";
		
		System.out.print("1부터 4까지 정수를 입력 >> ");
		number = sc.nextInt();
		
		switch(number) {
		case 1, 3: //jdk17 비교적 최신버전을 사용해서 이 코드도 사용가능!
			result = "홀수";
			break;
		case 2: case 4:
			result = "짝수";
			break;
			default :
				result = "잘못 입력함!";
		}
		
		System.out.println(result);
	}

}
