package poly.ex6;

public class Chicken extends AbstractAnimal implements Fly{

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("닭 날기");
	}

	@Override
	public void sound() {
		// TODO Auto-generated method stub
		System.out.println("꼬끼오");
		
	}
	

}
