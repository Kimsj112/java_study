package task;
//멀티커서 = alt +shift+a -> shift 누르고 아래화살표 다시 alt + s+a

public class UserDto{
	public UserDto(String id, String pw, String name, int age) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.age = age;
	}

	private String id;
	private String pw;
	private String name;
	private int age;
	
	
	
	public String getId() {
		return id;
	}
	
	public String getPw() {
		return pw;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	
	
	}	

