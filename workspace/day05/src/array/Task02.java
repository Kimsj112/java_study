package array;

import java.util.Scanner;

public class Task02 {

	public static void main(String[] args) {
		// 0,1,2,3,4,0,1,2,3,4 배열에 담고 출력(반복문 사용)
		// 0&5 == 0
		// 1&5 == 1
		// 2&5 == 2
		// 3&5 == 3
		// 4&5 == 4
		// 5&5 == 5
//		int[] arData = new int[10];
//		
//		for(int i=0; i<arData.length; i++) {
//			arData[i] = i%5;
//			System.out.println(arData[i]);
//		}
//		
		
		// A~F까지 배열에 넣고 출력
//		char[] arData = new char[6];
//		
//		for(int i=0; i<arData.length; i++) {
//			arData[i] = (char)('A' + i);
//			
//			System.out.println(arData[i]);
//		}
		
	
		// A~F까지 중 C 제외하고 배열에 담고 출력
//		char[] arData = new char[5];
//		int tmp = 0;
//
//		for(int i=0; i<arData.length; i++) {
//			tmp = i;
//			
//			if(tmp > 1) { tmp++;}
//			
//			arData[i] = (char)('A'+tmp);
//			
//			System.out.println(arData[i]);
//		}
		// 5개의 정수를 입력한 뒤 배열에 담고 최대값과 최소값 출력
		Scanner sc = new Scanner(System.in);
		int[] ar = new int[5];
		int max=0, min=0;
		
		for(int i=0;i<ar.length; i++) {
			System.out.print(i+1 +"번 째의 정수값 >> ");
			ar[i] = sc.nextInt();
		}
		
		max = ar[0];
		min = ar[0];
		
		for(int i=1; i<ar.length; i++) {
			if(max < ar[i]) {max = ar[i];}
			if(min > ar[i]) {min = ar[i];}
			
			
		}
		
		System.out.println("max : "+max);
		System.out.println("min : " +min);
		
		

	}

}
