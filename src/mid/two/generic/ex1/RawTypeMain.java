package mid.two.generic.ex1;

public class RawTypeMain {
	public static void main(String[] args) {
		GenericBox integerBox = new GenericBox();	//raw type -> Object
		
		// GenericBox<Object> integerBox = new GenericBox<>(); // 권장
		integerBox.set(10);
		Integer result = (Integer) integerBox.get();
		System.out.println("result = " + result);
		//사용 X
	}
}
