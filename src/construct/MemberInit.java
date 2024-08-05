package construct;

public class MemberInit {
	String name;
	int age;
	int grade;

	void initMember(String name, int age, int grade) {
		this.name = name;
		this.age = age;
		this.grade = grade;
	}	//this는 자기자신의 참조값. X002.name = name , X002.age = age...이 된다.
}
