package task;

public class Main {
	public static void main(String[] args) throws Exception {
		MemberDto memberDto1 = new MemberDto(1,"aaa","1234","홍길동",12,"01011111111");
		MemberDto memberDto2 = new MemberDto(2,"bbb","1234","김철수",22,"01022222222");
		
		MemberDao memberDao = new MemberDao();
		
//		memberDao.join(memberDto1);
//		memberDao.join(memberDto2);
		
		System.out.println(memberDao.checkId("bbb"));
		System.out.println(memberDao.findIdByPhoneNumber("01011111111"));
		System.out.println(memberDao.findPassword("aaa", "010111111111"));
	}
}
