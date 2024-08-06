package poly.ex4;

public class AbstractMain {
	public static void main(String[] args) {
//		 추상클래스 생성 불가
//		 AbstractAnimal animal = new AbstractAnimal();
		
		 AbstractAnimal[] animals = {new Dog(),new Cat(),new Cow()};
		 
		 for (AbstractAnimal animal : animals) {
			 soundAnimal(animal);
		}
	}

	// 동물이 추가 되어도 변하지 않는 코드
	private static void soundAnimal(AbstractAnimal animal) {
		System.out.println("동물 소리 테스트 시작");
		animal.sound();
		animal.move();
		System.out.println("동물 소리 테스트 종료");
	}
}
