package print;

public class Ex02 {

	public static void main(String[] args) {
		int age = 10;
		
		System.out.printf("제 나이는 %d살 입니다.\n",age);
		System.out.printf("내 평균 점수는 %f점 입니다.\n", 88.123);
		System.out.printf("제 학점은 %c입니다\n",'A');
		
		System.out.printf("내 평균 점수는 %.2f점 입니다.\n", 88.123); //소수점 2자리까지 표시하겠다는 옵션
		System.out.printf("제 나이는 %10d살 입니다.\n",age);  //10칸을 만들갰다는 옵션
		

	}

}
