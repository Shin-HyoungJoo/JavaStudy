package basic.oop;

public class RectangleOopMain {
	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle();
		
		rectangle.width = 5;
		rectangle.height = 8;
		
		int area = rectangle.calculateArea();
		int perimeter = rectangle.calculatePerimeter();
		boolean square = rectangle.isSquare(); 
	}
}
