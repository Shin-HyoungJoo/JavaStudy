package mid.one.lang.object.poly;

public class ObjectPolyExample1 {
	public static void main(String[] args) {
		Dog dog = new Dog();
		Car car = new Car();
		action(dog);
		action(car);
	}

	private static void action(Object obj) {
		// obj.sound(); //컴파일 오류, Object는 sound()가 없다.
		// obj.move(); //컴파일 오류, Object는 move()가 없다.
		
		// 객체에 맞는 다운캐스팅 필요
		if (obj instanceof Dog) {
			Dog dog = new Dog();
			dog.sound();
		} else if (obj instanceof Car) {
			Car car = new Car();
			car.move();
		}
	}
}
