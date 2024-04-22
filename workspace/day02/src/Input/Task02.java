package Input;

import java.util.Scanner;

public class Task02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = 0,num2=0;
		
		
		System.out.print("숫자1 >>");
		num1 = sc.nextInt(); // next()와 동일 띄어쓰기x
		System.out.print("숫자2 >>");
		num2 = sc.nextInt();
		
		System.out.println("합 : "+ (num1 + num2));

	}

}
