package oper;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String msg = "당신의 mbti는?\n"
				+ "1. ISFJ\n"
				+ "2. INFJ\n"
				+ "3. ESFP\n"
				+ "4. ENTJ\n"
				+ "선택 >> ";
		
		String isfj = "차분하고 인내심이 강하다.",
				infj = "통찰력이 높고 사람들에게 영감을 준다.",
				esfp = "호기심이 많고 개발적이다.",
				entj = "철저히 준비하고 활동적이다.",
				errMsg = "잘못 입력함!";
		
		int choice = 0;
		String result = "";
		
		System.out.print(msg);
		choice = sc.nextInt();
		
		result = choice == 1? isfj :
			choice == 2? infj :
				choice == 3? esfp :
					choice == 4? entj : errMsg;
		
		System.out.println(result);
						
		
				

	}

}
