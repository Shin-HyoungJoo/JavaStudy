package chapter1;

import java.util.ArrayList;

public class Question1 {
    public static void main(String[] args) {
        MovieReview movie1 = new MovieReview("인셉션", "인생은 무한루프");
        MovieReview movie2 = new MovieReview("어바웃 타임", "인생 시간 영화");

        MovieReview[] movies = {movie1, movie2};

        for (MovieReview movie : movies) {
            System.out.println("영화 제목: \"" + movie.getTitle() + "\", 리뷰: \"" + movie.getReview() + "\"");
        }
    }
}
