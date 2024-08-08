package mid.one.enumeration.ex3;

public class EnumRefMain {
	//enum은 객체 생성X enum클래스에 static final로 등록된 필드가 new class()객체를 가지고 있기 때문에 해당하는 필드만 호출해서 사용하는 형태이다.(참조값이 고정이다.)
	public static void main(String[] args) {
		System.out.println("class BASIC = " + Grade.BASIC.getClass());
		System.out.println("class GOLD = " + Grade.GOLD.getClass());
		System.out.println("class DIAMOND = " + Grade.DIAMOND.getClass());
		System.out.println("ref BASIC = " + refValue(Grade.BASIC));
		System.out.println("ref GOLD = " + refValue(Grade.GOLD));
		System.out.println("ref DIAMOND = " + refValue(Grade.DIAMOND));
	}

	private static String refValue(Object grade) {
		return Integer.toHexString(System.identityHashCode(grade));
		// System.identityHashCode(grade) : grade의 참조값을 숫자형태로 반환
		// Integer.toHexString(num) : num을 16진수로 변환 후 반환한다 
	}
}
