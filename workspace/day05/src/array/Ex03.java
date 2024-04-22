package array;

public class Ex03 {

	public static void main(String[] args) {
		int[] ar = null; //null = 주소의 default 값(디폴트값)		
		ar = new int[5];
		
		System.out.println(ar);
		
		ar[0] = 10;
		
		System.out.println(ar[0]);
		
		String str = null; //"" 참조변수여서 ㄱㄴ
		int num = 0; //불가능
		
		System.out.println(ar.length);

	}

}
