package extends1.ex;

public class Movie extends Item{
	private String directior;
	private String actor;
	
	public Movie(String name, int price, String directior, String actor) {
		super(name, price);
		this.directior = directior;
		this.actor = actor;
	}

	public String getDirectior() {
		return directior;
	}

	public String getActor() {
		return actor;
	}
	
	public void print() {
		super.print();
		System.out.println("- 감독:" + this.directior + ", 배우:" + this.actor);
	}
	
}
