package basic.construct;

public class BookMain2 {
	public static void main(String[] args) {
		Book2 book2 = Book2.builder()
				.title("제목")
				.author("저자")
				.pages(5)
				.build();
	}
}
