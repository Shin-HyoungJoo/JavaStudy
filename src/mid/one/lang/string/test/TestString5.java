package mid.one.lang.string.test;

public class TestString5 {
	public static void main(String[] args) {
		String str = "hello.txt";
		String ext = ".txt";
		
		int index = str.indexOf(ext);

		String hello = str.substring(0, index);
		String txt = str.substring(index);

		System.out.println("filename = " + hello);
		System.out.println("extName = " + txt);
	}
}
