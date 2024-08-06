package construct;

//빌더
public class Book2 {
    private String title;
    private String author;
    private int pages;

    // private 생성자
    private Book2(Builder builder) {
        this.title = builder.title;
        this.author = builder.author;
        this.pages = builder.pages;
    }

    // Builder 클래스
    public static class Builder {
        private String title;
        private String author;
        private int pages;

        // Builder 생성자
        public Builder() {}

        public Builder title(String title) {
            this.title = title;
            return this;
        }

        public Builder author(String author) {
            this.author = author;
            return this;
        }

        public Builder pages(int pages) {
            this.pages = pages;
            return this;
        }

        public Book2 build() {
            return new Book2(this);
        }
    }

    // 정적 메서드로 Builder 반환
    public static Builder builder() {
        return new Builder();
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPages() {
        return pages;
    }
}
