package test;

class Data{
	int math;
	int eng;
	int kor;
	int grade;
	
	public Data(int math, int eng, int kor, int grade) {
		super();
		this.math = math;
		this.eng = eng;
		this.kor = kor;
		this.grade = grade;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}
	
	void sum() {
		int sum = 0;
		int evr = 0;
		
		sum = this.math + this.eng + this.kor;
		evr = sum / 3;
		
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + evr);
		
		
	}
	
	
	
	
}

public class Student {
	public static void main(String[] args) {
		Data sc1 = new Data(70,80,90,0);
		Data sc2 = new Data(60,50,100,0);
		
		sc1.sum();
		sc2.sum();
		
		
	}
}
