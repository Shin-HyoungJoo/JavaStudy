package basic.poly.ex1;

public class AnimalSoundMain2 {
	public static void main(String[] args) {
		Dog dog = new Dog();
		Cat cat = new Cat();
		Cow cow = new Cow();
		
		soundAnimal(dog);
		soundAnimal(cat);
		soundAnimal(cow);

	}

	private static void soundAnimal(Animal animal) {	// 다운 캐스팅, 다형적 참조
		System.out.println("동물 소리 테스트 시작");
		animal.sound();	//animal은 주소를 타고 넘어가 new Dog()안에 있는 Animal을 가리키지만 오버라이드 덕분에 Dog의 sound()를 실행시킨다.  
		System.out.println("동물 소리 테스트 종료");
	}
}
