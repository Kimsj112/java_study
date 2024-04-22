package Input;

import java.util.Scanner;

/*
 * 두 정수를 입력받고 합을 출력하기
 * 
 * 입력)
 * 정수1 입력 : 20
 * 정수2 입력 : 40
 * 
 * 출력)
 * 두 정수의 합은 60입니다.
 */
public class Task01 {

	public static void main(String[] args) {
		/*
		 * 기본값
		 * int : 0
		 * double : 0.0
		 * char : ''
		 * boolean : false
		 * String : "", null
		 * 
		 */
		Scanner sc = new Scanner(System.in);
		int num1=0,num2=0; //만듬과 동시에 초기화
		
		
		System.out.print("정수1 입력 : ");
		num1 = sc.nextInt();
		System.out.print("정수2 입력 : ");
		num2 = sc.nextInt();
		
		System.out.println("두 정수의 합은 " +( num1 + num2)+"입니다.");

	}

}
