package task01;

class Player {
	String name;
	String tname;
	String pst;
	int age;
	
	public Player(String name, String tname, String pst,int age) {
		this.name = name;
		this.tname = tname;
		this.pst = pst;
		this.age = age;
		
		
	}
	
//	public Player(String name, String tname, String pst, int age) {
//		super();
//		this.name = name;
//		this.tname = tname;
//		this.pst = pst;
//		this.age = age;
//	 shift + alt + s -> genarate Constructor using Fields... 
//	}

	void play() {
		System.out.println(this.name+"선수가 경기에 출전한다");
	}
	
	void standBy() {
		System.out.println(this.name+"선수가 벤치에서 대기한다");
	}
}

  
public class Task02 {
	public static void main(String[] args) {
		Player p1 = new Player("이강인","FC서울","공격수",27);
		
		p1.play();
		p1.standBy();
		
	}

}
