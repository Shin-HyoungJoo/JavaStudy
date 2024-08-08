package mid.one.lang.string.test;

public class TestString9 {
	public static void main(String[] args) {
		String email = "hello@example.com";
		
		String[] emailArr = email.split("@");
		
		System.out.println("ID : " + emailArr[0]);
		System.out.println("Domain : " + emailArr[1]);
	}
}
