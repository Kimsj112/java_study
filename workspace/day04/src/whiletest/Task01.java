package whiletest;

import java.util.Scanner;

public class Task01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = 0,num2 = 0;
		
		while(true) {
			System.out.print("두 수를 입력 >> ");
			num1 = sc.nextInt();
			num2 = sc.nextInt();
			
			if(num1 < 0 || num2 <0) {break;}
			
			
			System.out.println(num1*num2);
		}

	}

}
