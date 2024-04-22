package Input;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름을 입력해주세요 >> ");
	    String name = sc.next(); //next()는 무조건 문자열로 가져옴. 띄어쓰기x
		System.out.println(name + "님 안녕하세요");

	}

}
