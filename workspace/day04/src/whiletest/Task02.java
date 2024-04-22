package whiletest;

import java.util.Scanner;

/*
 * 양의 정수를 입력받는다.
7씩 빼서 -10 이하로 떨어지는 수를 만들려면
얼마나 반복 해야하는지 구하는 프로그램을 만들기

입력 )
양의 정수 입력 >> 10

출력 )
3
 */
public class Task02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0, cnt = 0;
		
		System.out.print("양의 정수 입력 >> ");
		num = sc.nextInt();
		
		while(num > -10) {
			num -= 7;
			cnt++;
			
//			if(num <= -10) {
//				break; / while (true) 로 진행했을때
			}
			
		System.out.print(cnt);
		}
		

	}


