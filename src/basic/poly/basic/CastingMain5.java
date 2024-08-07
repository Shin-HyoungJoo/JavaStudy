package basic.poly.basic;

//다운캐스팅을 자동으로 하지 않는 이유
public class CastingMain5 {
	public static void main(String[] args) {
		Parent parent1 = new Parent();
		System.out.println("parent1 호출");
		call(parent1);
		Parent parent2 = new Child();
		System.out.println("parent2 호출");
		call(parent2);
	}

	private static void call(Parent parent) {
		parent.parentMethod();
		//다운 캐스팅시 instanceof로 체크한 뒤 수행하는게 안전하다.
		if (parent instanceof Child) {
//		if (parent instanceof Child child) {	java16의 경우 바로 선언 가능
			System.out.println("Child 인스턴스 맞음");
			Child child = (Child) parent;
			child.childMethod();
		}
	}
}
