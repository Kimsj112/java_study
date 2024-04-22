package classTest;

public class Student {
	String name;
	String grade;
	int math, kor, eng;
	
	void printTotal() {
		int total = kor + eng + math;
		System.out.print("총 합 >> "+ total);
	}

}
