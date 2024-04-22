package task;

public class MemberDto {
	public MemberDto(int memberNumber, String memberid, String memberpassword, String memberName, int memberAge,
			String memberPhoneNumber) {
		super();
		this.memberNumber = memberNumber;
		this.memberId = memberid;
		this.memberPassword = memberpassword;
		this.memberName = memberName;
		this.memberAge = memberAge;
		this.memberPhoneNumber = memberPhoneNumber;
	}
	private int memberNumber;
	private String memberId;
	private String memberPassword;
	private String memberName;
	private int memberAge;
	private String memberPhoneNumber;
	public int getMemberNumber() {
		return memberNumber;
	}
	public String getMemberId() {
		return memberId;
	}
	public String getMemberPassword() {
		return memberPassword;
	}
	public String getMemberName() {
		return memberName;
	}
	public int getMemberAge() {
		return memberAge;
	}
	public String getMemberPhoneNumber() {
		return memberPhoneNumber;
	}
	@Override
	 public String toString() {
	      return memberNumber + ", " + memberId + ", "
	            + memberPassword + ", " + memberName + ", " + memberAge + ", "
	            + memberPhoneNumber;
	   }
	
	public static MemberDto memberDto (String line) {
		String[] arData = line.split(", ");
		new MemberDto(Integer.parseInt(arData[0]), arData[1], arData[2], arData[3], Integer.parseInt(arData[4]), arData[5]);
	}

	
}
