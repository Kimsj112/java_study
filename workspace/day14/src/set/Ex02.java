package set;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

class Student{
	private int num;
	private String name;
	
	public Student(int num, String name) {
		super();
		this.num = num;
		this.name = name;
		
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, num);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(name, other.name) && num == other.num;
	}	
}

public class Ex02 {
	public static void main(String[] args) {
		Set<Student> set = new HashSet<Student>();
		
		Student s1 = new Student(1,"홍길동");
		Student s2 = new Student(1,"홍길동");
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		set.add(s1);
		set.add(s2);
		
		System.out.println(set.size());
	}
}
