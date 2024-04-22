package ifTest;

import java.util.Scanner;

/*
 * 사용자에게 시험 점수를 입력받는다.
 * 90점 이상은 A
 * 70점 이상은 B
 * 50점 이상은 C
 * 나머지는 F를 출력한다.
 * 
 * 입력)
 * 점수 입력 >> 90
 * 학점은 'A'입니다.
 */
public class Task03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//내 문제풀이
//		 String score90 = "학점은 \'A\'입니다.",
//		 score70 = "학점은 \'B\'입니다.",
//		 score50 = "학점은 \'C\'입니다.",
//		  score0 = "학점은 \'F\'입니다.";
//		 int input = 0;
//		 String result = "";
//		 
//		 System.out.print("점수 입력 >>");
//		 input = sc.nextInt();
//		 
//		 if(input >= 90) {
//			 result = score90;
//		 }else if(input >=70) {
//			 result = score70;
//		 }else if(input >=50) {
//			 result = score50;		
//		 }else {
//			 result = score0;
//		 }
//		 System.out.println(result);
//		 
		//강사님 풀이예시
	      int score = 0;
	      String grade = "";
	      
//	      1. 사용자에게 점수를 입력받는다.
	      System.out.print("점수 입력 >> ");
	      score = sc.nextInt();
	      
//	      2. 점수를 확인해서 학점을 구한다.
	      if(score >= 90) {
	         grade = "A";
	      }else if(score >= 70) {
	         grade = "B";
	      }else if (score >= 50) {
	         grade = "C";
	      }else {
	         grade = "F";
	      }
//	      3. 구한 학점을 출력한다.
	      System.out.println("내 학점은 \' " + grade +" \'입니다.");
		 
		 
		

	}

}
