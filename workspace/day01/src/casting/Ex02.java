package casting;

public class Ex02 {

	public static void main(String[] args) {
		System.out.println(1+2);
		System.out.println(1+0.0);
		System.out.println(10/3); // 정수로 나옴 , 정수/정수로해서
		System.out.println(10%3); // 나머지가 나옴
		System.out.println(10/3.0); // 정수와 나머지가 나옴 ,정수/실수로해서
		
		
		//문자의 자동 형변환
		System.out.println('A'+1);     //(12~18)문자 <-> 정수 , 아스키코드표에 의하여 강제 형변환
		System.out.println((int)'A');	//한글은 x -> 유니코드는 가능(자바는 유니코드 기반)
		//아스키 다음에 유니코드 탄생
		
		char ch = 65;
		System.out.println(ch);
		int number = 'a';
		System.out.println(number);

	}

}
