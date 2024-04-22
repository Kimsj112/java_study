package array;

import java.util.Scanner;

public class Task01 {

	public static void main(String[] args) {
//		100~1까지의 값 배열에 넣고 출력하기


		int[] ar1 = new int[100];
		
		for(int i=0; i<ar1.length; i++) {
			ar1[i] = ar1.length-i;
		}
		
		for(int i=0; i<ar1.length; i++) {
			System.out.println(ar1[i]);
		}
		
		System.out.println("================================");
		
//		1~10까지 값을 배열에 넣고 총 합 구하기
		int[] ar2 = new int[10];
		int total = 0;
		
		for(int i=0; i<ar2.length; i++) {
			ar2[i] = i+1; 
		}
			
		for(int i=0; i<ar2.length; i++) {
			total += ar2[i];
		}
		
		System.out.println(total);
		
		System.out.println("=================================");
		
//		3명의 수학점수를 사용자에게 입력받아 배열에 저장하고 평균 점수 출력하기
		Scanner sc = new Scanner(System.in);
		int[] ar = new int[3];
		int total1 =0;
		int average = 0;
		
		//TODO 1. 세명의 수학점수를 반복문으로 입력받음
		for(int i =0; i< ar.length; i++) {
			System.out.print(i+1 +"번 학생의 수학점수 >> ");
			ar[i] = sc.nextInt();
		}
		//TODO 2. 전체 총합을 구함
		for(int i=0;i<ar.length;i++) {
			total1 += ar[i];
		}
		//TODO 3. 평균점수를 출력
		System.out.println("평균 >> "+ (double)total1/ar.length);
		
		
		
		}
		
		

 	}


