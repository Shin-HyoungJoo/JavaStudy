package mid.one.lang.string.test;

public class TestString4 {
	public static void main(String[] args) {
		String str = "hello.txt";
		
		String hello = str.substring(0, 5);
		String txt = str.substring(5);

		System.out.println("filename = " + hello);
		System.out.println("extName = " + txt);
	}
}
