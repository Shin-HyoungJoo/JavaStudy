package mid.one.lang.clazz;

public class ClassCreateMain {
	public static void main(String[] args) throws Exception {
		// Class helloClass = Hello.class;
		Class helloClass = Class.forName("mid.one.lang.clazz.Hello");
		Hello hello = (Hello) helloClass.getDeclaredConstructor().newInstance();
		String result = hello.hello();
		System.out.println("result = " + result);
	}
}
