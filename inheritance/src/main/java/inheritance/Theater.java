package inheritance;

import java.util.ArrayList;
import java.util.LinkedList;

public class Theater {
    private String name;
    public static LinkedList<String> movieList = new LinkedList<>();
    public static LinkedList<Review> reviewList = new LinkedList<>();

    public Theater(String name){
        this.name = name;
    }
    // adds movie to the movie List
    public void addMovie(String movieName){
        movieList.add(movieName);
        return;
    }
    // removes move from the movie list
    public void removeMovie(String movieName) throws Exception{
        if (movieList.contains(movieName)) {
            movieList.remove(movieName);
            return;
        }
        throw new Exception("Movie not playing in the Theater");
    }
    // see all the movies playing in the theater
    public String seeAllMovies(){
        String output = "";
        for (String movie: movieList){
            output+= movie + "\n";
        }
        if (output == ""){
            return "No movies playing right now!";
        }
        return output;
    }
    // store the theater reviews
    public void addTheaterReview(Review review){
        reviewList.add(review);
    }
    public void addMovieReview(ReviewMovie reviewMovie){
        reviewList.add(reviewMovie);
    }

    public String showReviews(){
        String output = "Here are the reviews: ";
        for (Review rv: reviewList){
            output+= "\n"+rv;
        }
        return output;
    }
    public String toString(){
        return name + " is playing : \n" + seeAllMovies();
    }
}
