package lambda02;

/*
 * FuncInter3를 이용하여 다음 람다식을 만들고 실행한다
 * - 2개의 정수를 매개변수로 받아 곱한 결과를 반환하는 람다식
 * 
 * FuncInter4를 생성하고 다음 람다식을 실행한다
 * -인터페이스에 2개의 문자열을 매개변수로 전달 받는 추상메소드(combineString)을 선언한다
 * -람다식으로 재정의하여 2개의 문자열을 연결하고 출력한다
 */
public class Tast01 {
	public static void main(String[] args) {
		FuncInter3 f3 = (num1, num2)->{
			return num1*num2;
		};
		
		System.out.println(f3.addNumber(5, 3));
//		int result = f3.addNumber(5, 2);
//		System.out.println(result);
		
		FuncInter4 f4 = (st1, st2) -> {
			System.out.println(st1 + st2);
			return st1 + st2;
			};
		
		f4.combineString("안녕", "하세요");
		
		
	 
		
		
	}
}
