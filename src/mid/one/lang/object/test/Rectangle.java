package mid.one.lang.object.test;

import java.util.Objects;

public class Rectangle {
	private final int width;
	private final int height;
	
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Rectangle other = (Rectangle) obj;
		return height == other.height && width == other.width;
	}

	@Override
	public String toString() {
		return "Rectangle {width=" + width + ", height=" + height + ">";
	}

}
