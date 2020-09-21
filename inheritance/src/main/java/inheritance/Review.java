package inheritance;

public class Review {
    private String body;
    private String author;
    private int stars;
    private int reviewCount;

    public Review(String body, String author, int stars){
        this.body = body;
        this.author = author;
        this.stars = stars;
        reviewCount+=1;
    }

    public String toString(){
        return String.format("%d. Stars: %d  By %s : %s", reviewCount, stars, author, body);
    }
}
