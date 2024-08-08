package mid.one.enumeration.ex2;

//Enum 클래스의 내부구조
public class ClassGrade {
	public static final ClassGrade BASIC = new ClassGrade();
	public static final ClassGrade GOLD = new ClassGrade();
	public static final ClassGrade DIAMOND = new ClassGrade();
	
	private ClassGrade() {}
}
