package inheritance;

public class ReviewMovie extends Review{
    private String movie;
    public ReviewMovie(String movie, String body, String author, int stars1){
        super(body, author, stars1);
        this.movie = movie;
    }
    public String toString(){
        return String.format("Movie name: %s  Review: %s  By: %s Stars: %d", movie, Review.getReviewBody(), Review.getReviewAuthor(), Review.getReviewStars());
    }
}
