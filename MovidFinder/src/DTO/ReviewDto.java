package DTO;

public class ReviewDto {
    private String title;
    private String content;

    private ReviewDto(String title, String content) {
        this.title = title;
        this.content = content;
    }
}
