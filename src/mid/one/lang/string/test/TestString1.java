package mid.one.lang.string.test;

public class TestString1 {
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		String[] arr = { "hello", "java", "jvm", "spring", "jpa" };

		int sum = 0;

//		for (String str : arr) {
//			StringBuilder sb = new StringBuilder();
//			String result = sb.append(str).append(":").append(str.length()).toString();
//			System.out.println(result);
//			sum += str.length();
//		}
		
		for (String str : arr) {
			System.out.println(str + ":" +str.length());
			sum += str.length();
		}

		System.out.println("sum = " + sum);
		long endTime = System.currentTimeMillis();
		long result = endTime - startTime;

		System.out.println(result + "mills");
	}
}
